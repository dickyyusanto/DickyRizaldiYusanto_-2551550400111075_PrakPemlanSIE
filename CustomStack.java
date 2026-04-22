package SMT2.Laprak7;

public class CustomStack {
    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
    if (top == null) {
        throw new RuntimeException("Stack is empty.");
    }
    return top.data; 
    }

    public static void main(String[] args) {
        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);

        System.out.println("Elemen teratas saat ini: " + custom.peek());
        System.out.println("Ukuran stack masih: " + custom.size);

        System.out.print("Custom Stack: ");
        while (!custom.isEmpty()) {
            System.out.print("[" + custom.pop() + "]");
        }

        System.out.println(" End.");
        System.out.println(custom.pop());
        
    }
}
