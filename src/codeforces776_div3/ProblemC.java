package codeforces776_div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ProblemC {
	
	public static class Node implements Comparable<Node> {
		public int idx = 0;
		public int x = 0;
		public int w = 0;
		
		@Override
		public int compareTo(Node o) {
			if(this.w < o.w) {
				return -1;
			}else if(this.w > o.w) {
				return 1;
			}
			return 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(BR.readLine());
		
		for(int i=0; i<t; i++) {
			BR.readLine(); // skip blank
			String[] fields = BR.readLine().split("\\s");
			int n = Integer.parseInt(fields[0]);
			int m = Integer.parseInt(fields[1]);
			
			PriorityQueue<Node> nodes = new PriorityQueue<Node>();
			
			for(int j=0; j<m; j++) {
				fields = BR.readLine().split("\\s");
				Node node = new Node();
				node.idx = j+1;
				node.x = Integer.parseInt(fields[0]);
				node.w = Integer.parseInt(fields[1]);
				nodes.add(node);
			}
			
			ArrayList<Node> minNodes = new ArrayList<Node>();
			int sum = 0;
			while(minNodes.size() < 2*n) {
				Node node = nodes.poll();
				sum += node.w;
				minNodes.add(node);
			}
			
			minNodes.sort(new Comparator<Node> () {

				@Override
				public int compare(Node o1, Node o2) {
					if(o1.x > o2.x) {
						return 1;
					} else if(o1.x < o2.x) {
						return -1;
					}
					return 0;
				}
				
			});
			
			System.out.println(sum);
			for(int j=0; j<n; j++) {
				Node nodeX1 = minNodes.get(j);
				Node nodeX2 = minNodes.get(minNodes.size()-1-j);
				System.out.println(nodeX1.idx+"\t"+nodeX2.idx);
			}
			System.out.println();
		}
		
		BR.close();
		
	}
}
