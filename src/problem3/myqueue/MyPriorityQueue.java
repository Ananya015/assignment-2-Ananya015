/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.linkedList.LinkedList;
import problem3.student.Student;

public class MyPriorityQueue {
    LinkedList list = new LinkedList ();

    public void enqueue(Student student) {
        list.addLast ( student );
    }

    public void show() {
        list.display ();
    }
}
