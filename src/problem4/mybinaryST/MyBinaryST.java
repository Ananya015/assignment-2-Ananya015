package problem4.mybinaryST;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class MyBinaryST {

    private final MyQueue myQueue;
    private TreeNode root;

    public MyBinaryST(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void insert(int data) {
        TreeNode n = new TreeNode ( data );
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
            myQueue.enqueue ( temp.getData () );
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
}
