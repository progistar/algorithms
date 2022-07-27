package atCoder_ABC260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ProblemD_DrawYourCards {


	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ns = BR.readLine().split("\\s");
		String[] nums = BR.readLine().split("\\s");
		
		BR.close();
		
		int N = Integer.parseInt(ns[0]);
		int K = Integer.parseInt(ns[1]);
		
		int[] cards = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			cards[i] = Integer.parseInt(nums[i]);
		}
		
		
 	}
}
