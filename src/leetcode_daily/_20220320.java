package leetcode_daily;

class Solution {
    public int subTask(int[] tops, int[] bottoms) {
        int[] rotCount = new int[6];
        
        for(int i=0; i<rotCount.length; i++) {
            rotCount[i] = Integer.MAX_VALUE;
        }
        
        for(int i=1; i<=6; i++) {
            boolean isBreak = false;
            for(int j=0; j<tops.length; j++) {
                if(tops[j] != i) {
                    if(bottoms[j] == i) {
                        if(rotCount[i-1] == Integer.MAX_VALUE) {
                            rotCount[i-1] = 0;
                        }
                        rotCount[i-1]++;
                    } else {
                        rotCount[i-1] = Integer.MAX_VALUE;
                        isBreak = true;
                        break;
                    }
                }
                
                if(!isBreak && rotCount[i-1] == Integer.MAX_VALUE) {
                    rotCount[i-1] = 0;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<rotCount.length; i++) {
            min = Math.min(rotCount[i], min);
        }
        
        return min;
    }
    
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int min1 = subTask(tops, bottoms);
        int min2 = subTask(bottoms, tops);
        
        int min = Math.min(min1, min2);
        
        if(min == Integer.MAX_VALUE) {
            min = -1;
        }
        
        return min;
    }
}

public class _20220320 {
	/**
	 * The maximum cases is limited to 6. <br>
	 * Just iterate 1 to 6 and check it. <br>
	 * 
	 * 
	 * 
	 */
}
