public class Item {
    private String name;
    private String description;
    private int value;
    private boolean keyItem;

    public Item() {

    }
    
    public Item(String name, String description, int value, boolean keyItem) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.keyItem = keyItem;
    }
    
    public String getName() {
        return (name);
    }


    public String getDescription() {
        return (description);
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getValue() {
        return(value);
    }

    public void setValue(int value) {
        this.value = Math.max(value, 0);
    }

    public boolean isKeyItem() {
        return this.keyItem;
    }

}

