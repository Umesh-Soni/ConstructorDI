package beans;

public class Employee {
	
	private int age;
	private String name;
	private String email;
	private Address address;
	
	public Employee() {}
	
	/*public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}*/
	
	public Employee(int age,String name, String email, Address address) {
		this.age = age;
		this.name = name;
		this.email = email;
		this.address =  address;
	}
	
	public void printEmployee(){
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("email = "+email);
		System.out.println("address = "+address);
	}


	/*public Employee() {
		System.out.println("Employee constructor ... ");
	}*/
	
}
