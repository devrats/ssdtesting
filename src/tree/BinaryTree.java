/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 02-Dec-21
 *   Time: 10:29 AM
 *   File: BinaryTree.java
 */

package tree;
import java.util.*;
public class BinaryTree{

    private TreeNode root;

    public TreeNode getRoot(){
        return this.root;
    }

    class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void preOrder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.getData() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(TreeNode node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getData() + " ");
    }

    public void inOrder(TreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.getData() + " ");
        inOrder(node.right);
    }

    public static void iterPreOrder(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }


    public static void iterInOrder(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.right!=null){
                stack.push(temp.right);
            }
            System.out.print(temp.data + " ");
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void iterPostOrder(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
            System.out.print(temp.data + " ");
        }
    }
}



