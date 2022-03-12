package atCoder_ABC239;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC_KnightFork {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] coords = BR.readLine().split("\\s");
		
		BR.close();
		
		long x1 = Long.parseLong(coords[0]);
		long y1 = Long.parseLong(coords[1]);
		long x2 = Long.parseLong(coords[2]);
		long y2 = Long.parseLong(coords[3]);
		
		long cx = 2*(x2-x1);
		long cy = 2*(y2-y1);
		
		long c = -(y1*y1 - y2*y2 + x1*x1 - x2*x2);
		
		System.out.println(cx+"\t"+cy+"\t"+c);
	}
}
