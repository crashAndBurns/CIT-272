import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Create a new array of 10 integers
        // in java a byte is 8, a short is 16, and a long is 64bytes,an int is 32
        // each int has 4 bytes * 10 ints = 40 bytes allocated for this array
        int[] nums = new int[10];

        // ANother way using implicit definition
        int[] otherNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] foo = nums;

        // both point to the same object in memory
        // The very first number is the one pointed to by the variable
        // nums points to  0x0008 (nums + 0) => 2
        // the next number 0x0009 (nums + 1) => 4 
        //                 0x000A (nums + 2) => 6
        //                 0x0011 (nums + 9) => 20
        //                 ...
        //                 0x0012 ???? might not be available
        //  System.out.println(foo);
        // System.out.println(nums);
    
        // an array index is an offeset of a memory location
        // This is why the index starts at zero
        // In assembly language when you create an array you are
        // manipulating memory directly

        // C style arrays are less flexible because they can't be
        // resized because they are one contiguous block of memory.

        // copy an old array into a new array
        // and resize an array
        int[] temp = new int[15];
        for (int i = 0; i < 10; i++) {
            temp[i] = nums[i];
        }
        nums = temp;

        // index number is dependent on the size of the array
        // so this is  why an array has to contain the same data type.
        // SO why use arrays?
        // Arrays are fast and efficient because the array
        // instructions are built directly into the cpu
        // many instructions are 1 instruction which may be say 6 data cycles
        // python lists may use more cycles which means using them is
        // alot slower.
        
        // They work really well when you know how many items you'll work
        // with and that they'll be the same data type?
        // Strings are a type of character array.
        
        // you can use array names as variables
        otherNums[3]  = otherNums[1] + (int) Math.sqrt(otherNums[5]);
        otherNums[nums[5]] = 2;

        // you can have an array of ararys (Multi Dimensional Arrays);
        // useful for tabular data.
        // multi-dimensional arrays can be a mind bender
        // the hard part is creating a loop to access the array.
        // and remembering which variables go where.

        // Java ArrayList is used when you need flexibility in the
        // size of the array when you don't know  how big your array
        // might need to be.

        // It's a compromise between the inflexible Array and the
        // Flexible Python List. You still need to use the same 
        // data type but the size is flexible.
        // You still need to specify the data type.

        // An ArrayList can't hold primitive data types (int, double, etc).
        // You MUST hold objects in an ArrayList
        // ArrayList<int> fooo = new ArrayList<>();

        // To store a primitive you need to use a wrapper class
        ArrayList<Integer> fooo = new ArrayList<>();

        // Using inheritance you can hold different data types
        // Use the most senior superclass for your array list
        // and it will work for any subclass because the subclass 
        // IS a type of superclass.

        // ArrayLists are also pointers
        // ArrayLists are resizable but not capable of holding
        // multiple data types.
        // import java.util.Arraylist;

        ArrayList<String> names = new ArrayList<>();  // This is an empty list
        // ArrayList doesn't use bracket notation, only methods.
        // Add items to an ArrayList
        names.add("Luke");  // Item number 0
        names.add("Leia");
        names.add("Han Solo");
        names.add("Chewbacca");
        names.add("Yoda");
        names.add("R2-D2");  // Item number 5

        names.add(2, "C3PO");
        // inserts a new object at the specified index number
        // Current index and above will be shifted up.

        // get an object by "index" number?
        String name = names.get(0);
        System.out.println(name);
        System.out.println(names.get(0));

        // get the number of objects in the list
        System.out.println("Size of names: " + names.size());

        // remove an object from thelist
        String removedName = names.remove(0);
        System.out.println(names.get(0));
        //  When you remove an idex number, all the other items
        // get shifted down. You never have an empty index number.

        // Remove by object
        // Removes first occurence if it's present, if the list doesn't
        // contain the element then returns false, returns true if the
        // item exists and was removed.
        names.remove("Luke");

        if (names.remove("Vader")) {
            System.out.println("Vader removed from the list.");
        } else {
            System.out.println("Vader was not found in the list.");
        }

        // you can not compare objects with == you need to use the
        // equals method.

        /*
        Object item1 = new Object();
        Object item2 = new Object();
        Object item3 = item2;

        if (item1 == item2) {
            // Compares the hash values of the two items for equality of value.
            System.out.println("Item 1 Equals item 2");
        } else {
            System.out.println("Item 1 does not equal item 2");
        }

        if (item2 == item3) {
            // Compares the hash values of the two items for equality
            // Checks to see if the variables point to the same object.
            System.out.println("Item 2 Equals item 3");
        } else {
            System.out.println("Item 2 does not equal item 3");
        }

        if (removedName.equals("Luke")) {
            // Need to use .equals() to compare any object.
            // Need to implement .equals() for any object we want to compare.
            // Different objects may have equality differently.
        }
        */

        // Check to see if a list  contains an object
        // Object must implement .equals()
        names.contains("Leia");

        // Finds index of f irst occurence of an object
        // Object must implement .equals()
        System.out.println(names.indexOf("Han Solo"));

        // Sets the object at index 0 to the new value
        // ie. modifies the element at a particular index.
        names.set(0, "Lando");
        System.out.println(names.get(0));

        for (String n: names) {
            System.out.println(n);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        

    }
}