package problem2.main.binarySTree;


import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue postQueue;

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

    public MyQueue getPreQueue() {
        return preQueue;
    }

    public void setPreQueue(MyQueue preQueue) {
        this.preQueue = preQueue;
    }

    public MyQueue getPostQueue() {
        return postQueue;
    }

    public void setPostQueue(MyQueue postQueue) {
        this.postQueue = postQueue;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


}
