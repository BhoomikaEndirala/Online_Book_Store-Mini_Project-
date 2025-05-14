package com.Project;

import java.util.HashMap;

public class Store_Management {
	HashMap<String,Book> hm = new HashMap<>();
	public Store_Management(){
		addBook(new Book("Atomic Habits","James Clear",500.00,"Self Help",200));
		addBook(new Book("The Alchemist","Paulo Coelho",1100.00,"Fiction",74));
		addBook(new Book("1984","george Orwell",999.00,"Dystopia",0));
	}
	private void addBook(Book bk) {
		hm.put(bk.getName(),bk);
		
	}
	public void addBook(String title, String author, double price, String genre, int stock) {
		Book newBook = new Book(title,author,price,genre,stock);
		hm.put(title,newBook);
	}
	public void display() {
		if(hm.isEmpty())
			System.out.println("No books Avaialble in store");
		else {
			System.out.println("Available Books:");
			for(Book bk : hm.values()) {																																																																									
				System.out.println(bk);
			}
		}
	}
	public void returnBook(String Name) {
		Book bk = hm.get(Name);
		bk.increaseStock();
		System.out.println("Book returned Successfully!!!");	
	}
	public void buyBook(String Name, String Address) {
		Book bk = hm.get(Name);
		if(bk != null) {
			if(bk.getStock()>0){
				bk.reduceStock();
				System.out.println("Thank you for Buying, Your Book will be Delivered soon!!");
			}
			else {
				System.out.println("Sorry!! Book is out of Stock!!");
			}
		}
		else {
			System.out.println("Book is not Available");
		}
	}
}
