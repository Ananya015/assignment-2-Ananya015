/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue ( 4 );
        cq.enqueue ( new Student ( "Deshna", 0, 1 ) );
        cq.enqueue ( new Student ( "Ishan", 1, 0 ) );
        cq.enqueue ( new Student ( "Mohini", 1, 1 ) );
        cq.enqueue ( new Student ( "Bill Gates", 0, 0 ) );

        for (int i = 0; i < cq.getSize () + 1; i++) {
            Student stu = cq.dequeue ();
            if (stu.getBackLog () - stu.getCount () != 0) {
                cq.enqueue ( stu );
            }
        }

        cq.show ();
    }
}
