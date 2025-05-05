
public class Main {
    public static void main(String[] args) {
        // Instantiate a new binary tree called phoneticAlphabet 
        // containing strings. "Alpha", "Bravo", "Charlie" ...
        BinaryTree<String> phoneticAlphabet = new BinaryTree<String>();

        //                  C
        //           A             Z
        //                      R
        //                    D
        //                      Q
        //                     E

        // insert seven items into the tree
        phoneticAlphabet.orderedInsert("Charlie");
        phoneticAlphabet.orderedInsert("Alpha");
        phoneticAlphabet.orderedInsert("Zulu");
        phoneticAlphabet.orderedInsert("Romeo");
        phoneticAlphabet.orderedInsert("Delta");
        phoneticAlphabet.orderedInsert("Quebec");
        phoneticAlphabet.orderedInsert("Echo");

        String[] alphabet = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", 
                             "Gulf", "Hotel", "India", "Juliet", "Kilo", "Lima", 
                             "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", 
                             // ...
                             "Zulu"};

        // Testing for data that exist. Searched for 
        // Several different items in the alphabet array. Should return seven instances
        // of <letter> was found!.
        int count = 0;
        for (String letter: alphabet) {
            if(phoneticAlphabet.search(letter)) {
                System.out.println(letter + " was Found!");
                count++;
            }
        }  

        if (count == 7) {
            System.out.println("Test for data that exists passed!");
        }
        
        // Testing for data that does not exist. Searched for items in alphabet that don't exist in phoneticAlphabet.
        count = 0;
        for (String letter: alphabet) {
            if (!phoneticAlphabet.search(letter)) {
                count++;
            }
        }

        if (count == 14) {
            System.out.println("Test for non-existing items passed");
        }
        
        System.out.println("Printing Alphabet in Order");
        phoneticAlphabet.printInOrder();
        System.out.println("Printing Alphabet Preorder");
        // C, A, Z, R, D, Q, E 
        phoneticAlphabet.printPreOrder();
        System.out.println("Printing Alphabet Postorder");
        phoneticAlphabet.printPostOrder();
        // A, E, Q, D, R, Z, C


        // Instantiate a new tree of integers for testing the pre and post order print methods
        BinaryTree<Integer> integerTree = new BinaryTree<>();

        // Insert test values, should produce a tree that looks like:
        //          5
        //       4     6
        //     3     5    7
        //   2

        integerTree.orderedInsert(5);
        // less than 5, go left
        integerTree.orderedInsert(4);
        // greater than 5, go right
        integerTree.orderedInsert(6);
        // Greater than 5, go right
        // less than 6, go left;
        integerTree.orderedInsert(5);
        // less than 5, go left, less than 4, go left
        integerTree.orderedInsert(3);
        // greater than 5, go right, greater than 6, go right
        integerTree.orderedInsert(7);
        // Less than 5, go left, less than 4 go left, less than 3 go left
        integerTree.orderedInsert(2);

        System.out.println("Printing In Order:");
        // Should print numbers in order 2, 3, 4, 5, 5, 6, 5, 7, ...
        integerTree.printInOrder();

        System.out.println("Printing in Pre Order:");

        // Should print numbers in pre order 5, 4, 3, 2, 6, 7 ...
         integerTree.printPreOrder();

        // Should Print numbers in post order 2, 3, 4, 7, 6, 5
         System.out.println("Printing In Post Order:");
         integerTree.printPostOrder();
    }    
}