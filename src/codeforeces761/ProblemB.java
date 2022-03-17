package codeforeces761;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {
	
/*
 * a + b + c = n
 * gcd(a,b) = c
 * 
 * KA + KB + K = KN
 * K(A+B+1) = K(N)
 * 
 * A+B+1 = odd
 * => A == B
 * 
 * A+B+1 = even
 * => A /= B
 */
	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(BR.readLine());
		int[] problems = new int[t];
		
		for(int i=0; i<t; i++) {
			problems[i] = Integer.parseInt(BR.readLine());
		}
		
		BR.close();
		
		StringBuilder output = new StringBuilder();
		for(int i=0; i<t; i++) {
			int n = problems[i];
			
			// prime number
			int limit = (int)Math.sqrt(n);
			limit = 1;
			for(int k=limit; k >= 1; k--) {
				if(n%k == 0) {
					int a = 0;
					int b = 0;
					int N = n/k;
					
					boolean isFound = false;
					// a + b + 1 = N
					for(int j=2; j<=N-2; j++) {
						a = j;
						b = N - a - 1;
						
						if(a!=b && b!=1 && gcd(a,b) == 1) {
							output.append((a*k)+" "+(b*k)+" "+k+"\n");
							isFound = true;
							break;
						}
					}
					
					if(isFound) {
						break;
					}
				}
			}
		}
		
		System.out.println(output.toString());
	}

	public static int gcd (int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
}
