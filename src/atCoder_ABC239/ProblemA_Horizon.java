package atCoder_ABC239;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA_Horizon {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		double H = Double.parseDouble(BR.readLine());
		
		BR.close();
		
		System.out.println(Math.sqrt(H)*Math.sqrt(H+12800000));
	}
}
