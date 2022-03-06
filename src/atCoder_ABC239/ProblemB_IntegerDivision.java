package atCoder_ABC239;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB_IntegerDivision {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String strX = BR.readLine();
		
		long x = Long.parseLong(strX);
		
		BR.close();
		
		if(x >= 0) {
			System.out.println(x/10);
		} else {
			
			if(strX.endsWith("0")) {
				System.out.println(x/10);
			} else {
				System.out.println(x/10-1);
			}
			
		}
	}
}
