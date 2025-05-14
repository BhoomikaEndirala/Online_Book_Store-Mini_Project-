package com.Project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Store_Management sm = new Store_Management();
		boolean isworking = true;
		while(isworking) {
			System.out.println("Welcome to the Online Book Store");
			System.out.println("Please select your role (Admin/User) to login or Exit to quit");
			String role = sc.next();
			if(role.equalsIgnoreCase("Admin")) {
				System.out.println("Enter Username:");
				String username = sc.next();
				System.out.println("Enter Password:");
				String password = sc.next();
				if(username.equals("admin") && password.equals("admin@123")) {
					System.out.println("Logged in Successfully!!");
					int choice;
					do {
						System.out.println("\nChoose an option:");
						System.out.println("1. Display Books");
                        System.out.println("2. Add Book");
                        System.out.println("3. Logout");
                        choice = sc.nextInt();
                        sc.nextLine();
                        switch(choice) {
                        	case 1: 
                        		sm.display();
                        		break;
                        	case 2:
                        		System.out.println("Enter the title: ");
                                String title = sc.nextLine();
                                System.out.println("Enter the Author:");
                                String author = sc.nextLine();
                                System.out.println("Enter the price:");
                                double price = sc.nextDouble();
                                sc.nextLine(); // consume newline
                                System.out.println("Enter the genre:");
                                String genre = sc.nextLine();
                                System.out.println("Enter the stock:");
                                int stock = sc.nextInt();
                                sm.addBook(title, author, price, genre, stock);
                                System.out.println("Book added successfully.");
                                break;
                        	case 3:
                        		System.out.println("Admin logged out.");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        	}
						
						}while(choice != 3);
					}
					else 
						System.out.println("Invalid admin credentials");
				}
				else if(role.equalsIgnoreCase("User")) {
					int choice;
					do {
						System.out.println("\nChoose an option:");
						System.out.println("1. Display Books");
						System.out.println("2. Buy Book");
						System.out.println("3. Return Book");
						System.out.println("4. Logout");
						choice = sc.nextInt();
						sc.nextLine();
						switch(choice) {
							case 1:
								sm.display();
								break;
							case 2:
								System.out.print("Enter the book name: ");
								String name = sc.nextLine();
								System.out.print("Enter Your Address: ");
								String address = sc.nextLine();
                            	sm.buyBook(name, address);
                            	break;
							case 3:
								System.out.print("Enter the book name: ");
								String rname = sc.nextLine();
								sm.returnBook(rname);
								break;
							case 4:
								System.out.println("User logged out.");
								break;
							default:
								System.out.println("Invalid choice!");		
							}
						}while(choice != 4);
					}
					else if(role.equalsIgnoreCase("Exit")) {
						System.out.println("Thank You !!!!!");
						isworking = false;
					}
					else
						System.out.println("Invalid role! Please enter Admin, User, Or Exit.");			
			}
	}
}
