/**
 * Creates a Book array of size 4. Creates and stores 4 Book objects
 * in the array and prints them.
 * Tests the constructor, mutator, accessor, and toString methods of the Book class.
 *
 * DO NOT MODIFY THIS PROGRAM.
 * If this file does not compile, or if the output does not match the output shown in the instructions,
 * then the change must be done in your Book.java file.
 *
 * @author Ed Meyer
 */
public class Bookstore {
  
   public static void main(String[] args) {
    
      //////////  DO NOT MODIFY THE CODE //////////
    
      // An array to store 4 Book objects.
      Book[] inventory = new Book[4];
      
      // Test the constructor of your Book class.
      // Initialize each Book object in the array.
      inventory[0] = new Book("Harry Potter and the Sorcerer's Stone", 590353403, 6);
      inventory[1] = new Book("Harry Potter and the Chamber of Secrets", 439064864, 10);
      inventory[2] = new Book("Harry Potter and the Prisoner of Azkaban", 439136351, 3);
      inventory[3] = new Book("Harry Potter and the Goblet of Fire", 439139597, 25);
      
      // Test the mutator methods by modifying the 3rd Harry Potter book.
      inventory[2].setTitle("HARRY POTTER AND THE PRISONER OF AZKABAN");
      inventory[2].setIsbn(439136350);
      inventory[2].setQuantity(50);
      
      // Start printing the books to test the accessor methods and toString method.
      System.out.println("Printing the books in the store...");
      
      // Print the first book by testing each accessor method.
      System.out.printf("Title: %s%n", inventory[0].getTitle());
      System.out.printf("ISBN: %d%n", inventory[0].getIsbn());
    
      System.out.println();
      
      // Print the rest of the books.
      // Test the toString method by looping through the array and printing each book.
      for (int i = 1; i < inventory.length; i++) {
         System.out.print(inventory[i]);
         
         // Pretty output. Separate each book print out with a blank line.
         if (i < (inventory.length - 1)) {
            System.out.println("\n");
         }
      }
      
   }
}