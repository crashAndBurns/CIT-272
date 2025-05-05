/*
 * Node Class
 * Author: Frank E. Ciszek
 * Date: 5/4/2025
 * Purpose: A basic node used to store data in a stack
 * It uses the generic data type so we can create a stack of
 * any type of data types that we wish.
 */

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> previous;
    
    public Node(){
        data = null;
        next = null;
        previous = null;
    }
    
    public Node(T item){
        data = item;
        
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
