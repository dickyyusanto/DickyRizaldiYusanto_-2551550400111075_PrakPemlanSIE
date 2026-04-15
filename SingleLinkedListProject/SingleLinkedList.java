package SMT2.Laprak6.SingleLinkedListProject;

public class SingleLinkedList {
    
    Node head, tail;
    int size = 0;

    void init() { head = null; }

    boolean isEmpty() { return size == 0; }

    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
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
        Node current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current;
            }
            current = current.next;
            i++;
        }
        return null;
    }

    void remove(int index) {
    if (head == null) return;

    if (index == 0) {
        head = head.next;
        size--;
        return;
    }

    Node prev = get(index - 1);
        if (prev == null || prev.next == null) return;

        prev.next = prev.next.next;

        if (prev.next == null) {
            tail = prev;
        }

        size--;
    }

    void removeByValue(Object data) {
    if (head == null) return;

    if (head.data.equals(data)) {
        head = head.next;
        size--;
        return;
    }

    Node current = head;

    while (current.next != null) {
        if (current.next.data.equals(data)) {
            current.next = current.next.next;

            if (current.next == null) {
                tail = current;
            }

            size--;
            return;
        }
        current = current.next;
    }
    }

    void add(int index, Node data) {
    if (index == 0) {
        addFirst(data);
        return;
    }

    Node prev = get(index - 1);
    if (prev == null) return;

    data.next = prev.next;
    prev.next = data;

    if (data.next == null) {
        tail = data;
    }

    size++;
    }

    void addAfter(Object target, Node data) {
    Node node = find(target);

    if (node != null) {
        data.next = node.next;
        node.next = data;

        if (data.next == null) {
            tail = data;
        }

        size++;
    }
    }

    void addBefore(Object target, Node data) {
    if (head == null) return;

    if (head.data.equals(target)) {
        addFirst(data);
        return;
    }

    Node current = head;

    while (current.next != null) {
        if (current.next.data.equals(target)) {
            data.next = current.next;
            current.next = data;
            size++;
            return;
        }
        current = current.next;
    }
    }
    


       public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        System.out.println("=== INISIALISASI LIST ===");
        // Setup awal
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("C"));
        System.out.println("List Awal: ");
        list.print(); 
        System.out.println("Ukuran: " + list.size());
        System.out.println("------------------------------------------");

        // 1. TEST FIND (Mencari Data)
        System.out.println("\n[TEST 1] METHOD find('B')");
        Node found = list.find("B");
        if (found != null) {
            System.out.println(">> BERHASIL: Ditemukan node dengan data: " + found.data);
        } else {
            System.out.println(">> GAGAL: Data tidak ditemukan.");
        }

        // 2. TEST GET (Mengambil Index)
        System.out.println("\n[TEST 2] METHOD get(1)");
        Node atIdx = list.get(1);
        if (atIdx != null) {
            System.out.println(">> BERHASIL: Data di index 1 adalah: " + atIdx.data);
        }

        // 3. TEST ADD AT INDEX (Menyisipkan di tengah)
        System.out.println("\n[TEST 3] METHOD add(1, 'X') - Menyisip di Index 1");
        System.out.println("Sebelum: "); list.print();
        list.add(1, new Node("X"));
        System.out.println("Sesudah: "); list.print();
        System.out.println(">> Status: Ukuran sekarang " + list.size() + " (Seharusnya 4)");

        // 4. TEST ADD AFTER (Menambah setelah node tertentu)
        System.out.println("\n[TEST 4] METHOD addAfter('B', 'Y')");
        System.out.println("Sebelum: "); list.print();
        list.addAfter("B", new Node("Y"));
        System.out.println("Sesudah: "); list.print();

        // 5. TEST ADD BEFORE (Menambah sebelum node tertentu)
        System.out.println("\n[TEST 5] METHOD addBefore('C', 'Z')");
        System.out.println("Sebelum: "); list.print();
        list.addBefore("C", new Node("Z"));
        System.out.println("Sesudah: "); list.print();
        System.out.println(">> Urutan seharusnya: A X B Y Z C");

        // 6. TEST REMOVE BY INDEX (Hapus berdasarkan posisi)
        System.out.println("\n[TEST 6] METHOD remove(2) - Hapus index ke-2 (Harusnya 'B')");
        System.out.println("Sebelum: "); list.print();
        list.remove(2);
        System.out.println("Sesudah: "); list.print();
        System.out.println(">> Verifikasi: Apakah 'B' hilang? " + (list.find("B") == null ? "YA" : "TIDAK"));

        // 7. TEST REMOVE BY VALUE (Hapus berdasarkan nilai)
        System.out.println("\n[TEST 7] METHOD removeByValue('B') - Jika masih ada, hapus 'B'");
        // Catatan: Karena 'B' sudah hapus di test 6, mari kita tes hapus 'Y' saja untuk demo
        // Atau kita tambah dulu 'B' lagi biar jelas demonya? 
        // Mari kita hapus 'Y' saja sebagai contoh valid.
        System.out.println("Aksi: Menghapus nilai 'Y'");
        list.removeByValue("Y");
        System.out.println("Sesudah: "); list.print();

        // 8. EDGE CASE: isEmpty & Head/Tail check
        System.out.println("\n[TEST 8] CEK KONDISI KOSONG");
        SingleLinkedList emptyList = new SingleLinkedList();
        System.out.println("List baru kosong? " + emptyList.isEmpty());
        emptyList.addFirst(new Node("Satu-satunya"));
        System.out.println("Setelah addFirst: "); emptyList.print();
        System.out.println("Head == Tail? " + (emptyList.head == emptyList.tail));
        
        System.out.println("\n=== SEMUA TEST SELESAI ===");
    }

}