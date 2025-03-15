class Product {
    // Attributes
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        // Creating a product instance
        Product product1 = new Product(101, "Laptop", 799.99);
        
        // Displaying product details
        product1.displayProductDetails();
    }
}
