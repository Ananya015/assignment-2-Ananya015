/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private int front;
    private int rear;
    private int size;
    private int maxSize;
    private Student[] circularQueue;

    public MyCircularQueue(int maxSize) {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.maxSize = maxSize;
        circularQueue = new Student[maxSize];
    }

    public void enqueue(Student ele) {
        if (!isFull ()) {
            circularQueue[rear] = ele;
            rear = (rear + 1) % maxSize;
        }
    }

    public Student dequeue() {
        Student response = null;
        if (!isEmpty ()) {
            response = circularQueue[front = (front + 1) % maxSize];
            size--;
            return response;
        } else {
            return response;
        }
    }

    private boolean isFull() {
        return size == maxSize;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println ( circularQueue[(i + front) % maxSize] );
        }
    }
}
