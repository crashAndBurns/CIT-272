/*
 * Stack Class
 * Author: Frank E. Ciszek
 * Date: 5/4/2025
 * A basic class developed for the creation of different types of stacks.
 * Has one attribute, a top Node with a generic type so that we can
 * create stacks of any data types that we wish.
 */

public class Stack<T> {
    private Node<T> top;

    public Stack(){
        top = null;
    }

    // push function. Takes any type of data as a parameter and
    // creates a new temp node and adds it to the top of the stack.
    public void push(T data){
        // Create new node with provided data parameter
        Node<T> temp = new Node<>(data);
        // Set new Node's next to current top
        temp.setNext(top);
        // Set top to new Node
        top = temp;
    }

    // Pop method, takes no parameters and removes the top node.
    // Returns the data from the contained in the removed node.
    public T pop(){
        if (isEmpty()) {
            return (null);
        } else {
            T temp = top.getData();
            top = top.getNext();
            return temp;
        }
    }

    // peek method. Takes no parameters and looks at the data of 
    // the Node at the top of the stack. Returns the data contained
    // in that node.
    public T peek(){
        if (isEmpty()) {
            return null;
        } else {
            return (top.getData());
        }
    }

    // isEmpty function simply returns true if the stack is empty
    // or false if the stack is not empty.
    public boolean isEmpty(){
        return(this.top == null);
    }
}
