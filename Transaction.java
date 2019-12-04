import java.text.DecimalFormat;
import java.util.ArrayList;

public class Transaction {
    
    // Declare all required variables
    private ArrayList<LineItem> lineItems;
    private int customerID;
    private String customerName;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
  
    // Parameterized constructor
    public Transaction(int customerID, String customerName) {
  
        this.customerID = customerID;
        this.customerName = customerName;
  
        // Create ArrayList object and assign to lineItems
        lineItems = new ArrayList<LineItem>();
    }
  
    // Method to add lineItem
    public void addLineItem(String itemName, int quantity, double price) {
  
        // Create line item object by passing itemName, quantity, price
        LineItem lineItem = new LineItem(itemName, quantity, price);
  
        // Add lineItem to lineItems
        lineItems.add(lineItem);
        
        public String addLineItem(){
            
            lineItems.add(new LineItem("Colgate Toothpaste", 2,2.99));
            lineItems.add(new LineItem("Bounty Paper Towels", 1, 1.49));
            lineItems.add(new LineItem("Kleenex Tissue", 1, 2.49));
            //System.out.println(lineItems);
            return ("colgate not found");
        }
        

        public String updateItem(){

           return null;

        }
    }
  
    // Method to update line item
    public void updateItem(String itemName, int quantity, double price) {
  
        boolean isFound = false;
        LineItem lineItem = null;
  
        // Find the line item by itemName
        for (int i = 0; i < lineItems.size(); i++) {
            lineItem = lineItems.get(i);
            if (lineItem.getItemName().equalsIgnoreCase(itemName)) {
                isFound = true;
                break;
            }
        }
  
        // Check if line item found or not, if found update quantity
        if (isFound) {
            lineItem.setQuantity(quantity);
        } else {
            System.out.println("Line item not found with given item name!");
        }
    }
  
    // Method to get Total price
    public double getTotalPrice() {
  
        double totalPriceOfLineItems = 0;
  
        // Iterate over all line items
        for (int i = 0; i < lineItems.size(); i++) {
            totalPriceOfLineItems = totalPriceOfLineItems + lineItems.get(i).getTotalPrice();
        }
  
        return totalPriceOfLineItems;
    }
  
    // Get Line item by item name
    public String getLineItem(String itemName) {
  
        boolean isFound = false;
        LineItem lineItem = null;
  
        // Find the line item by itemName
        for (int i = 0; i < lineItems.size(); i++) {
            lineItem = lineItems.get(i);
            if (lineItem.getItemName().equalsIgnoreCase(itemName)) {
                isFound = true;
                break;
            }
        }
  
        // Check if line item found or not
        if (isFound) {
            return lineItem.toString();
        } else {
            return "Line item not found with given item name!";
        }
    }
  
    // toString() method to return transaction description
    public String toString() {
  
        String transctionDescription;
        
        //Get line items description
        String linItemsDescription = "";
        for(int i=0;i<lineItems.size();i++) {
            linItemsDescription = linItemsDescription + lineItems.get(i).toString() + "\n";
        }
        
        transctionDescription = "Customer ID : " + customerID + "\nCustomer Name : " + customerName + "\n"
                + linItemsDescription + "Transaction Total : \t\t\t$" + decimalFormat.format(getTotalPrice());
        
        return transctionDescription;
    }
    
}
