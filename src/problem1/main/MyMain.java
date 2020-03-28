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
        tree.insert ( 45 );
        tree.insert ( 82 );
        tree.insert ( 2 );
        tree.insert ( 89 );

        System.out.println ( "Left children of the binary search tree: " );
        tree.traverse ();
        System.out.println ( "No.of Parents not having their left child are:" );
        System.out.println ( tree.getCountRight () );


    }
}
