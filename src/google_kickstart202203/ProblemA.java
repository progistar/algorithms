package google_kickstart202203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=0; i<t; i++) {
			String P = BR.readLine();
			String I = BR.readLine();
			
			int idx = 0;
			int matchCount = 0;
			for(int j=0; j<P.length(); j++) {
				char pChar = P.charAt(j);
				char iChar = I.charAt(idx);
				
				while(pChar != iChar) {
					idx++;
					
					if(idx >= I.length()) {
						break;
					} else {
						iChar = I.charAt(idx);
					}
				}
				
				idx++;
				if(pChar == iChar) {
					matchCount++;
				}
				if(idx >= I.length()) {
					break;
				}
			}
			
			if(matchCount == P.length()) {
				System.out.println("Case #"+(i+1)+": "+(I.length()-P.length()));
			} else {
				System.out.println("Case #"+(i+1)+": IMPOSSIBLE");
			}
		}
		
		BR.close();
	}
}
