package atCoder_ABC244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		int N = Integer.parseInt(BR.readLine());
		
		int[] usedNums = new int[2*N+2];
		for(int i=0; i<N+1; i++) {
			
			for(int j=1; j<2*N+2; j++) {
				if(usedNums[j] == 0) {
					System.out.println(j);
					usedNums[j] = 1;
					break;
				}
			}
			
			int aoki = Integer.parseInt(BR.readLine());
			usedNums[aoki] = 1;
		}
		
		
		BR.close();
		
	}
}
