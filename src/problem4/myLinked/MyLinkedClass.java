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

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void display() {
        var now = first;
        while (now != null) {
            System.out.println ( now.getData () );
            now = now.getNext ();
        }
    }

    public Node search(int data) {
        var currentNode = first;
        while (currentNode != null) {
            if (currentNode.getData () == data) {
                return currentNode;
            }
            currentNode = currentNode.getNext ();
        }
        return null;
    }
}
