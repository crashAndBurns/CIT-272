public class Product {
    // Attributes
    // Note I had to set them to protected so that I could use them in
    // the subclasses
    private int productID; // Assuming product IDs are numerical only
    private String name;
    private String description;
    private double price;

    // Emptry Constructor
    public Product() {
        this.productID = 0;
        this.name = "";
        this.description = "";
        this.price = 0.0;
    }

    // Constructor using all fields
    public Product(int productID, String name, String description, double price) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
    }


    public int getProductID() {
        return this.productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // To string method inherited from generic object class
    // makes it so we can use System.out.println on objects with this
    // class.
    public String toString() {
        String result = "";
        result += "Product ID: " + this.productID + "\n";
        result += "Name: " + this.name + "\n";
        result += "Description: " + this.description + "\n";
        result += "Price: " + this.price;

        return result;
    }
}
