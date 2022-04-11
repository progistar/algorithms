package atCoder_ABC247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine());
		BR.close();
		
		StringBuilder ans = new StringBuilder();
		solve(1, n, ans);
		
		System.out.println(ans.toString());
	}
	
	public static void solve(int k, int n, StringBuilder str) {
		if(k == 1) {
			str.append(1);
		} else {
			String Sk = str.toString();
			str.append(" "+k).append(" "+Sk);
		}
		
		if(k == n) {
			return;
		} else {
			solve(k+1, n, str);
		}
	}
}
