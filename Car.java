
public class Car {
	private String name;
	private int year;
	
	//constructor
	Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	//default constructor
	Car() {
		this.name = "";
		this.year = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println(year + " " + name);
	}

	@Override
	public String toString() {
		return year + " " + name;
	}
}
