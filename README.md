This is a basic Java mini project that works as a book store management. The system provides 
functionality for two types of users. (Admin and User). Admin can add new books and view 
the current list of available books in the store, while users can browse the available books, 
purchase books, and return them. 

#DETAILED EXPLANATION OF THE CODE: <br>
##BOOK CLASS <br>
The Book class is used to represent a book object. Each book has the following attributes: <br>
 name: The title of the book <br>
 author: The author of the book <br>
 price: The price of the book <br>
 genre: The genre of the book (e.g., fiction, non-fiction, self-help) <br>
 stock: The number of copies of the book available in the store <br>
This class includes: <br>
 A constructor to initialize a book object with all the necessary details. <br>
 Getter and setter methods for accessing and modifying the book’s attributes. <br>
 Methods to reduce stock and increase stock when a book is purchased and returned. <br>
 An Overridden toString() method to represent the book details in a readable format. <br>
##STORE_MANAGEMENT CLASS <br>
This class is responsible for Managing the store Operations like Displaying the Available 
books and its stock, Buying the book, Returning the book. <br>
This Class includes: <br>
 A HashMap is used to store books where the book name is key, and the Book object is 
the value. <br>
 Methods to: <br>
1. Add books <br>
 This method adds books to the HashMap in the store’s inventory. <br>
  It takes a Book object as input, which contains all the book details (like 
title, author, price, genre, and stock). <br>
 The book is added to the HashMap using the book's title as the key and 
the Book object as the value. <br>
OverLoaded Add books <br>
 This method adds a book to the HashMap by taking the book's details 
individually from the admin. Admin can add a new Book to the store 
whenever he wants to add. <br>
 This method takes the title, author, price, genre, and stock as inputs. <br>
 A new Book object(Book) is created inside the method and is added to 
the HashMap, with the book's title as the key. <br>
2. Display <br>
 The display() method allows both Admin and User to view all the books 
currently available in the store. It provides a list of all the books and 
their details, such as title, author, price, genre, and stock. <br>
 When this method is called, it first checks if the store(HashMap) is 
empty. <br>
 If there are no books in the store, it displays a message that no books are 
available. <br>
 If there are books in the store, it loops through all the books in the 
HashMap and prints their details <br>
3. Buy book: <br>
 The buyBook()  method allows a User to purchase a book from the store. <br>
 The method takes two parameters: Name, which is the name of the book <br>
the user wants to purchase, and Address, which is the address where the 
book will be delivered.<br>
 The method first checks if the book with the provided name exists in the 
store. If the book is found, it checks if the stock is available. <br>
 If the book is in stock, the stock is reduced by 1, and a confirmation 
message is displayed to the user, that the book will be delivered soon. <br>
 If the book is out of stock, Message is displayed that the book is 
unavailable. <br>
 If the book is not there in the store, a message is displayed that the book 
is not available.<br>
4. Return book:  <br>
 The returnBook() method allows a User to return a book to the store. <br>
 The method takes the Name of the book to be returned as its parameter. <br>
 A confirmation message is displayed to the user to let them know that 
the return process was successful and the stock increases by 1. <br>
##MAIN CLASS<br> 
 The program starts by asking the user to select their role: Admin, User, or Exit.<br> 
 When the admin logs in, they are shown a menu with Three options. The switch case is 
used to handle the admin's choice. If the admin selects an option, the corresponding 
case will execute: <br>
Add Books: The admin can add new books to the store. <br>
Display Available Books: The admin can view all the books available in the store. <br>
Logout – Exit the admin menu. <br>
 If the user logs in, they are shown a menu with Four options. Similar to the admin menu, 
a switch case is used to handle the user’s choice: <br>
View Books: The user can view all available books in the store. <br>
Buy Books: The user can buy a book from the store. <br>
Return Books: The user can return a book and increase its stock. <br>
Logout – Exit the user menu. <br>
 If Exit is selected, the program ends with a thank-you message. <br>
 Proper messages are shown for invalid credentials, roles, or menu choices. <br>
#CONCLUSION <br>
The Online Book Store mini project effectively showcases the application of core Java 
concepts such as classes, objects, Polymorphism and collections. By providing separate 
functionalities for Admin and User, the project simulates a real-world book store environment. 
Admins can add and view books, while users can view, purchase, and return books. The use of 
a HashMap ensures efficient management of book records. Overall, this project serves as a 
practical introduction to Java-based application development and offers a future enhancements, 
such as user authentication, file handling, or GUI integration. 
