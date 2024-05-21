package m3;

    public class one {
        // Inner class
        public class books {
            String bookTitle;
            String bookAuthor;
            int publishYear;
    
            // Constructor
            public books(String bookTitle, String bookAuthor, int publishYear) {
                this.bookTitle = bookTitle;
                this.bookAuthor = bookAuthor;
                this.publishYear = publishYear;
            }
    
            // Method to display book information
            public void displayInfo() {
                System.out.println("Title: " + bookTitle);
                System.out.println("Author: " + bookAuthor);
                System.out.println("Published: " + publishYear);
            }
        }
    
        public static void main(String[] args) {
            // Create an instance of the Main class
            one mainInstance = new one();
            
            // Create an instance of the books class using the mainInstance to call the method
            one.books myBook = mainInstance.new books("A Court of Silver Flames", "Sarah J. Maas", 2012);
            
            // Now you can use myBook object to access its methods, like displayInfo()
            myBook.displayInfo();
        }
    }