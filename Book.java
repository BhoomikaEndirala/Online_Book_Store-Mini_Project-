package com.Project;

public class Book {

	String name;
	String author;
	double price;
	String genre;
	int stock;
	public Book(String name, String author, double price, String genre, int stock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.genre = genre;
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void reduceStock() {
		if(stock > 0)
			stock--;
	}
	public void increaseStock() {
		stock++;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", genre=" + genre + ", stock="
				+ stock + "]";
	}
	
}
