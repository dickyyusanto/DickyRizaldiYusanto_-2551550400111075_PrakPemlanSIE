package SMT2.Laprak6.DoubleLinkedList;

public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() {head = null; }
    boolean isEmpty() { return size == 0; } 
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    Node find(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    Node get(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    void remove(int index) {
        if (index < 0 || index >= size) return;

        Node target;
        if (index == 0) {
            target = head;
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (index == size - 1) {
            target = tail;
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            target = get(index);
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    void removeByValue(Object data) {
        Node target = find(data);
        if (target == null) return;

        if (target == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (target == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    void add(int index, Node data) {
        if (index < 0 || index > size) return;
        
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node nextNode = get(index);
        Node prevNode = nextNode.prev;
        
        data.next = nextNode;
        data.prev = prevNode;
        
        prevNode.next = data;
        nextNode.prev = data;
        size++;
    }

    void addAfter(Object targetData, Node data) {
        Node target = find(targetData);
        if (target == null) return;

        if (target == tail) {
            addLast(data);
        } else {
            data.next = target.next;
            data.prev = target;
            target.next.prev = data;
            target.next = data;
            size++;
        }
    }

    void addBefore(Object targetData, Node data) {
        Node target = find(targetData);
        if (target == null) return;

        if (target == head) {
            addFirst(data);
        } else {
            data.prev = target.prev;
            data.next = target;
            target.prev.next = data;
            target.prev = data;
            size++;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        
        System.out.println("=== INISIALISASI DATA AWAL ===");
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("C"));
        System.out.print("Data Awal: "); list.print();

        System.out.println("[TEST A] Find 'B': " + (list.find("B") != null ? "Ditemukan (" + list.find("B").data + ")" : "Tidak Ditemukan"));
        System.out.println("[TEST B] Get Index 1: " + (list.get(1) != null ? "Data: " + list.get(1).data : "Null"));

        System.out.println("\n[TEST E] Add 'X' di Index 1");
        list.add(1, new Node("X"));
        System.out.print("Hasil: "); list.print();

        System.out.println("\n[TEST F] Add 'Y' setelah 'B'");
        list.addAfter("B", new Node("Y"));
        System.out.print("Hasil: "); list.print();

        System.out.println("\n[TEST G] Add 'Z' sebelum 'C'");
        list.addBefore("C", new Node("Z"));
        System.out.print("Hasil: "); list.print();
        
        System.out.print("Cek Reverse: "); list.printReverse();

        System.out.println("\n[TEST C] Remove Index 2");
        list.remove(2);
        System.out.print("Hasil: "); list.print();

        System.out.println("\n[TEST D] Remove Value 'Y'");
        list.removeByValue("Y");
        System.out.print("Hasil: "); list.print();
        
        System.out.println("\n=== SELESAI ===");
    }
}