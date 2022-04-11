package atCoder_ABC247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String S = BR.readLine();
		BR.close();
		
		System.out.print("0");
		for(int i=1; i<S.length(); i++) {
			System.out.print(S.charAt(i-1));
		}
		System.out.println();
	}
}
