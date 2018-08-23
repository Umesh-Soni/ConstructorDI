package beans;

public class Book {
	
	private String code;
	private String name;
	private String author;
	private Integer year;
	
	public Book() {
		System.out.println("Book class constructor");
	}

	public Book(String code, String name, String author, Integer year) {
		this.code = code;
		this.name = name;
		this.author = author;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", author=" + author
				+ ", year=" + year + "]";
	}
	
	
}
