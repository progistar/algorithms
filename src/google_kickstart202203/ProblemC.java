package google_kickstart202203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(BR.readLine());
		
		for(int i=1; i<=t; i++) {
			int n = Integer.parseInt(BR.readLine());
			String s = BR.readLine();
			boolean isPossible = false;
			
			
			if(n < 5) {
				isPossible = true;
			} else {
				for(int w=5; w<n; w++) {
					for(int k=w; k<n; k++) {
						int l = k-w;
						int r = k-1;
						
						
					}
				}
			}
		}
		
		BR.close();
	}
}
