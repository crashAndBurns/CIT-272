import java.util.HashMap;

public class Room {
    private String name; // the name of the room
    private String description; // room description, prints when you enter a room or look
    private String firstVisit; // only prints when you first visit a room
    private boolean dark; // whether or not the room is dark
    private boolean visited; // whether or not the room has been visited
    private HashMap<String,Room> exits; // a HashMap/dictionary of room exits
    // STEP 5 - add a new Item array attribute called 'itemList'
    private Item[] itemList;

    public Room() {
        name = "";
        description = "";
        firstVisit = "";
        dark = false;
        visited = false;
        exits = new HashMap<>();
        // STEP 5 - initialize the Array to hold 5 items, all null to start
        itemList = new Item[5];
        for (int i = 0; i < itemList.length; i++) {
            itemList[i] = null;
        }
    }

    // Room constructor, does not set exits
    public Room(String name, String description, String firstVisit, boolean dark, boolean visited) {
        this.name = name;
        this.description = description;
        this.firstVisit = firstVisit;
        this.dark = dark;
        this.visited = visited;
        this.exits =  new HashMap<>();
        // STEP 5 - initialize the Array to hold 5 items, all null to start
        this.itemList = new Item[5];
        for (int i = 0; i < this.itemList.length; i++) {
            this.itemList[i] = null;
        }
    }

     /**
     * Adds an item to player inventory if there is space
     * @param itm
     *      The item being added to the inventory
     */
    public void addItem(Item item){
        // Loop through the inventory Item Array
        for (int i=0; i<itemList.length; i++){
            // If the slot is empty...
            if (itemList[i] == null){
                itemList[i] = item; //... we'll put the new item here
                return; // end the function, since we're done
            }
        }
        // If we get through the whole array and no empty slots were found,
        // tell the player there's no room
        System.out.println("There is no inventory space left. Item not added.");
    } 

    /**
     * Removes item from item list 
     * @param itemName
     *      The name of the item being removed
     * @return
     *      A reference to the Item, or null if the item is not in the inventory
     */
    public Item removeItem(String itemName){
        // STEP 5 - Implement the following algorithm
        //      it will be nearly identical to the Player version
        // Loop through the inventory array
        //      if the current item's name is equal to the itemName
        //          Create a new Item variable that points to the current item
        //          set the current inventory index equal to null (remove the item)
        //          return the Item reference
        // If you get through the whole array and haven't found the item
        // do this.
        for (int i = 0; i < itemList.length; i++) {
            if (itemList[i].getName() == itemName) {
                Item currentItem = itemList[i];
                itemList[i] = null;
                System.out.println(currentItem.getName() + " picked up.");
                return (currentItem);
            }
        }
        return null;
    }

    /**
     * Creates new exits for a room
     * @param dir
     *      The direction of the exit (e.g., "north", "west", "up")
     * @param r
     *      The room that exit goes to
     */
    public void setExit(String direction, Room r){
        // Use the HashMap put() method to create the key/value pair
        this.exits.put(direction, r);
    }

    /**
     * Retrieves the room corresponding to an exit if one exists 
     * @param direction
     *      The direction being checked for an exit
     * @return
     *      null if there isn't an exit in that direction
     *      a Room reference if there *is* an exit in that direction
     */
    public Room getExit(String direction){
        return(this.exits.get(direction));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstVisit() {
        return this.firstVisit;
    }

    public void setFirstVisit(String firstVisit) {
        this.firstVisit = firstVisit;
    }

    public boolean isDark() {
        return this.dark;
    }

    public boolean getDark() {
        return this.dark;
    }

    public void setDark(boolean dark) {
        this.dark = dark;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public HashMap<String,Room> getExits() {
        return this.exits;
    }

    public void setExits(HashMap<String,Room> exits) {
        this.exits = exits;
    }

    @Override
    public String toString() {
        String result = getName() + "\n" +
            getDescription() + "\n";
        if (!isVisited()){
            result += getFirstVisit() + "\n";
        }
        // STEP 5 - print items in room
        // loop through itemList array
        //      if item is not null
        //      add the item's name to the result string
        for (int i= 0; i < itemList.length; i++) {
            if (itemList[i] != null) {
                result += itemList[i].getName() + " " + itemList[i].getDesc();
            }
        }
        
        return(result);
    }


}
