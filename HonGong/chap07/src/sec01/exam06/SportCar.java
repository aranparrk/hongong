package sec01.exam06;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메소드때문에 재정의할 수 없다
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
