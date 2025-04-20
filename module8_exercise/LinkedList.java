public class LinkedList<T extends Comparable<T>> {
    private Node<T> head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return(head == null);
    }

    public void add(T data){
        Node<T> temp = new Node<>(data);
        if (head == null){
            head = temp;
        }else{
            Node<T> cursor = head;
            while (cursor.getNext() != null){
                cursor = cursor.getNext();
            }
            cursor.setNext(temp);
        }
    }

    public T get(int i){
        if (isEmpty()){
            return(null);
        }else{
            int count = 0;
            Node<T> cursor = head;
            while (count < i){
                count++;
                cursor = cursor.getNext();
            }
            return(cursor.getData());
        }
    }

    public void set(int i, T data){
        // TODO: Module 8 Exercise
        // identical to get() except instead of returning data
        // you set the data to the parametetr
        int count = 0;
        Node<T> cursor = head;
        while (count < i) {
            count++;
            cursor = cursor.getNext();
        }
        cursor.setData(data);

    }

    public Node<T> remove(int i){
        // TODO: Module 8 Exercise
        // if list is empty, return null
        // see other remove() method for hints
        if (isEmpty()) {
            return (null);
        } else if (i == 0) {
            Node<T> data = head;
            head = head.getNext();
            return data;
        } else {
            Node<T> cursor = head.getNext();
            Node<T> previous = head;
            int count = 0;
            while (count < i) {
                if (count == i - 1) {
                    previous.setNext(cursor.getNext());
                }
                cursor = cursor.getNext();
                previous = previous.getNext();
                count++;
            }
            return(null);
        }
    }

    public T remove(T data){
        if (isEmpty()){
            return(null);
        }else if (head.getData().equals(data)){
            head = head.getNext();
            return(data);
        }else{
            Node<T> cursor = head.getNext();
            Node<T> previous = head;
            while (cursor != null){
                if (cursor.getData().compareTo(data) == 0){
                    previous.setNext(cursor.getNext());
                    return(data);
                }
                cursor = cursor.getNext();
                previous = previous.getNext();
            }
            return(null);
        }
    }

    public boolean contains(T data){
        // TODO: Module 8 Exercise
        // very similar to remove() but you just return true if you find it
        // false otherwise
        if (isEmpty()) {
            return false;
        } else if (head.getData().equals(data)) {
            return true;
        } else {
            Node<T> cursor = head.getNext();
            while (cursor != null) {
                if (cursor.getData().compareTo(data) == 0) {
                    return true;
                }
                cursor = cursor.getNext();
            }
        }

        return(false);
    }

    public int indexOf(T data){
        // TODO: Module 8 Exercise
        // identical to contains(), but you return the index where it was found
        //  returns -1 if it is not found
        //  use a counter variable

        if (isEmpty()) {
            return (-1);
        } else if (head.getData().equals(data)) {
            return (0);
        } else {
            int count = 1;
            Node<T> cursor = head.getNext();
            while (cursor != null) {
                if (cursor.getData().compareTo(data) == 0) {
                    return (count);
                }
                count++;
                cursor = cursor.getNext();
            }
        } 

        return(-1);
    }

    public void clear(){
        // TODO: Module 8 Exercise 
        head = null;
    }

    public int size(){
        // TODO: Module 8 Exercise
        // see the get(int) method 

        if (isEmpty()) {
            return (0);
        } else {
            int count = 1;
            Node<T> cursor = head;
            while (cursor.getNext() != null) {
                count++;
                cursor = cursor.getNext();
            }
            return count;
        }
    }

    public String toString(){
        // TODO: Module 8 
        // Similar to size(), but with accumulating the string
        String output = "";
        output += "[";
        if (isEmpty()) {
            return null;
        } else {
            Node<T> cursor = head;
            while (cursor.getNext() != null) {
                output += cursor.getData() + ", ";
                cursor = cursor.getNext();
            }
            output += cursor.getData();
            output += "]";

        }
        return(output);
    }

}
