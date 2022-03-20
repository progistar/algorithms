package atCoder_ABC244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class ProblemD {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] Ss = BR.readLine().split("\\s");
		String[] Ts = BR.readLine().split("\\s");
		
		BR.close();
		
		
		if(traverse(Ss, Ts, 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	public static boolean traverse(String[] Ss, String[] Ts, int count) {
		boolean is = true;
		
		for(int i=0; i<Ss.length; i++) {
			if(!Ss[i].equalsIgnoreCase(Ts[i])) {
				is = false;
			}
		}
		
		if(is && count % 2 == 0) {
			return is;
		} else {
			is = false;
		}
		
		if(count > 6) {
			return is;
		}
		
		String[] newSs = new String[3];
		// S1 - S2
		newSs[0] = Ss[1];
		newSs[1] = Ss[0];
		newSs[2] = Ss[2];
		is |= traverse (newSs, Ts, count+1);
		
		// S2 - S3
		newSs[0] = Ss[0];
		newSs[1] = Ss[2];
		newSs[2] = Ss[1];
		is |= traverse (newSs, Ts, count+1);
		
		// S1 - S3
		newSs[0] = Ss[2];
		newSs[1] = Ss[1];
		newSs[2] = Ss[0];
		is |= traverse (newSs, Ts, count+1);
		
		return is;
	}
}
