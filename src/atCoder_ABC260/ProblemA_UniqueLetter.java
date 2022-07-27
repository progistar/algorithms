package atCoder_ABC260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA_UniqueLetter {


	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String S = BR.readLine();
		
		BR.close();
		
		
		int[] counts = new int[26];
		int len = S.length();
		for(int i=0; i<len; i++) {
			counts[S.charAt(i)-'a']++;
		}
		
		boolean isFound = false;
		for(int i=0; i<counts.length; i++) {
			if(counts[i] == 1) {
				System.out.println((char)('a'+i));
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("-1");
		}
 	}
}
