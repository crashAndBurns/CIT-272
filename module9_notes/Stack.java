// Stacks are LIFO - Last In First Out



public class Stack<E> {
    private Node<E> top;

    public Stack() {
        this.top = null;
    }

    public void push(E data) {
        Node<E> temp = new Node<>(data);
        temp.setNext(top);  // Need to set next first to avoid garbage collection
        top = temp;

    }

    public E peek() {
        if (isEmpty()) {
            return (null);
        } else {
            return (top.getData());
        }
    }

    public E pop() {
        
    }

    public E pull() {
        return (pop());
    }

    public boolean isEmpty() {
        return(this.top == null);
    }

}
