/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue q = new MyPriorityQueue ();
        q.enqueue ( new Student ( "Ananya", 07 ) );
        q.enqueue ( new Student ( "Chelisha", 15 ) );
        q.enqueue ( new Student ( "Sonam", 55 ) );
        q.enqueue ( new Student ( "kapil", 30 ) );
        q.enqueue ( new Student ( "raja", 50 ) );
        q.enqueue ( new Student ( "Aahna", 05 ) );
        q.enqueue ( new Student ( "fana khna", 25 ) );
        q.show ();

        q.dequeue ();
        q.show ();

    }
}
