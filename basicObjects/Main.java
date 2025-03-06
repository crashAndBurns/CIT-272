import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int x = 0; // Primitive data type
        Scanner stdin = new Scanner(System.in); // An object type...

        // Create a new character:
        Character myChar = new Character(); // Character Constructor
        myChar.setName("Stanislauv"); // Dot notation is how you access
        // attributes and methods of a particular object.

        Character myNewChar = new Character("Stan", "Human", 7, 100000, 48);
        System.out.println("Hello, " + myNewChar.getName());

        myNewChar.printInfo();

        myNewChar.applyDamage(23);
        myNewChar.printInfo();
        myNewChar.applyHealing(32);
        myNewChar.printInfo();

        stdin.close();
    }
}