// Queues are FIFO - First In First Out

public class Queue<E> {
    public Node<E> tail;
    public Node<E> head;

    public Queue() {
        tail = null;
        
    }

    public void enqueue(E data) {
        Node<E> temp = new Node<>(data);
        tail.setPrevious(temp);
        temp.setNext(tail);
        tail = temp;
    }

    public E dequeue() {
        if (isEmpty()) {
            return  (null);
        }
    }

    public E look() {
        return (head.getData());
    }

    public boolean isEmpty() {
        return(tail == null);
    }

}
