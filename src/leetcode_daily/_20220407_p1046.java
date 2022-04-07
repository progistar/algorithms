package leetcode_daily;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution_20220407 {
    public int lastStoneWeight(int[] stones) {
        int leftOne = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder());
        
        for(int i=0; i<stones.length; i++) {
        	pQueue.add(stones[i]);
        }
        
        leftOne = pQueue.poll();
        
        while(!pQueue.isEmpty()) {
        	int newOne = pQueue.poll();
        	
        	if(leftOne > newOne) {
        		pQueue.add(leftOne - newOne);
        	} else {
        		leftOne = 0;
        	}
        	
        	if(!pQueue.isEmpty()) {
        		leftOne = pQueue.poll();
        	}
        }
        
        return leftOne;
        
    }
}

public class _20220407_p1046 {

	public static void main(String[] args) {
		Solution_20220407 a = new Solution_20220407();
		int[] stones = {2, 7, 4, 1, 8, 1};
		System.out.println(a.lastStoneWeight(stones));
	}
}
