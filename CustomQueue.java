package SMT2.Laprak7;

public class CustomQueue {
    private Node head, tail;
    private int size = 0;

    public void enqueue(int x) {
        Node n = new Node(x);
        if (tail != null) {
            tail.next = n;
        }
        tail = n;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    
    public int dequeue() {
        if (head == null) {
            throw new RuntimeException("Queue is empty.");
        }
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void print() {
    if (head == null) {
        System.out.println("Queue is empty.");
        return;
    }

    Node current = head;
    System.out.print("Isi Queue: [");
    
    while (current != null) {
        System.out.print(current.data);
    
        if (current.next != null) {
            System.out.print(", ");
        }
    
        current = current.next;
    }
    
    System.out.println("]");
    }


     public int peek() {
        if (head == null) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }
        return head.data;
    }


   /* public static void main(String[] args) {
    CustomQueue queue = new CustomQueue();


    queue.enqueue(5);
    queue.enqueue(15);
    queue.enqueue(25);
    
    System.out.println("=== Kondisi Awal ===");
    System.out.print("Isi Queue: ");
    printQueueDebug(queue); 

    System.out.println("\n=== Melakukan Dequeue 1x ===");
    int removed = queue.dequeue();
    System.out.println("Elemen yang keluar (Dequeue): " + removed); 
    
    System.out.println("Melakukan Enqueue 35 dan 45...");
    queue.enqueue(35);
    queue.enqueue(45);

    
    System.out.println("\n=== Kondisi Akhir ===");
    System.out.print("Sisa Isi Queue: ");
    printQueueDebug(queue); 
   
    System.out.print("Urutan Keluar (Dequeue All): ");
    while (!queue.isEmpty()) {
        System.out.print(queue.dequeue() + " ");
    }
    System.out.println();
}

static void printQueueDebug(CustomQueue q) {

} */
    
    public static void main(String[] args) {
    CustomQueue queue = new CustomQueue();

    // Isi queue dengan beberapa data
    queue.enqueue(100);
    queue.enqueue(200);
    queue.enqueue(300);

    System.out.println("--- Demo Fungsi Peek ---");

    // 1. Tampilkan isi queue SEBELUM peek
    System.out.print("Isi Queue Sebelum Peek: ");
    queue.print(); 
    // Output: Isi Queue: [100, 200, 300]

    // 2. Panggil fungsi peek
    try {
        int frontElement = queue.peek();
        System.out.println("Elemen terdepam (Hasil Peek): " + frontElement);
        // Output: Elemen terdepam (Hasil Peek): 100
    } catch (RuntimeException e) {
        System.out.println(e.getMessage());
    }

    // 3. Tampilkan isi queue SESUDAH peek
    System.out.print("Isi Queue Sesudah Peek: ");
    queue.print(); 
    // Output: Isi Queue: [100, 200, 300]

    // Kesimpulan: Isi queue TIDAK BERUBAH. Elemen 100 masih ada di depan.
    
    // Bukti tambahan: Dequeue sekarang harusnya mengeluarkan 100
    System.out.println("Dequeue pertama: " + queue.dequeue()); 
    // Output: Dequeue pertama: 100
}
}