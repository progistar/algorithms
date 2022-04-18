package leetcode_daily;

class TreeNode_20220418 {
    int val;
    TreeNode_20220418 left;
    TreeNode_20220418 right;
    TreeNode_20220418() {}
    TreeNode_20220418(int val) { this.val = val; }
    TreeNode_20220418(int val, TreeNode_20220418 left, TreeNode_20220418 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution_20220418 {
    public int kthSmallest(TreeNode_20220418 root, int k) {
        int[] v = new int[1];
        return traverse(root, k, v);
    }
    
    public int traverse(TreeNode_20220418 root, int k, int[] v) {
        int value = -1;
        
        if(root.left != null) {
            value = traverse(root.left, k, v);
            if(value != -1) {
                return value;
            }
        }
        
        if(k == ++v[0]) {
            value = root.val;
            return value;
        }
        
        if(root.right != null) {
            value = traverse(root.right, k, v);
            if(value != -1) {
                return value;
            }
        }
        
        return value;
    }
}

public class _20220418_p230 {

}
