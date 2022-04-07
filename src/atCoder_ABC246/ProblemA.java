package atCoder_ABC246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		int x1 = 0; int y1 = 0;
		int x2 = 0; int y2 = 0;
		int x3 = 0; int y3 = 0;
		String[] fields = BR.readLine().split("\\s");
		x1 = Integer.parseInt(fields[0]);
		y1 = Integer.parseInt(fields[1]);
		
		fields = BR.readLine().split("\\s");
		x2 = Integer.parseInt(fields[0]);
		y2 = Integer.parseInt(fields[1]);
		
		fields = BR.readLine().split("\\s");
		x3 = Integer.parseInt(fields[0]);
		y3 = Integer.parseInt(fields[1]);
		
		BR.close();
		
		x1 += 100; x2 += 100; x3 += 100;
		y1 += 100; y2 += 100; y3 += 100;
		int[] xMarker = new int[201];
		int[] yMarker = new int[201];
		
		xMarker[x1]++; xMarker[x2]++; xMarker[x3]++;
		yMarker[y1]++; yMarker[y2]++; yMarker[y3]++;
		
		int x4 = 0; int y4 = 0;
		if(xMarker[x1] == 1) {
			x4 = x1;
		} else if(xMarker[x2] == 1) {
			x4 = x2;
		} else if(xMarker[x3] == 1) {
			x4 = x3;
		}
		
		if(yMarker[y1] == 1) {
			y4 = y1;
		} else if(yMarker[y2] == 1) {
			y4 = y2;
		} else if(yMarker[y3] == 1) {
			y4 = y3;
		}
		
		x4 -= 100; y4 -= 100;
		
		System.out.println(x4+" "+y4);
	}
}
