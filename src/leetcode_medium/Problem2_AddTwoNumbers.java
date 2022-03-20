package leetcode_medium;


// Definition for singly-linked list.

class ListNode {
	int val;
	ListNode next;
 	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode rootNode = null;
        ListNode prevNode = null;
        
        int nextTo = 0;
        while(l1 != null || l2 != null) {
            
            int a = 0;
            int b = 0;
            
            if(l1 != null) {
                a = l1.val;
            }
            if(l2 != null) {
                b = l2.val;
            }
            
            int sum = a + b + nextTo;
            nextTo = sum/10;
            sum %= 10;
            
            ListNode node = new ListNode();
            node.val = sum;
            
            if(rootNode == null) {
                rootNode = node;
            } else {
                prevNode.next = node;
            }
            
            prevNode = node;
            
            if(l1 != null) {
                l1 = l1.next;    
            }
            
            if(l2 != null) {
                l2 = l2.next;
            }
            
            if(l1 == null && l2 == null && nextTo != 0) {
                node = new ListNode();
                node.val = nextTo;
                prevNode.next = node;
            }
        }
        
        
        
        return rootNode;
        
    }
}

public class Problem2_AddTwoNumbers {

	/**
	 * Reverse operation problem.
	 * https://leetcode.com/problems/add-two-numbers/
	 * 
	 * 
	 */
}
