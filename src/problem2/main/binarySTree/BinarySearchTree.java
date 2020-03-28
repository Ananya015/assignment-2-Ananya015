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
}
