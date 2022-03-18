package codeforces776_div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {
	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(BR.readLine());
		
		long[] ans = new long[n];
		
		StringBuilder strAns = new StringBuilder();
		for(int i=0; i<n; i++) {
			String[] fields = BR.readLine().split("\\s");
			long l = Long.parseLong(fields[0]);
			long r = Long.parseLong(fields[1]);
			long a = Long.parseLong(fields[2]);
			
			long maxVal = 0;
			boolean isOut = false;
			for(long x=r; x>=l; x--) {
				maxVal = Math.max(maxVal, x/a + x%a);
				if(isOut) {
					break;
				}
				if(x%a == 0) {
					isOut = true;
				}
			}
			
			ans[i] = maxVal;
			strAns.append(ans[i]+"\n");
		}
		
		BR.close();
		
		System.out.println(strAns.toString());
	}
}
