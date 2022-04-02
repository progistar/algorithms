package google_codejam2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QualificationRoundProblem1 {

	public static void main(String []args ) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(BR.readLine());
		int[] Ps = new int[T*2];
		
		for(int i=0; i<T; i++) {
			String[] fields = BR.readLine().split("\\s");
			Ps[2*i] = Integer.parseInt(fields[0]);
			Ps[2*i+1] = Integer.parseInt(fields[1]);
		}
		
		BR.close();
		
		// solve the problem
		for(int i=0; i<T; i++) {
			int R = Ps[2*i];
			int C = Ps[2*i+1];
			StringBuilder matrix = new StringBuilder();
			
			for(int r=0; r<2*R+1; r++) {
				for(int c=0; c<2*C+1; c++) {
					// exception
					if((r == 0 || r == 1) && (c == 0 || c == 1)) {
						matrix.append(".");
						continue;
					}
					
					// both odd
					if(r%2 == 1 && c%2 == 1) {
						matrix.append(".");
					}
					else if(r%2 == 1 && c%2 == 0) {
						matrix.append("|");
					}
					else if(r%2 == 0 && c%2 == 0) {
						matrix.append("+");
					}
					else {
						matrix.append("-");
					}
				}
				matrix.append("\n");
			}
			
			System.out.println("Case #"+(i+1)+":");
			System.out.print(matrix.toString());
		}
	}
}
