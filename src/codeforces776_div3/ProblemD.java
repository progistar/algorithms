package codeforces776_div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ProblemD {
	
	public static class Node {
		int idx = 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(BR.readLine());
			Node[] nodes = new Node[n];
			// init
			for(int j=0; j<nodes.length; j++) {
				nodes[j] = new Node();
			}
			
			String[] fields = BR.readLine().split("\\s");
			for(int j=0; j<n; j++) {
				int p = Integer.parseInt(fields[j]);
				nodes[p-1].idx = j;
			}
			LinkedList<Integer> ansIdx = new LinkedList<Integer>();
			StringBuilder ans = new StringBuilder();
			
			for(int j=nodes.length-1; j>=0; j--) {
				int curShift = nodes[j].idx + 1;
				curShift %= (j+1);
				for(int k=j-1; k>=0; k--) {
					nodes[k].idx -= curShift;
					if(nodes[k].idx < 0) {
						nodes[k].idx += (j+1);
					}
				}
				
				ansIdx.addFirst(curShift);
			}
			
			while(!ansIdx.isEmpty()) {
				int idx = ansIdx.poll();
				if(ans.length() != 0) {
					ans.append(" ");
				}
				ans.append(idx);
			}
			
			System.out.println(ans.toString());
		}
		
		BR.close();
	}
}
