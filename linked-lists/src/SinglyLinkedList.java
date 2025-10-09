import java.util.ArrayList;

class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this(value, null);
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList() {
        this.head = new Node<>(null);
        this.tail = this.head;
    }

    public T get(int index) {
        Node<T> curr = this.head.next;

        for (int i = 0; curr != null; curr = curr.next, i++) {
            if (i  == index) return curr.value;
        }

        return null;
    }

    public void insertHead(T val) {
        Node<T> newNode = new Node<>(val);
        newNode.next = this.head.next;
        head.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(T val) {
        this.tail.next = new Node<>(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        Node<T> curr = this.head;

        for (int i = 0; curr != null && i < index; i++, curr = curr.next);

        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) this.tail = curr;
            curr.next = curr.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<T> getValues() {
        ArrayList<T> values = new ArrayList<>();

        for (Node<T> curr = this.head.next; curr != null; curr = curr.next) {
            values.add(curr.value);
        }

        return values;
    }
}
