package leetcode_daily;

import java.util.ArrayList;
import java.util.Hashtable;

class Solution_20220409 {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer, Integer> counts = new Hashtable<Integer, Integer>();
        int[] frequency = new int[100_001];
            
        for(int i=0; i<nums.length; i++) {
            Integer freq = counts.get(nums[i]);
            if(freq == null) {
                freq = 0;
            }
            freq++;
            frequency[freq] ++;
            frequency[freq-1]--;
            
            counts.put(nums[i], freq);
        }
        
        Hashtable<Integer, Boolean> hash = new Hashtable<Integer, Boolean>();
        for(int j=frequency.length-1; j>0; j--) {
            if(frequency[j] > 0) {
            	k -= frequency[j];
                if(k >= 0) {
                    hash.put(j, true);
                } else {
                	break;
                }
            }
        }
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        counts.forEach((val, count)->{
            if(hash.get(count) != null) {
            	list.add(val);
            }
        });
        
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	ans[i] = list.get(i);
        }
        
        return ans;
    }
}

public class _20220409_p347 {

	public static void main(String[] args) {
		Solution_20220409 a = new Solution_20220409();
		int[] nums = {4,1,-1,2,-1,2,3};
		int k= 2;
		System.out.println(a.topKFrequent(nums, k).length);
	}
}
