/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.main.binarySTree.BinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQ = new MyQueue ();
        MyQueue postQ = new MyQueue ();
        BinarySearchTree tree = new BinarySearchTree ( preQ, postQ );
        tree.insert ( 34 );
        tree.insert ( 23 );
        tree.insert ( 89 );
        tree.insert ( 69 );
        tree.insert ( 07 );

        tree.postOrder ( tree.getRoot () );
        tree.preOrder ( tree.getRoot () );
        System.out.println ( "PreOrder : " );
        preQ.show ();
        System.out.println ( "PostOrder : " );
        postQ.show ();
        System.out.println ();
    }
}
