public class Player {
    private Room currentRoom;
    // STEP 4 - Add an 'inventory' attribute that is
    //   an Array that holds Items
    private Item[] inventory;

    public Player(){
        this.currentRoom = null;
        // STEP 4 - Initialize the Item array to hold 10 Items
        this.inventory = new Item[10];
        for (int i = 0; i < this.inventory.length; i++) {
            this.inventory[i] = null;
        }
    }

    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        // STEP 4 - Initialize the Item array to hold 10 Items
        this.inventory = new Item[10];
        for (int i = 0;  i < this.inventory.length; i++) {
            this.inventory[i] = null;
        }
    }

    /**
     * Moves the player to a new Room corresponding to the direction
     * if a Room in that direction exists
     * @param direction
     *      The direction attempting to move
     */
    public void move(String direction){
        // Use getExit() from the currentRoom
        // Returns null if there is no room in that direction
        Room newRoom = currentRoom.getExit(direction);
        // If the newRoom does not equal null
        if (newRoom != null){
            // That means there is a room in that direction
            // set the currentRoom equal to the newRoom
            currentRoom = newRoom;
            // Print the currentRoom
            System.out.println(currentRoom);
            // If the currentRoom has not been visited
            if (!currentRoom.isVisited()){
                // set visited to true using setter method
                currentRoom.setVisited(true);
            }
        // if newRoom IS null, then there isn't a room in 
        // that direction. Print "You can't move that way"
        }else{
            System.out.println("You can't move that way.");
        }
    }

    /**
     * look() - prints the description of the current room
     */

    /**
     * Adds an item to player inventory if there is space
     * @param itm
     *      The item being added to the inventory
     */
    public void addItem(Item item){
        // Loop through the inventory Item Array
        for (int i=0; i<inventory.length; i++){
            // If the slot is empty...
            if (inventory[i].equals(null)){
                inventory[i] = item; //... we'll put the new item here
                System.out.println(item.getName() + " added to inventory.");
                return; // end the function, since we're done
            }
        }
        // If we get through the whole array and no empty slots were found,
        // tell the player there's no room
        System.out.println("There is no inventory space left. Item not added.");
    }    

    /**
     * Removes item from inventory 
     * @param itemName
     *      The name of the item being removed
     * @return
     *      A reference to the Item, or null if the item is not in the inventory
     */
    public Item removeItem(String itemName){
        // STEP 4 - Implement the following algorithm
        // Loop through the inventory array
        //      if the current item's name is equal to the itemName
        //          Create a new Item variable that points to the current item
        //          set the current inventory index equal to null (remove the item)
        //          return the Item reference
        
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getName() == itemName) {
                Item currentItem = inventory[i];
                inventory[i].equals(null);
                System.out.println(currentItem.getName() + " removed from inventory.");
                return currentItem;
            }
        }
        // If you get through the whole array and haven't found the item
        // do this.
        return null;
    }

    public void take(String itemName){
        // STEP 4 - Implement the following algorithm
        // HINT - you have to use the return value of removeItem()
        // removeItem() from currentRoom
        // addItem() to inventory
        currentRoom.removeItem(itemName);
        addItem(currentRoom.removeItem(itemName));
        // delete this line
        // System.out.println("Not implemented.");
    }

    public void drop(String itemName){
        // STEP 4 - Implement the following algorithm
        // HINT - you have to use the return value of removeItem()
        // removeItem() from inventory
        // addItem() to currentRoom
       

        // delete this line
        System.out.println("Not implemented.");
    }

    public void inventory(){
        // loop through inventory array
        //      if the item is not null
        //      print it
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.println(inventory[i].getName());
            }
        }
    }
    
    /**
     * currentRoom getter
     * @return
     *      A reference to the currentRoom object
     */
    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    /**
     * currentRoom setter
     * @param currentRoom
     *      a reference to the new currentRoom object
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

}
