public class SmartPhone extends Product {
    // Attributes
    private String make;
    private String model;
    private int storageCapacity; // in Gigabytes

    // Empty Constructor
    public SmartPhone() {
        this.make = "";
        this.model = "";
        this.storageCapacity = 0;
    }

    // Basic constructor
    public SmartPhone(int productID, String name, String description, 
        double price, String make, String model, int storageCapacity) {
        super(productID, name, description, price);
        this.make = make;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Getters and Setters
    // Note because SmartPhone extends the Product class we don't need
    // to rewrite getters and setters for id, name, desc, and price.
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
   
    // To string method inherited from superclass, will make use of
    // super keyword to print superclass to string, then we'll override
    // to print the rest of the object attributes.

    public String toString() {
        String result = super.toString() + "\n";
        result += "Make: " + this.make + "\n";
        result += "Model: " + this.model + "\n";
        result += "Storage Capacity: " + this.storageCapacity + " Gigabytes";
        return result;
    }
    

}
