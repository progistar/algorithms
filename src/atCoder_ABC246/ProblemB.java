package atCoder_ABC246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String[] fields = BR.readLine().split("\\s");
		
		double x= Double.parseDouble(fields[0]);
		double y= Double.parseDouble(fields[1]);
		
		BR.close();
		
		double d = Math.sqrt(x*x+y*y);
		
		double uX = x/d;
		double uY = y/d;
		
		System.out.println(uX+" "+uY);
	}
}
