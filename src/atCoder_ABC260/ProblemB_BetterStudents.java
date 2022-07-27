package atCoder_ABC260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Node {
	public int math = 0;
	public int eng = 0;
	public int num = 0;
}

public class ProblemB_BetterStudents {


	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ns = BR.readLine().split("\\s");
		String[] as = BR.readLine().split("\\s");
		String[] bs = BR.readLine().split("\\s");
		
		BR.close();
		
		int n = Integer.parseInt(ns[0]);
		int x = Integer.parseInt(ns[1]);
		int y = Integer.parseInt(ns[2]);
		int z = Integer.parseInt(ns[3]);
		
		LinkedList<Node> nodes = new LinkedList<Node>();
		
		for(int i=0; i<as.length; i++) {
			Node node = new Node();
			node.math = Integer.parseInt(as[i]);
			node.eng = Integer.parseInt(bs[i]);
			node.num = (i+1); 
			nodes.add(node);
		}
		
		Collections.sort(nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.math > o2.math) {
					return -1;
				} else if(o1.math < o2.math) {
					return 1;
				} else if(o1.num > o2.num) {
					return 1;
				} else if(o1.num < o2.num) {
					return -1;
				}
				return 0;
			}
		});
		
		int idx = 0;
		int[] ans = new int[x+y+z];
		
		for(int i=0; i<x; i++) {
			Node node = nodes.pollFirst();
			ans[idx++] = node.num;
		}
		
		Collections.sort(nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.eng > o2.eng) {
					return -1;
				} else if(o1.eng < o2.eng) {
					return 1;
				} else if(o1.num > o2.num) {
					return 1;
				} else if(o1.num < o2.num) {
					return -1;
				}
				return 0;
			}
		});
		
		for(int i=0; i<y; i++) {
			Node node = nodes.pollFirst();
			ans[idx++] = node.num;
		}
		
		Collections.sort(nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.eng+o1.math > o2.eng+o2.math) {
					return -1;
				} else if(o1.eng+o1.math < o2.eng+o2.math) {
					return 1;
				} else if(o1.num > o2.num) {
					return 1;
				} else if(o1.num < o2.num) {
					return -1;
				}
				return 0;
			}
		});
		
		for(int i=0; i<z; i++) {
			Node node = nodes.pollFirst();
			ans[idx++] = node.num;
		}
		
		StringBuilder printStr = new StringBuilder();
		Arrays.sort(ans);
		for(int i=0; i<ans.length; i++) {
			printStr.append(ans[i]).append("\n");
		}
		System.out.println(printStr.toString());
 	}
}
