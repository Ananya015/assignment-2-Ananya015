/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

   public Object postOrder;
   private TreeNode root;
   private int countRight;

   public void insert(int item) {
      TreeNode n = new TreeNode ( item );
      if (root == null) {
         root = n;
      } else {
         TreeNode currentNode = root;
         TreeNode parentNode = null;
         while (currentNode != null) {
            parentNode = currentNode;
            if (n.getData () < currentNode.getData ()) {
               currentNode = currentNode.getLeft ();
            } else {
               currentNode = currentNode.getRight ();
            }
         }
         if (n.getData () < parentNode.getData ()) {
            parentNode.setLeft ( n );
         } else {
            parentNode.setRight ( n );
         }
      }
   }

   public TreeNode getRoot() {
      return root;
   }

   public void setRoot(TreeNode root) {
      this.root = root;
   }


   public void preOrder(TreeNode temp) {
      if (temp == null) {
         return;
      } else {
         System.out.println ( temp.getData () );
         preOrder ( temp.getLeft () );
         preOrder ( temp.getRight () );
      }
   }

   public void inOrder(TreeNode temp) {
      if (temp == null) {
         return;
      } else {
         inOrder ( temp.getLeft () );
         System.out.println ( temp.getData () );
         inOrder ( temp.getRight () );
      }
   }

   public int getCountRight() {
      return countRight;
   }

   public void setCountRight(int countRight) {
      this.countRight = countRight;
   }

   public void traverse() {
      TreeNode current = root;
      TreeNode parent = null;
      this.countRight = 0;
      while (current != null) {
         if (current.getLeft () == null) {
            countRight++;
         }
         if (parent.getData () == current.getData ()) {

         }
         if (parent.getData () < current.getData ()) {
            System.out.println ( current.getData () );
            current = current.getLeft ();
         }
         if (parent.getData () > current.getData ()) {
            current = current.getRight ();
         }
      }
   }
}
