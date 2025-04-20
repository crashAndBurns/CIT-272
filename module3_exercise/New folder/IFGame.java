import java.util.Scanner;

public class IFGame {
    public static void main(String[] args) {

        // Initialize and link rooms
        Room entry = new Room("House Entry", "The old house is in disrepair. You see a collapsed staircase in front of you, and there are rooms to the east and west.", "", false, true);

        Room eastRoom = new Room("Dining Area", "This room still contains dining furniture and place settings. Very old rotten food is still on the plates, and glasses are stained with old, dried wine.", "You hear what sounds like a small animal scurrying away.", false, false);

        Room westRoom = new Room("Living Area", "There is old furniture, still holding together, but with rotting upholstery, some obviously attacked by rodents looking for nesting material. In the southwest corner there is a hole in the floor where the boards have rotted through. Water is slowly dripping from another hole in the ceiling in the same corner.", "", false, false);

        // Linking rooms with exits
        entry.setExit("east", eastRoom);
        entry.setExit("west", westRoom);
        eastRoom.setExit("west", entry);
        westRoom.setExit("east", entry);

        // STEP 6 - Create an Item with name and short description
        Item sword = new Item("sword", "This sword has seen better days");

        // STEP 6 - Add item to the eastRoom
        eastRoom.addItem(sword);

        Scanner input = new Scanner(System.in);

        Player player = new Player(entry);
        String playerInput = "";
        String command = "";
        String arg = "";
        boolean gameRunning = true;


        System.out.println(player.getCurrentRoom());

        while (gameRunning){
            System.out.print("> "); // Print the input prompt
            playerInput = input.nextLine(); // Get the input
            playerInput = playerInput.strip().toLowerCase(); // Strip and lowercase
            String[] cmdParts = commandSplit(playerInput); // Split into two parts
            command = cmdParts[0]; // Initial command is the first part
            if (cmdParts.length > 1){ // If there *are* two parts...
                arg = cmdParts[1];    // ...the argument is the second part
            }

            // Ok, let's process some commands!
            switch(command){
                // Directions first
                case "n":
                case "north":
                case "s":
                case "south":
                case "e":
                case "east":
                case "w":
                case "west":
                case "u":
                case "up":
                case "d":
                case "down":
                    player.move(command);
                    break;
                case "take":
                    player.take(arg);
                    break;
                case "drop":
                    player.drop(arg);
                    break;
                // add case statement for 'drop'
                case "quit":
                    gameRunning = false;
                default:
                    System.out.println("Invalid command");
            }
        }

        input.close();
    }

    /**
     * Splits player input into the initial command and its argument
     * @param inp
     *      Player input string
     * @return
     *      An array with either one element (if it's a single word command)
     *      or two elements if it's a command and a parameter
     */
    public static String[] commandSplit(String inp){
        // Replace the first space with an ampersand
        // Does nothing if there are no spaces
        String modInput = inp.replaceFirst(" ", "&");
        // Split by the ampsersand to get the initial command 
        // and its argument
        String[] tokens = modInput.split("&");
        return(tokens);
    }

}