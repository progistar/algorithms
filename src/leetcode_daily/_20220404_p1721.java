package leetcode_daily;

import java.util.ArrayList;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution_20220404 {
    public ListNode swapNodes(ListNode head, int k) {
        
        ArrayList<ListNode> arrayListNode = new ArrayList<ListNode>();
        ListNode node = head;
        while(node != null) {
            arrayListNode.add(node);
            node = node.next;
        }
        
        ListNode leftNode = arrayListNode.get(k-1);
        ListNode rightNode = arrayListNode.get(arrayListNode.size()-k);
        
        // swap
        int nodeVal = leftNode.val;
        leftNode.val = rightNode.val;
        rightNode.val = nodeVal;
        
        return head;
    }
}

public class _20220404_p1721 {

}
