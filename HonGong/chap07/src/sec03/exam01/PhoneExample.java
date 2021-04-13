package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartphone = new SmartPhone("박아란");
		
		smartphone.turnOn(); // Phone의 메소드
		smartphone.internetSearch();
		smartphone.turnOff(); // Phone의 메소드
	}

}
