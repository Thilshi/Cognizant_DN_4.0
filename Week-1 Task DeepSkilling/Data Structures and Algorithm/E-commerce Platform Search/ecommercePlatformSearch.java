import java.util.*;

//Step 2: Product Class
class Product {
 int productId;
 String productName;
 String category;

 public Product(int productId, String productName, String category) {
     this.productId = productId;
     this.productName = productName;
     this.category = category;
 }

 public String toString() {
     return productId + ": " + productName + " (" + category + ")";
 }
}

public class ecommercePlatformSearch {

 // Step 3a: Linear Search
 public static Product linearSearch(Product[] products, String name) {
     for (Product p : products) {
         if (p.productName.equalsIgnoreCase(name)) {
             return p;
         }
     }
     return null;
 }

 // Step 3b: Binary Search (requires sorted array)
 public static Product binarySearch(Product[] products, String name) {
     int low = 0, high = products.length - 1;
     while (low <= high) {
         int mid = (low + high) / 2;
         int cmp = products[mid].productName.compareToIgnoreCase(name);
         if (cmp == 0)
             return products[mid];
         else if (cmp < 0)
             low = mid + 1;
         else
             high = mid - 1;
     }
     return null;
 }

 public static void main(String[] args) {
     // Step 2: Setup Product Array
     Product[] products = {
         new Product(101, "Laptop", "Electronics"),
         new Product(102, "Shoes", "Fashion"),
         new Product(103, "Mobile", "Electronics"),
         new Product(104, "Watch", "Accessories")
     };

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter product name to search: ");
     String searchName = scanner.nextLine();

     // Step 3: Perform Linear Search
     System.out.println("\n Linear Search Result:");
     Product resultLinear = linearSearch(products, searchName);
     System.out.println(resultLinear != null ? resultLinear : " Product not found!");

     // Step 3b: Sort for Binary Search
     Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

     // Step 3: Perform Binary Search
     System.out.println("\n Binary Search Result:");
     Product resultBinary = binarySearch(products, searchName);
     System.out.println(resultBinary != null ? resultBinary : "Product not found!");
 }
}
