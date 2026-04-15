package SMT2.Laprak6.DoubleLinkedList;

public class Node {
    Object data;
    Node next;
    Node prev; 

    Node(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");

        System.out.println("node :" + nodeA.data);
        System.out.println("data: " + nodeA.data);
        System.out.println("next: " + nodeA.next);
        System.out.println("prev: " + nodeA.prev);

        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        nodeA.next = nodeB;
        nodeB.prev = nodeC;

        System.out.println("next data: " + nodeA.next.data);
        System.out.println("prev data: " + nodeA.prev.data);

    }
}
