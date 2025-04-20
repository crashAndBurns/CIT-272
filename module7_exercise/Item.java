public class Item {
    // Attributes
    private String name;
    private String description;
    
    // Constructors
    public Item() {
        this.name = "A default item";
        this.description = "A default description";
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
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

}
