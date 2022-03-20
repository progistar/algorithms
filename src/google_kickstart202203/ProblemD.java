package google_kickstart202203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemD {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=1; i<=t; i++) {
			String[] fields = BR.readLine().split("\\s");
			long a = Long.parseLong(fields[0]);
			long b = Long.parseLong(fields[1]);
			
			long count = 0;
			
			for(long n=a; n<=b; n++) {
				if(isDivisible(n)) {
					count++;
				}
			}
			
			System.out.println("Case #"+i+": "+count);
			
		}
		
		BR.close();
	}
	
	public static boolean isDivisible (long n) {
		String N = ""+n;
		
		long sum = 0;
		long product = 1;
		for(int i=0; i<N.length(); i++) {
			long num = N.charAt(i) - '0';
			sum += num;
			product *= num;
		}
		
		if(product%sum == 0) {
			return true;
		}
		
		return false;
	}
}
