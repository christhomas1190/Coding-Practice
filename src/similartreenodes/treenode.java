package similartreenodes;

import javax.swing.tree.TreeNode;

public class treenode {
    int val;
    TreeNode left;
    TreeNode right;

    void TreeNode() {}

    void TreeNode(int val) {
        this.val = val;
    }

    void TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
