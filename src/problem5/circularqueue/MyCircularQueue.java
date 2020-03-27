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
            size++;
        } else {
            System.out.println ( "Queue is full now..." );
        }
    }

    public Student dequeue() {
        Student response = null;
        if (!isEmpty ()) {
            size--;
            response = circularQueue[front];
            front = (front + 1) % maxSize;
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

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Student[] getCircularQueue() {
        return circularQueue;
    }

    public void setCircularQueue(Student[] circularQueue) {
        this.circularQueue = circularQueue;
    }
}
