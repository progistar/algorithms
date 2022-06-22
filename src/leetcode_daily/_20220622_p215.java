package leetcode_daily;

import java.util.Arrays;


class Solution_20220622 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

public class _20220622_p215 {

}
