package leetcode_daily;

import java.io.IOException;

class Solution4 {
    public String getSmallestString(int n, int k) {
    	StringBuilder str = new StringBuilder();
    	solver(n, k, str);
    	
    	return str.reverse().toString();
    }
    
    public void solver (int n, int k, StringBuilder str) {
    	
    	if(n == 0) {
    		return;
    	}
    	
    	int allowableK = k - n + 1;
    	char a = 0;
    	
    	if(allowableK > 26) {
    		a = 'z';
    	} else {
    		a = (char) ((allowableK-1) + 'a');
    	}
    	str.append(a);
    	
    	solver(n-1, k- (a-'a'+1), str);
    }
}

public class _20220322_p1663 {

	public static void main(String[] args) throws IOException {
		Solution4 s = new Solution4();
		
		String str = s.getSmallestString(5, 73);
		System.out.println(str);
	}
}
