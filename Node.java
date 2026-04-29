class Node<T extends Comparable<T>> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
        left = right = null;
    }

    public void add(T data) {
       
        if (data.compareTo(this.data) > 0) { 
            
            if (this.right == null) {
                this.right = new Node<>(data);
            } else {
                this.right.add(data);
            }
        } else if (data.compareTo(this.data) < 0) { 
            
            if (this.left == null) {
                this.left = new Node<>(data);
            } else {
                this.left.add(data);
            }
        }
        
    }
}