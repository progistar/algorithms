package leetcode_daily;

import java.io.IOException;

class Solution_20220403 {
    public static boolean validPalindrome(String s) {
        int leftMostIdx = 0;
        int rightMostIdx = s.length()-1;
        int diffCnt = 0;
        
        boolean isPal = true;
        while(leftMostIdx < rightMostIdx) {
            if(s.charAt(leftMostIdx) != s.charAt(rightMostIdx)) {
                if(diffCnt == 1) {
                    isPal = false;
                    break;
                }
                
                diffCnt++;
                if(s.charAt(leftMostIdx+1) == s.charAt(rightMostIdx)) {
                    leftMostIdx++;
                } else if(s.charAt(leftMostIdx) == s.charAt(rightMostIdx-1)) {
                    rightMostIdx--;
                } else {
                    isPal = false;
                    break;
                }
            }
            
            leftMostIdx++;
            rightMostIdx--;
        }
        
        if(!isPal) {
        	leftMostIdx = 0;
            rightMostIdx = s.length()-1;
            diffCnt = 0;
            
            isPal = true;
            while(leftMostIdx < rightMostIdx) {
                if(s.charAt(leftMostIdx) != s.charAt(rightMostIdx)) {
                    if(diffCnt == 1) {
                        isPal = false;
                        break;
                    }
                    
                    diffCnt++;
                    if(s.charAt(leftMostIdx) == s.charAt(rightMostIdx-1)) {
                	rightMostIdx--;
                    } else if(s.charAt(leftMostIdx+1) == s.charAt(rightMostIdx)) {
                        leftMostIdx++;
                    } else {
                    	isPal = false;
                        break;
                    }
                }
                
                leftMostIdx++;
                rightMostIdx--;
            }
        }
        
        return isPal;
    }
}



public class _20220403_p680 {

	public static void main(String[] args) throws IOException {
		String str = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
		System.out.println(Solution_20220403.validPalindrome(str));
	}
}
