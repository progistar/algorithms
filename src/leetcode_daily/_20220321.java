package leetcode_daily;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Node implements Comparable<Node>{
    public int start;
    public int end;
    
    public int compareTo (Node node) {
        if(this.start > node.start) {
            return 1;
        }else if(this.start < node.start) {
            return -1;
        }
        
        return 0;
    }
}

class Solution3 {
    public List<Integer> partitionLabels(String s) {
        Node[] nodes = new Node[26];
        
        for(int i=0; i<nodes.length; i++) {
            nodes[i] = new Node();
            nodes[i].start = -1;
            nodes[i].end = -1;
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if(nodes[idx].start == -1){
                nodes[idx].start = i;
            }
            
            nodes[idx].end = i;
        }
        
        //greedy
        Arrays.sort(nodes);
        
        int l=0;
        int r=0;
        int count = 1;
        List<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<nodes.length; i++) {
            Node node = nodes[i];
            if(r < node.start) {
                list.add(r-l+1);
                l = node.start;
                r = node.end;
                count++;
            } else {
                r = Math.max(node.end, r);
            }
        }
        

        if(list.size() < count) {
            list.add(r-l+1);
        }
        
        return list;
    }
}

public class _20220321 {

}
