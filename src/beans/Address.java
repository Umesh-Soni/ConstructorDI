package beans;

public class Address {

	private String city;
	private int pin;
	private String state;
	private String country;
	
	public Address(){
		System.out.println("Address constructor ... ");
	}
	
	public Address(String city, int pin, String state, String country) {
		super();
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	
	
}
