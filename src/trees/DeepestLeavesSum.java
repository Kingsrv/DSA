package trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }



    class Solution {
        public int deepestLeavesSum(TreeNode root) {

            Queue<TreeNode> q = new LinkedList<>();
            int currSum = 0;

            if (root == null) {
                return 0;
            }
            q.add(root);

            while (!q.isEmpty()) {

                int size = q.size();
                currSum = 0;

                for (int i = 0; i < size; i++) {
                    TreeNode front = q.poll();
                    currSum += front.val;

                    if (front.left != null) {
                        q.add(front.left);
                    }

                    if (front.right != null) {
                        q.add(front.right);
                    }
                }
            }
            return currSum;
        }
    }
}
