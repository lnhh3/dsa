import java.util.ArrayList;

class IntNode {
    int value;
    IntNode next;

    public IntNode(int value) {
        this(value, null);
    }

    public IntNode(int value, IntNode next) {
        this.value = value;
        this.next = next;
    }
}

class SinglyIntLinkedList {
    private IntNode head;
    private IntNode tail;

    public SinglyIntLinkedList() {
        this.head = new IntNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        IntNode curr = this.head.next;

        for (int i = 0; curr != null; curr = curr.next, i++) {
            if (i  == index) return curr.value;
        }

        return -1;
    }

    public void insertHead(int val) {
        IntNode newIntNode = new IntNode(val);
        newIntNode.next = this.head.next;
        head.next = newIntNode;
        if (newIntNode.next == null) {
            tail = newIntNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new IntNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        IntNode curr = this.head.next;

        for (int i = 0; curr != null && i < index - 1; curr = curr.next, i++);

        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) this.tail = curr;
            curr.next = curr.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();

        for (IntNode curr = this.head.next; curr != null; curr = curr.next) {
            values.add(curr.value);
        }

        return values;
    }
}
