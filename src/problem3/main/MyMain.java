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
        q.show ();
    }
}
