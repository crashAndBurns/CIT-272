

public class LinkedList<E extends Comparable<E>> {

    private Node<E> head;

    // Create an empty linked list
    public LinkedList() {
        head = null;
    }

    /**
     * Adds an element to the linked list
     * @param data
     *  The data we are adding to the list.
     */
    public void add(E data) {
        Node<E> temp = new Node<>(data);
        if (isEmpty()) { // If list is empty.
            head = temp;  // Point head to the new Node
        } else {
            Node<E> cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(temp);
        }
    }

    public void add(E[]  items) {
        for (E item: items) {
            add(item);
        }
    }

    public E get(int i) {
        if (isEmpty()) {
            // Throw new IndexOutOfBoundsException("List index out of bounds");
            return(null);
        } else {
            Node<E> cursor = head;
            for (int j = 0; j < i; j++) {
               cursor = cursor.getNext();
               if (cursor == null) { // i is greater than size of list
                return (null);
               }
            }
            return (cursor.getData());
        }
    }

    // remove function
    public boolean remove(E item) {
        if (isEmpty()) {
            return (false);
        } else {
            Node<E> cursor = head.getNext();
            Node<E> previous = head;
            while (cursor != null) {
                if (item.compareTo(cursor.getData()) == 0) { // if we've found the right object
                    previous.setNext(cursor.getNext());
                    return true;
                    // cursor and previous pointers get gc'd
                    // Cursor node also gets gc'd becasue nothing is pointing to it.
                }
                cursor = cursor.getNext(); // move the pointer to the next Node.
                previous = previous.getNext();
            }
            return (false);
        }
    }

    public int removeAll(E item) {
        int count = 0;
        if (remove(item)) {
            count++;
        }
        return (count);
    }

    public boolean isEmpty() {
        return (head == null);
    }

}
