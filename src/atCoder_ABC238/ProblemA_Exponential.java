package atCoder_ABC238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA_Exponential {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		double n = Double.parseDouble(BR.readLine());
		
		BR.close();
		
		if(n > 2 * Math.log(n)/Math.log(2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
