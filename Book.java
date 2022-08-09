/**
* Find the book title, isbn, and total quantity of the book.
* The characteristics are:
*   1) Title
*   2) Isbn
*   3) Quantity
* Instance variables enforce data encapsulation.
* Contains accessor and mutator methods for each instance variable.
*
* @author Omodara, Patrick
* @assignment ICS 111 Assignment 11
* @date 11/21/2021
*/




public class Book {
  
  /** Defines the characteristics of a book. */
    private String title = "";
    private int isbn = 0;
    private double quantity;
    
 /** Constructs a Book object.
  * 
  * @param title: a string for the book title
  * @param isbn: an integer for the book isbn  
  * @param quantity: an integer for the amount of books.
  */
  
    public Book(String title, int isbn, double quantity) {
      this.title = title;
      this.isbn = isbn;
      this.quantity = quantity;    
    } // closes constructor
    
    
    /** Accessor methods. */
    public String getTitle() {
      return this.title;
    }
    
    public int getIsbn() {
      return this.isbn;
    }
    
    public double getQuantity() {
      return this.quantity;
    }
    
    
    /** Mutator methods. */
    public void setTitle(String newTitle) {
      this.title = newTitle;
      
        }
    
    public void setIsbn(int newIsbn) {
      this.isbn = newIsbn;
    }
    
    public void setQuantity(double newQuantity) {
      this.quantity = newQuantity;
    }
    
    /** Returns a string that represents the object.
     * @return output a string that represents the object.
     */
    public String toString() {
      // String used to output the objects. 
       String output = "";
       
       // Concatenate to output the instance variable on separate lines.
       output = "Title: " + title;
       output = "\nISBN: " + isbn;
       output = "\nQuantity: " + quantity;
       
       // Return the built string
       return output;
    } // Closes toString()
    
    
   
   } // End of the Book class.
