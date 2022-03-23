package leetcode_daily;

class Solution5 {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        
        while(target > startValue) {
            ans ++;
            
            if(target % 2 == 1) {
                target++;
            } else {
                target /= 2;
            }
        }
        
        return ans + startValue - target;
    }
}

public class _20220323_p991 {

}
