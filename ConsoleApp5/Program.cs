using System;
using System.Runtime.InteropServices;
using System.Collections.Generic;

namespace ConsoleApp5
{
    class Program
    {
        private static void Main(string[] args)
        {
            Library library = new Library(); //instance of library

            bool isRunning = true;

            while (isRunning)
            {
                //Display menu options
                Console.WriteLine("Welcome to the Library. What would you like to do?");
                Console.WriteLine("1. Add a Book");
                Console.WriteLine("2. List all Books");
                Console.WriteLine("3. Find by Book Title");
                Console.WriteLine("4. Find by Author");
                Console.WriteLine("5. Exit");
                Console.Write("Choose an option: ");

                string choice = Console.ReadLine(); // Get user choice

                switch (choice)
                {
                    case "1":
                        AddBook(library); // Add book to library
                        break;
                    case "2":
                        library.ListBooks(); // List all books in the books file
                        break;
                    case "3":
                        SearchByTitle(library); // Search for a book by the title
                        break;
                    case "4":
                        SearchByAuthor(library); // Search for a book by the author
                        break;
                    case "5":
                        isRunning = false; // Exit program
                        break;
                    default:
                        Console.WriteLine("Invalid choice. Please try again."); // Handle invalid input
                        break;
                }
            }
        }
        //Method to add book to the library
        static void AddBook(Library library)
        {
            Console.Write("Enter Book Title: ");
            string title = Console.ReadLine();

            Console.Write("Enter Author Name: ");
            string author = Console.ReadLine();

            Book book = new Book(title, author);
            library.AddBook(book);
        }

        //Method to seach for book by title
        static void SearchByTitle(Library library)
        {
            Console.Write("Enter title: ");
            string title = Console.ReadLine();
            Book book = library.SearchByTitle(title);

            if (book != null)
            {
                book.Display();
            }
            else
            {
                Console.WriteLine("Book not found.");
            }
        }

        //Method to search for book by author
        static void SearchByAuthor(Library library)
        {
            Console.Write("Enter author name: ");
            string author = Console.ReadLine();
            Book book = library.SearchByAuthor(author);

            if (book != null)
            {
                book.Display(); // display book info when found
            }
            else
            {
                Console.WriteLine("Book not found."); //message if not found
            }
        }
        public class Book
        {
            public String Title { get; set; }
            public String Author { get; set; }

            public Book(String title, String author)
            {
                Title = title;
                Author = author;
            }

            public void Display()
            {
                Console.WriteLine($"Title: {Title}, Author: {Author}");
            }
        }
        public class Library
        {
            private List<Book> books;
            private const string FileName = "library_books.txt";

            public Library()
            {
                books = new List<Book>();
                LoadFromFile();
            }

            public void AddBook(Book book)
            {
                books.Add(book);
                Console.WriteLine("Book added successfully");
                SaveToFile();
            }

            public void ListBooks()
            {
                if (books.Count == 0)
                {
                    Console.WriteLine("No books in this library.");
                    return;
                }
                foreach (var book in books)
                {
                    book.Display();
                }
            }

            //Method to search for book by title
            public Book SearchByTitle(string title)
            {
                return books.Find(book => book.Title.Equals(title, StringComparison.OrdinalIgnoreCase));
            }

            //Method to search for book by author
            public Book SearchByAuthor(string author)
            {
                return books.Find(book => book.Author.Equals(author, StringComparison.OrdinalIgnoreCase));
            }

            //Method to save the list of books to a file
            private void SaveToFile()
            {
                using (StreamWriter writer = new StreamWriter(FileName))
                {
                    foreach (var book in books)
                    {
                        writer.WriteLine($"{book.Title}|{book.Author}"); //Write each book into the file
                    }
                }
            }

            //Method to load the list of books from a file
            private void LoadFromFile()
            {
                if (File.Exists(FileName)) //Check to make sure file exists and loads information from it
                {
                    using (StreamReader reader = new StreamReader(FileName)) // caller to read info
                    {
                        string line;
                        while ((line = reader.ReadLine()) != null)
                        {
                            //Console.WriteLine("Read line: " + line); // Debug print to check reading
                            string[] parts = line.Split('|');
                            if (parts.Length == 2)
                            {
                                Book book = new Book(parts[0], parts[1]);
                                books.Add(book); // Add book to the list
                            }
                        }
                    }
                }
            }
        }
    }
}
