package atCoder_ABC246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProblemC {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String[] fields = BR.readLine().split("\\s");
		
		int N = Integer.parseInt(fields[0]);
		int K = Integer.parseInt(fields[1]);
		int X = Integer.parseInt(fields[2]);

		fields = BR.readLine().split("\\s");
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0; i<fields.length; i++) {
			pQueue.add(Integer.parseInt(fields[i]));
		}
		
		BR.close();
		
		while(K != 0) {
			int value = pQueue.poll();
			if(value == 0) {
				break;
			}
			
			int count = value/X;
			if(count == 0) {
				count = 1;
			}
			if(K < count) {
				count = K;
			}
			
			pQueue.add(Math.max(0, value-X*count));
			K -= count;
		}
		
		long totalCost = 0;
		while(!pQueue.isEmpty()) {
			totalCost += pQueue.poll();
		}
		
		System.out.println(totalCost);
	}
}
