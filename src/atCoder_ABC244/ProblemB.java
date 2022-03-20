package atCoder_ABC244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		BR.readLine();// skip useless...
		String s= BR.readLine();
		BR.close();
		
		int x = 0;
		int y = 0;
		char d = 'e';
		
		for(int i=0; i<s.length(); i++) {
			char op = s.charAt(i);
			
			if(op == 'S') {
				
				if(d == 'e') {
					x++;
				} else if(d == 's') {
					y--;
				} else if(d == 'w') {
					x--;
				} else if(d == 'n') {
					y++;
				}
				
			} else {
				if(d == 'e') {
					d = 's';
				} else if(d == 's') {
					d = 'w';
				} else if(d == 'w') {
					d = 'n';
				} else if(d == 'n') {
					d = 'e';
				}
			}
		}
		
		System.out.println(x+" "+y);
	}
}
