package google_codejam2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QualificationRoundProblem3 {
	public static void main(String []args ) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(BR.readLine());
		int[][] Ps = new int[T][];
		
		for(int i=0; i<T; i++) {
			BR.readLine(); // skip N
			String[] fields = BR.readLine().split("\\s");
			Ps[i] = new int[fields.length];
			
			for(int j=0; j<fields.length; j++) {
				Ps[i][j] = Integer.parseInt(fields[j]);
			}
		}
		
		BR.close();
		
		for(int i=0; i<T; i++) {
			int[] P = Ps[i];
			Arrays.sort(P);
			int longestLen = 0;
			for(int j=0; j<P.length; j++) {
				if(P[j] > longestLen) {
					longestLen++;
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+longestLen);
		}
	}
}
