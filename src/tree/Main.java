/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 02-Dec-21
 *   Time: 10:29 AM
 *   File: Main.java
 */

package tree;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BinaryTree bTree = new BinaryTree();
        bTree.createBinaryTree();
        bTree.preOrder(bTree.getRoot());
        System.out.println();
        bTree.postOrder(bTree.getRoot());
        System.out.println();
        bTree.inOrder(bTree.getRoot());
        System.out.println();
        System.out.println("---------------------------------------------------------");
        bTree.iterPreOrder(bTree.getRoot());
        System.out.println();
        bTree.iterInOrder(bTree.getRoot());
        System.out.println();
        bTree.iterPostOrder(bTree.getRoot());
    }
}