public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    public void add(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            root.add(data);
        }
    }

    
    public void inTraverse(Node<T> node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.print("[" + node.data + "] ");
        inTraverse(node.right);
    }

    public static void main(String[] args) {
        System.out.println("=== DEMO 1: TREE DENGAN INTEGER (Default) ===");
        BinaryTree<Integer> intTree = new BinaryTree<>();
        intTree.add(50);
        intTree.add(20);
        intTree.add(80);
        System.out.print("Inorder (Harus Terurut Naik): ");
        intTree.inTraverse(intTree.root); 
        

        System.out.println("\n\n=== DEMO 2: TREE DENGAN STRING (Modifikasi) ===");
        BinaryTree<String> stringTree = new BinaryTree<>();
        
       
        stringTree.add("Mangga");
        stringTree.add("Apel");
        stringTree.add("Jeruk");
        stringTree.add("Durian");
        stringTree.add("Anggur");

        System.out.println("Data dimasukkan: Mangga, Apel, Jeruk, Durian, Anggur");
        System.out.print("Inorder (Harus Terurut Alfabetis A-Z): ");
        stringTree.inTraverse(stringTree.root);
       
        
        System.out.println("\n\nKesimpulan: Tree berhasil mengurutkan String secara otomatis!");
    }
}