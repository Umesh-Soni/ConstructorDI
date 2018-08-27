package beans;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {	
	private int age;
	private String name;
	private String email;
	private Address address;
	private HashSet<Book> book;
	
	public Employee(int age,String name, String email, Address address,HashSet<Book> book) {
		this.age = age;
		this.name = name;
		this.email = email;
		this.address =  address;
		this.book = book;
	}
	
	public void printEmployee(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Email = "+email);
		System.out.println("Address = "+address);
		System.out.println("Book = ");
		Iterator<Book> tempBook = book.iterator();
			while (tempBook.hasNext()) {
				System.out.println(tempBook.next());
				
			}
		}


	public Employee() {
		System.out.println("Employee constructor ... ");
	}
	
}
