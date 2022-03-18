package codeforces635;

import java.io.IOException;

class Solution {
    
    public int maxMatch = 0;
    
    public String removeDuplicateLetters(String s) {
        char[] chars = new char[26];
        
        for(int i=0; i<s.length(); i++) {
            chars[s.charAt(i)-'a'] = s.charAt(i);
        }
        
        for(int i=0; i<chars.length; i++) {
            if(chars[i] != 0) {
                maxMatch++;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        solve(chars, s, 0, new char[26], ans);
        
        return ans.toString();
    }
    
    public boolean solve (char[] chars, String s, int idx, char[] consume, StringBuilder ans) {
        if(ans.length() == maxMatch) {
            return true;
        }
        
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == 0) continue;
            if(consume[i] == 1) continue;
            
            for(int j=idx; j<s.length(); j++) {
                if(chars[i] == s.charAt(j)) {
                    consume[i] = 1;
                    ans.append(chars[i]);
                    if(solve(chars, s, j+1, consume, ans)) {
                        return true;
                    }
                    ans.setLength(ans.length()-1);
                    consume[i] = 0;
                }
            }
        }
        
        return false;
    }
}

public class ProblemB {

	public static void main(String[] args) throws IOException {
		Solution s = new Solution();
		System.out.println(s.removeDuplicateLetters("mitnlruhznjfyzmtmfnstsxwktxlboxutbic"
));
	}
}
