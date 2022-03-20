package atCoder_ABC244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		BR.readLine();// skip useless...
		String s= BR.readLine();
		BR.close();
		
		System.out.println(s.charAt(s.length()-1));
	}
}
