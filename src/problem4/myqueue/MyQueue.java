/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor


import problem4.myLinked.MyLinkedClass;

public class MyQueue {
    MyLinkedClass list = new MyLinkedClass ();

    public int peek(int data) {
        if (list.search ( data ) == null) {
            return -1;
        }
        return list.search ( data ).getData ();
    }

    public void enqueue(int data) {
        list.addLast ( data );
    }

    public void dequeue() {
        list.deleteFirst ();
    }

    public void show() {
        list.display ();
    }

}
