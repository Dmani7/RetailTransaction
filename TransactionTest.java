public class TransactionTest {
 
    public static void main(String[] args) {
   //Create Transaction object
        Transaction transaction = new Transaction(12345, "John Doe");
        
        //Add line items
        transaction.addLineItem("Colgate Toothpaste", 2, 2.99);
        transaction.addLineItem("Bounty Paper Towels", 1, 1.49);
        transaction.addLineItem("Kleenex Tissue ", 1, 2.49);
        
        //Print transaction description using toString() method
        System.out.println(transaction.toString());
        
        //Update line item
        transaction.updateItem("Colgate Toothpaste", 3, 22.50);
        
        System.out.println("\n-------- Updated Transction details ---------");
        System.out.println(transaction.toString());
  
    }
  
 }