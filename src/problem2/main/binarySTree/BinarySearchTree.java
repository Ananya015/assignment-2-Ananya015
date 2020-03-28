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

    public void preOrder(TreeNode temp) {
        if (temp == null) {
            return;
        } else {
            preQueue.enqueue ( temp.getData () );
            preOrder ( temp.getLeft () );
            preOrder ( temp.getRight () );
        }
    }

    public void postOrder(TreeNode temp) {
        if (temp == null) {
            return;
        } else {
            postOrder ( temp.getLeft () );
            postOrder ( temp.getRight () );
            postQueue.enqueue ( temp.getData () );
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
        TreeNode currentNode = root;
        TreeNode parentNode = null;
        this.countRight = 0;
        while (currentNode != null) {
            if (currentNode.getLeft () == null) {
                countRight++;
            }
            if (parentNode.getData () == currentNode.getData ()) {

            }
            if (parentNode.getData () < currentNode.getData ()) {
                System.out.println ( currentNode.getData () );
                currentNode = currentNode.getLeft ();
            }
            if (parentNode.getData () > currentNode.getData ()) {
                currentNode = currentNode.getRight ();
            }
        }
    }
}
