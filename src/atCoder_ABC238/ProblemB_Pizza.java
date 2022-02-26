package atCoder_ABC238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB_Pizza {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(BR.readLine());
		String[] input = BR.readLine().split("\\s");
		int[] cuts = new int[input.length];
		int[] divs = new int[361];
		for(int i=0; i<cuts.length; i++) {
			cuts[i] = Integer.parseInt(input[i]);
		}
		
		BR.close();
		
		
		divs[0] = 1;
		divs[360] = 1;
		int idx = 0;
		for(int i=0; i<cuts.length; i++) {
			idx += cuts[i];
			idx %= 360;
			
			divs[idx] = 1;
		}
		
		int curCutSize = 1;
		int maxCutSize = 0;
		
		for(int i=1; i<divs.length; i++) {
			if(divs[i] == 1 ) {
				maxCutSize = Math.max(maxCutSize, curCutSize);
				curCutSize = 0;
			}
			
			curCutSize ++;
		}
		
		System.out.println(maxCutSize);
	}
}
