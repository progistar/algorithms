package codeforces776_div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemE {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=0; i<t; i++) {
			BR.readLine();
			
			String[] fields = BR.readLine().split("\\s");
			int n = Integer.parseInt(fields[0]);
			int d = Integer.parseInt(fields[1]);
			
			fields = BR.readLine().split("\\s");
			
			int[] interval = new int[n];
			int minIdx = 0;
			int prev = 0;
			for(int j=0; j<fields.length; j++) {
				int k = Integer.parseInt(fields[j]);
				if(j == 0) {
					interval[j] = (k-1);
				} else {
					interval[j] = (k-prev - 1);
				}
				
				
				prev = k;
			}
			
			
		}
		
		BR.close();
	}
}
