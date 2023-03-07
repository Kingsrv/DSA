package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        //create an answer container
        List<List<Integer>> vot = new ArrayList<>();

        //create a queue of TreenNode type and push root node to it.
        Queue<TreeNode> q = new LinkedList<>();

        //null check
        if(root == null){
            return vot;
        }

        q.add(root);

        //run a while loop until the queue is not empty
        while(!q.isEmpty()){

            List<Integer> level = new ArrayList<>();

            //check the size of the queue and run a for loop that many times
            int size = q.size();
            for(int i = 0; i < size ; i++){

                TreeNode front = q.poll();

                level.add(front.val);

                if(front.left != null){
                    q.add(front.left);
                }

                if(front.right != null){
                    q.add(front.right);
                }
            }
            vot.add(level);
        }
        return vot;
    }
}
