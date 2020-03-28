package problem4.myLinked;

public class MyLinkedClass {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node n = new Node ( data );
        if (first == null) {
            first = last = n;
            return;
        }
        last.setNext ( n );
        last = n;
    }

    public void deleteFirst() {
        if (first == null) {
            first = last = null;
            return;
        }
        var sec = first.getNext ();
        first.setNext ( null );
        first = sec;
    }

}
