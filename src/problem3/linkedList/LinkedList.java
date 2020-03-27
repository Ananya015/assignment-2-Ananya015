package problem3.linkedList;

import problem3.node.Node;
import problem3.student.Student;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(Student student){
        Node n = new Node ( student );
        if (first == null) {
            first = last = n;
            return;
        }

        last.setNext ( n );
        last = n;

        var now = first;
        while (now != null) {
            if (n.getData ().getRollNo () < now.getData ().getRollNo ()) {
                var temp = n.getData ();
                n.setData ( now.getData () );
                now.setData ( temp );
            }
            now = now.getNext ();
        }

    }

    public void display() {
        var now = first;
        while (now != null) {
            System.out.println ( now.getData () );
            now = now.getNext ();
        }
    }
}