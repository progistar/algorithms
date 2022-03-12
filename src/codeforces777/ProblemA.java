package codeforces777;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static String maxVal = "0";
	
	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine());
		int[] cases = new int[n];
		
		for(int i=0; i<n; i++) {
			cases[i] = Integer.parseInt(BR.readLine());
		}
		
		BR.close();
		
		for(int i=0; i<n; i++) {
			int t = cases[i];
			
			boolean twoOne = true;
			StringBuilder answer = new StringBuilder();
			while(t > 0) {
				if(twoOne) {
					t -= 2;
					
					if(t >= 0) {
						answer.append(2);
					}
					
					twoOne = false;
				} else {
					t -= 1;
					
					if(t >= 0) {
						answer.append(1);
					}
					
					twoOne = true;
				}
			}
			
			if(t == 0) {
				System.out.println(answer.toString());
			} else {
				answer.setLength(0);
				twoOne = false;
				t = cases[i];
				while(t > 0) {
					if(twoOne) {
						t -= 2;
						
						if(t >= 0) {
							answer.append(2);
						}
						
						twoOne = false;
					} else {
						t -= 1;
						
						if(t >= 0) {
							answer.append(1);
						}
						
						twoOne = true;
					}
				}
				
				if(t == 0) {
					System.out.println(answer.toString());
				}
			}
			
		}
	}
	
}
