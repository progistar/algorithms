package leetcode_daily;

class KthLargest_20220408 {

	// brute force...
	// O(n^2)
	
    public int[] array = new int[20001];
    public int k = 0;
    
    public KthLargest_20220408(int k, int[] nums) {
        this.k = k;
        for(int i=0; i<nums.length; i++) {
            array[nums[i] + 10000]++;
        }
    }
    
    public int add(int val) {
        array[val + 10000]++;
        int returnVal = 0;
        int kCount = 0;
        for(int i=array.length-1; i>0; i--) {
            if(array[i] > 0) {
                kCount += array[i];
                
                if(kCount >= this.k) {
                    returnVal = i;
                    break;
                }
            }
        }
        
        return returnVal - 10000;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

public class _20220408_p703 {

}
