package leetcode_daily;
import java.util.LinkedList;

public class _20220727_p114 {
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	 }
	 
	class Solution_20220727_p114 {
	    public void flatten(TreeNode root) {
	        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
	        
	        traverse(root, list);
	        
	        TreeNode nNode = null;

	        while(!list.isEmpty()) {
	        	TreeNode cNode = list.pollFirst();
	        	if(nNode != null) {
	        		nNode.right = cNode;
	        	}
	        	nNode = cNode;
	        }
	    }
	    
	    public void traverse(TreeNode node, LinkedList<TreeNode> list) {
	    	if(node == null) {
                return;
            }
            
	        list.add(node);
	        
	        if(node.left != null) {
	            traverse(node.left, list);
	        }
            if(node.right != null) {
	            traverse(node.right, list);
	        }
	        node.left = null;
	        node.right = null;
	    }
	}
}
