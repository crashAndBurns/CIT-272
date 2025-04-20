public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Luke");
        names.add("Leia");
        names.add("Han Solo");
        names.add("Chewbacca");
        String foo = names.get(2);
        System.out.println(foo);
        names.remove("Han Solo"); // removes index 2
        System.out.println(names.get(2));

        String[] moreNames = {"Yoda", "Darth Vader", "C3PO", "R2D2"};
        names.add(moreNames);


        Node<String> head = new Node<>("Luke");
        // Node n1 = new Node("Luke"); // n1 is a pointer to a node.
        // // next points to null.
        Node<String> next = new Node<>("Leia");
        head.setNext(next);
        next = new Node<>("Han Solo");
        head.getNext().setNext(next); // sets leia pointer to point to han solo

        // next pointer inside "luke" points to "leia" now.
        // n1.setNext(n2);
        // n2.setNext(n3);

        // we now have a linked structure so that n1.next points to n2
        // n2.next points to n3, and n3.next points to null.
    }
}
