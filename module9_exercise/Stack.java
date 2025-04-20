// The Stack will not need to use the double link

public class Stack<T>{
    private Node<T> top;

    public Stack(){
        top = null; // What should top be initialized to?
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public void push(T data){
        // Create new node with provided data parameter
        Node<T> temp = new Node<>(data);
        // Set new Node's next to current top
        temp.setNext(top);
        // Set top to new Node
        top = temp;
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T pop(){
        // if stack is empty
        //      return null
        if (isEmpty()) {
            return (null);
        } else {
            T temp = top.getData();
            top = top.getNext();
            return temp;
        }
        // else
        //      Get data from top Node, assign to variable
        //      Move top to top's next pointer
        //      return the data
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T peek(){
         // if stack is empty
        //      return null
        if (isEmpty()) {
            return null;
        } else {
            return (top.getData());
        }
        // else
        //      Get data from top Node, assign to variable
        //      return the data
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public boolean isEmpty(){
        // if stack is empty
        //      return true
        //  else
        //      return false

        return(this.top == null);
    }
}
