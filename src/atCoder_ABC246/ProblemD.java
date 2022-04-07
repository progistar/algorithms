package atCoder_ABC246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProblemD {

	public static long cal (long a, long b) {
		return (a+b)*(a*a+b*b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(BR.readLine());
		BR.close();
		
		long limit = 1_000_000;
		long lastAns = Long.MAX_VALUE;
		for(long a=0; a<=limit; a++) {
			long l = -1;
			long r = limit+1;
			long ans = 0;
			
			while(l < r-1) {
				long mid = (l+r)>>1;
			
				ans = cal(a, mid);
				if(ans >= N) {
					r = mid;
				} else if (ans < N){
					l = mid;
				}
			}
			lastAns = Math.min(lastAns, cal(a, r));
		}
		
		System.out.println(lastAns);
		
	}
}
