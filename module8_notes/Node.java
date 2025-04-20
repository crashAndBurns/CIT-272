
// A node is like a cell that holds data for us. Can be anything we want.
// But we'll start by holding strings. Nodes are special because you
// can use a Node object within it's own class.

public class Node<E> {
    // Attributes
    private E data;
    private Node<E> next;  // Valid because this is a pointer to a node, not a node.

    // Constructors
    public Node() {
        data = null;
        next = null;
    }

    public Node(E data) {
        this.data = data;
        this.next = null; // Shows that the pointer points to nothing
    }

    // Getters and Setters
    // Get data stored in the node
    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    // When we create a new node, we can change where the next
    // pointer points by using setnext. We're passing pointers and
    // returning pointers. Not the object itself.
    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
