package codeforces777;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

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
			
			if(m.length == 1 || m[0].length == 1) {
				System.out.println("YES");
			} else {
				boolean isElegant = true;
				for(int j=0; j<m.length-1; j++) {
					for(int k=0; k<m[j].length-1; k++) {
						int trueCnt = 0;
						if(m[j][k]) {
							trueCnt++;
						}
						if(m[j+1][k]) {
							trueCnt++;
						}
						if(m[j][k+1]) {
							trueCnt++;
						}
						if(m[j+1][k+1]) {
							trueCnt++;
						}
						
						if(trueCnt == 3) {
							isElegant = false;
						}
						
						if(!isElegant) break;
					}
					if(!isElegant) break;
				}
				
				if(isElegant) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
		}
	}
	
}
