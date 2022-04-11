package atCoder_ABC247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine());
		Hashtable<String, String> marker = new Hashtable<String, String>();
		String[][] names = new String[n][2];
		
		for(int i=0; i<n; i++) {
			String[] fields = BR.readLine().split("\\s");
			names[i] = fields;
		}
		BR.close();
		
		boolean isPossible = true;
		for(int i=0; i<names.length; i++) {
			boolean isLeftPossible = true;
			boolean isRightPossible = true;
			for(int j=0; j<names.length; j++) {
				if(i==j) {
					continue;
				}
				
				if(names[i][0].equalsIgnoreCase(names[j][0]) || names[i][0].equalsIgnoreCase(names[j][1])) {
					isLeftPossible = false;
				}
				
				if(names[i][1].equalsIgnoreCase(names[j][0]) || names[i][1].equalsIgnoreCase(names[j][1])) {
					isRightPossible = false;
				}
				
				if(!isLeftPossible && !isRightPossible) {
					isPossible = false;
					break;
				}
			}
			
			if(!isPossible) {
				break;
			}
		}
		
		if(isPossible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
