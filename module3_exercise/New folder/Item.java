public class Item {
    // attributes
    private String name;
    private String desc;

    // constructors
    // An empty default constructor
    public Item() {
        this.name = "A default item";
        this.desc = "A default description";
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // Getters
    public String getName() {
        return (this.name);
    }

    public String getDesc() {
        return (this.desc);
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }

}