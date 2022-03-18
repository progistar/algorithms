package codeforces776_div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(BR.readLine());
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String str = BR.readLine();
			String c = BR.readLine();
			
			boolean isFound = false;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == c.charAt(0) && j%2 == 0) {
					ans.append("YES\n");
					isFound = true;
					break;
				}
			}
			
			if(!isFound) {
				ans.append("NO\n");
			}
		}
		
		BR.close();
		
		System.out.println(ans.toString());
	}
}
