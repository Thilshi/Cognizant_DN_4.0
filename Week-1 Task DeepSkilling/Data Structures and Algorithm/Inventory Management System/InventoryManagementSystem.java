import java.util.*;

class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - Qty: " + quantity + " - ₹" + price;
    }
}

class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.productId, p);
        System.out.println(" Added: " + p.productName);
    }

    public void updateProduct(String productId, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println(" Updated: " + productId);
        } else {
            System.out.println(" Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        if (products.remove(productId) != null)
            System.out.println(" Deleted: " + productId);
        else
            System.out.println(" Product not found!");
    }

    public void showInventory() {
        System.out.println(" Inventory List:");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}

public class InventoryManagementSystem {
	
    public static void main(String[] args) 
    {
        Inventory inv = new Inventory();

        Product p1 = new Product("P001", "Laptop", 10, 55000);
        Product p2 = new Product("P002", "Monitor", 5, 12000);
        Product p3 = new Product("P003", "Keyboard", 50, 500);

        inv.addProduct(p1);
        inv.addProduct(p2);
        inv.addProduct(p3);

        inv.updateProduct("P002", 7, 11500);
        inv.deleteProduct("P003");

        inv.showInventory();
    }
}
