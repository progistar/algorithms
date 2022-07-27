package atCoder_ABC260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Jewel {
	public char type = 'R';
	public int lv = 0;
	public long cnt = 0;
}

public class ProblemC_Jewels {


	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ns = BR.readLine().split("\\s");
		
		BR.close();
		
		int N = Integer.parseInt(ns[0]);
		long X = Integer.parseInt(ns[1]);
		long Y = Integer.parseInt(ns[2]);
		
		LinkedList<Jewel> jewels = new LinkedList<Jewel>();
		Jewel jewel = new Jewel();
		jewel.lv = N;
		jewel.cnt = 1;
		
		jewels.add(jewel);
		long totalCnt = 0;
		while(!jewels.isEmpty()) {
			jewel = jewels.pollFirst();
			
			if(jewel.lv == 1) {
				if(jewel.type == 'B') {
					totalCnt += jewel.cnt;
				}
			} else {
				Jewel nJewel = null;
				if(jewel.type == 'R') {
					nJewel = new Jewel();
					nJewel.cnt = jewel.cnt;
					nJewel.type = 'R';
					nJewel.lv = jewel.lv - 1;
					
					jewels.add(nJewel);
					
					nJewel = new Jewel();
					nJewel.cnt = jewel.cnt * X;
					nJewel.type = 'B';
					nJewel.lv = jewel.lv;
					
					jewels.add(nJewel);
					
					
					
				} else if(jewel.type == 'B') {
					nJewel = new Jewel();
					nJewel.cnt = jewel.cnt;
					nJewel.type = 'R';
					nJewel.lv = jewel.lv - 1;
					
					jewels.add(nJewel);
					
					nJewel = new Jewel();
					nJewel.cnt = jewel.cnt * Y;
					nJewel.type = 'B';
					nJewel.lv = jewel.lv - 1;
					
					jewels.add(nJewel);
				}
			}
		}
		
		System.out.println(totalCnt);
		
 	}
}
