import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import similartreenodes.TreeNode;
import similartreenodes.TreeNodeSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class similartreenodetests {

    private TreeNodeSolution treeNodeSolution;

    @BeforeEach
    void setup() {
        // This method runs before each test
        treeNodeSolution = new TreeNodeSolution();
    }

    @Test
    void testLeafSimilarTrue() {
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8))
        );

        TreeNode root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8)))
        );

        assertTrue(treeNodeSolution.leafSimilar(root1, root2));
    }

    @Test
    void testLeafSimilarFalse() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

        assertFalse(treeNodeSolution.leafSimilar(root1, root2));
    }
}
