package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderRightToLeft {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public class Solution {
        public ArrayList<Integer> solve(TreeNode A) {

            Queue<TreeNode> q = new LinkedList<>();

            ArrayList<Integer> revLevOrder = new ArrayList<>();

            if (A == null) {
                return revLevOrder;
            }

            q.add(A);

            while (!q.isEmpty()) {

                int size = q.size();

                for (int i = 0; i < size; i++) {
                    TreeNode front = q.poll();

                    revLevOrder.add(front.val);

                    if (front.right != null) {
                        q.add(front.right);
                    }

                    if (front.left != null) {
                        q.add(front.left);
                    }
                }
            }
            return revLevOrder;
        }
    }

}
