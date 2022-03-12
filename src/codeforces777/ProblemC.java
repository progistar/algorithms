package codeforces777;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemC {
	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine());
		boolean[][][] matrix = new boolean[n][][];
		for(int i=0; i<n; i++) {
			String[] input = BR.readLine().split("\\s");
			int r = Integer.parseInt(input[0]);
			int c = Integer.parseInt(input[1]);
			
			matrix[i] = new boolean[r][c];
			
			for(int j=0; j<r; j++) {
				String row = BR.readLine();
				for(int k=0; k<row.length(); k++) {
					if(row.charAt(k) == '1') {
						matrix[i][j][k] = true;
					}
				}
			}
		}
		BR.close();
		
		for(int i=0; i<n; i++) {
			boolean[][] m = matrix[i];
			
			if(m[0][0]) {
				System.out.println("-1");
			} else {
				StringBuilder output = new StringBuilder();
				int cnt = 0;
				for(int j=m.length-1; j>=0; j--) {
					for(int k=m[j].length-1; k>=0; k--) {
						if(m[j][k]) {
							
							if(k==0) {
								output.append((j)+" "+(k+1)+" "+(j+1)+" "+(k+1)).append("\n");
							} else {
								output.append((j+1)+" "+k+" "+(j+1)+" "+(k+1)).append("\n");
							}
							
							cnt++;
							
						}
					}
				}
				System.out.println(cnt);
				if(cnt != 0) {
					System.out.print(output.toString());
				}
			}
 		}
	}
	
}
