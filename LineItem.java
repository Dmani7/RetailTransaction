public class LineItem {
 
    // Declare all required variables
    private String itemName;
    private int quantity;
    private double price;
  
    // Parameterized constructor
    public LineItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
  
    // Getter method for ItemName
    public String getItemName() {
        return itemName;
    }
  
    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }
  
    // Getter method for price
    public double getPrice() {
        return price;
    }
  
    // Getter method Total Price
    public double getTotalPrice() {
        double totalPrice;
        totalPrice = quantity * price;
        return totalPrice;
    }
  
    // Setter method to set quantity
    public void setQuantity(int x) {
        quantity = x;
    }
  
    // Setter method to set price
    public void setPrice(double y) {
        price = y;
    }
  
    // toString() to get line item description
    public String toString() {
        String lineItemDescription;
        lineItemDescription = (itemName + "\t\t\tqty " + quantity + " @ $" + price + "\t\t" + "$" + getTotalPrice());
        return lineItemDescription;
    }
 }