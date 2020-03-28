/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree ();
        tree.insert ( 30 );
        tree.insert ( 24 );
        tree.insert ( 7 );
        tree.insert ( 89 );
        tree.insert ( 55 );

        tree.preOrder ( tree.getRoot () );
        System.out.println ();
        tree.inOrder ( tree.getRoot () );
    }
}
