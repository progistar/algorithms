package atCoder_ABC247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

class Node {
	long x = 0;
	long c = 0;
}

public class ProblemD {

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine());
		
		LinkedList<Node> queue = new LinkedList<Node>();
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String[] fields = BR.readLine().split("\\s");
			if(fields[0].equalsIgnoreCase("1")) {
				Long x = Long.parseLong(fields[1]);
				Long c = Long.parseLong(fields[2]);
				Node node = new Node();
				node.c = c;
				node.x = x;
				
				queue.addLast(node);
				
			} else {
				Long c = Long.parseLong(fields[1]);
				Long sum = 0L;
				while(!queue.isEmpty()) {
					Node node = queue.peekFirst();
					
					Long consume = Math.min(c, node.c);
					
					sum += consume * node.x;
					node.c -= consume;
					if(node.c == 0) {
						queue.pollFirst();
					}
					
					c -= consume;
					if(c == 0) {
						break;
					}
				}
				ans.append(sum+"\n");
			}
		}
		
		BR.close();
		
		System.out.print(ans.toString());
	}
}
