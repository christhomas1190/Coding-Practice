package similartreenodes;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeSolution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaves1 = new ArrayList<>();
            List<Integer> leaves2 = new ArrayList<>();

            getLeaves(root1, leaves1);
            getLeaves(root2, leaves2);

            return leaves1.equals(leaves2);
        }

        public void getLeaves(TreeNode node, List<Integer> leaves) {
            if (node == null) return;

            if (node.left == null && node.right == null) {
                leaves.add(node.val);
                return;
            }

            getLeaves(node.left, leaves);
            getLeaves(node.right, leaves);
        }
    }

