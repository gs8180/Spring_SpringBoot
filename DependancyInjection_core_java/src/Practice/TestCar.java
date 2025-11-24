package Practice;

public class TestCar 
{
	public static void main(String[] args) {
		DiseleEngine de=new DiseleEngine();
		PetrolEngine pe=new PetrolEngine();
		
		Car c=new Car(de);
		
		//c.e=de; //if field is private not work Field Injection
		//c.set(pe);// Setter Injection
		c.drive();
		
		
	}

}
