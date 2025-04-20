public class LinkedList<T> {
    private Node<T> head;
		private Node<T> last;

    public LinkedList(){
        head = null;
		    last = null;
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
			temp.setPrevious(cursor); // Add the reverse link
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
        if (isEmpty()) {
            return;
        } else {
            int count = 0;
            Node<T> cursor = head;
            while (count < i - 1) {
                count++;
                cursor = cursor.getNext();
            }
            cursor.setData(data);
        }
    }

    public T remove(int i){
        // TODO: Module 8 Exercise
        // if list is empty, return null
        // see other remove() method for hints
        if (isEmpty()) {
            return (null);
        } else {
            int count = 0;
            Node<T> cursor = head;
            while (count < i) {
                count++;
                if (count == i - 1) {
                    if (cursor.getPrevious() != null) {
                        cursor.getPrevious().setNext(cursor.getNext());
                    } else {
                        head = cursor.getNext();
                    }

                    if (cursor.getNext() != null) {
                        cursor.getNext().setPrevious(cursor.getPrevious());
                    } else {
                        last = cursor.getPrevious();
                    }
                    return(cursor.getData());
                }
                cursor = cursor.getNext();
            }
        }
        return (null);
    }

    public T remove(T data){
        if (isEmpty()){
            return(null);
        }else if (head.getData().equals(data)){
            head = head.getNext();
            return(data);
        }else{
        
					  // Write a new version that uses the double link
						// to remove a Node. old version is commented below
    
            Node<T> cursor = head;
            while (cursor != null) {
                if (cursor.getData().equals(data)) {
                    if (cursor.getPrevious() != null) {
                        cursor.getPrevious().setNext(cursor.getNext());
                    } else {
                        head = cursor.getNext();
                    }

                    if (cursor.getNext() != null) {
                        cursor.getNext().setPrevious(cursor.getPrevious());
                    } else {
                        last = cursor.getPrevious();
                    }
                    return (data);  
                }
                cursor = cursor.getNext();
            }

            return (null);

						/*
            Node<T> cursor = head.getNext();
            Node<T> previous = head;
            while (cursor != null){
                if (cursor.getData().equals(data)){
                    previous.setNext(cursor.getNext());
                    return(data);
                }
                cursor = cursor.getNext();
                previous = previous.getNext();
            }
            return(null);
						*/
        }  
    }

    public boolean contains(T data){
        // TODO: Module 8 Exercise
        // very similar to remove() but you just return true if you find it
        // false otherwise

        Node<T> cursor = head;
        while (cursor != null) {
            return(cursor.getData().equals(data));
        }

        return(false);
    }

    public int indexOf(T data){
        // TODO: Module 8 Exercise
        // identical to contains(), but you return the index where it was found
        //  returns -1 if it is not found
        //  use a counter variable

        Node<T> cursor = head;
        int count = 0;
        while (cursor != null) {
            if (cursor.getData().equals(data)) {
                return count;
            } else {
                count++;
                cursor = cursor.getNext();
            }
        }

        return(-1);
    }

    public void clear(){
        // TODO: Module 8 Exercise
        head = null;
        last = null; 
    }

    public int size(){
        // TODO: Module 8 Exercise
        // see the get(int) method 
        if (isEmpty()){
            return(0);
        }else{
            int count = 0;
            Node<T> cursor = new Node<>();
            cursor = head;
            while (cursor != null){
                count++;
                cursor = cursor.getNext();
            }
            return(count);
        }
    }

    public String toString(){
        // TODO: Module 8 
        // Similar to size(), but with accumulating the string
        String output = "";

        if (isEmpty()) {
            return (output);
        } else {
            Node<T> cursor = new Node<>();
            cursor = head;
            output += "[";
            while (cursor != null) {
                if  (cursor.getNext() == null) {
                    output += cursor.getData();
                    output += "]";
                    cursor = cursor.getNext();
                } else {
                    output += cursor.getData();
                    output += ", ";
                    cursor = cursor.getNext();
                }
            }        
        }
        return(output);
    }

}
