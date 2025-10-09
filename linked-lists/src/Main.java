public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.insertTail("1");
        list.insertTail("2");
        list.insertTail("3");
        list.insertTail("4");
        list.insertTail("5");
        list.insertTail("6");
        list.insertTail("7");

        list.remove(3);
        list.insertHead("0");
        System.out.println(list.getValues());
    }
}