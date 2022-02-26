package atCoder_ABC238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemD_AndSum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(BR.readLine());
		
		for(int i=0; i<T; i++) {
			String[] fields = BR.readLine().split("\\s");
			long a = Long.parseLong(fields[0]);
			long s = Long.parseLong(fields[1]);
			
			long diff = s - 2*a;
			
			if(diff >= 0 && (diff & a) ==0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		BR.close();
		
	}
}
