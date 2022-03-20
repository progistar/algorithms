package leetcode_medium;
import java.util.LinkedList;
import java.util.Hashtable;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> queue = new LinkedList<Character>();
        
        int maxLen = 0;
        Hashtable<Character, Boolean> checkChar = new Hashtable<Character, Boolean>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            queue.addLast(c);
            if(checkChar.get(c) == null) {
                    checkChar.put(c, true);
            } else {
                while(!queue.isEmpty()){
                    char qc = queue.poll();
                    if(qc == c) {
                        break;
                    } else {
                        checkChar.remove(qc);
                    }
                }
            }
            
            maxLen = Math.max(maxLen, queue.size());
        }
        
        return maxLen;
    }
}

public class Problem3_LongestSubstring {

	/**
	 * Is more elegant way? <br>
	 * 
	 * 
	 */
}
