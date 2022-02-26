package atCoder_ABC238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC_digitnum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String str = BR.readLine();
		long n = Long.parseLong(str);
		long limit = 998244353;
		int len = str.length();
		
		BR.close();
		
		long sum = (n%limit) * ((n+1)%limit) / 2;
		
		long substract = 0;
		for(int i=2; i<=len; i++) {
			if(i == len) {
				long count = (long) (n - Math.pow(10, i-1) + 1)%limit;
				for(int j=0; j<i-1; j++) {
					substract += count * Math.pow(10, j) * 9;
					substract %= limit;
				}
			} else {
				long count = (long) (Math.pow(10, i) - Math.pow(10, i-1))%limit;
				for(int j=0; j<i-1; j++) {
					substract += count * Math.pow(10, j) * 9;
					substract %= limit;
				}
			}
		}
		
		
		System.out.println(sum);
		System.out.println(substract);
		System.out.println((sum-substract)%limit);
		
		System.out.println(sum-substract);
		
		
	}
}
