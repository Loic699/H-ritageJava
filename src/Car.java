
public class Car extends Vehicule {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return  "Je suis" + getBrand() + "et je fais vroum vroum !";
	}

}
