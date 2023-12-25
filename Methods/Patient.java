
public class Patient {
	String name;
	float age;
	String address;
	
	void takeMadicine() {
		System.out.println("Take Prescribed medicines");
	}
	
	void Prescription() {
		System.out.println("Get Prescribed medicines");
	}
	
	public String toString() {
		return "Name is "+this.name + " and age is " + this.age;
	}

}
