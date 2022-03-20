package google_kickstart202203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=1; i<=t; i++) {
			String in = BR.readLine();
			long num = 0;
			
			for(int j=0; j<in.length(); j++) {
				num += (in.charAt(j) - '0');
				num %= 9;
			}
			
			StringBuilder ans = new StringBuilder();
			long ins = (9 - num)%9;
			
			for(int j=0; j<in.length(); j++) {
				num = (in.charAt(j) - '0');
				
				if(ins == 0 && j == 0) {
					ans.append(num);
					continue;
				} else if (ins < num){
					ans.append(ins);
					ins = 10;
				}
				ans.append(num);
			}
			
			if(ins < 10) {
				ans.append(ins);
			}
			
			System.out.println("Case #"+i+": "+ans.toString());
		}
		
		BR.close();
		
	}
}
