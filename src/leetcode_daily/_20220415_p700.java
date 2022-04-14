package leetcode_daily;

class TreeNode {
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
 
class Solution_20220415 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode next = root;
        
        while(next != null) {
            if(next.val == val) {
                break;
            } else if(next.val < val) {
                next = next.right;
            } else {
                next = next.left;
            }
        }
        
        return next;
    }
}

public class _20220415_p700 {

}
