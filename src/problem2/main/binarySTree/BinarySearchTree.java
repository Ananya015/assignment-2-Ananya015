package problem2.main.binarySTree;


import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private TreeNode root;
    private int countRight;
    private final MyQueue preQueue;
    private final MyQueue postQueue;

    public BinarySearchTree(MyQueue preQueue, MyQueue postQueue) {
        this.preQueue = preQueue;
        this.postQueue = postQueue;
    }

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

}
