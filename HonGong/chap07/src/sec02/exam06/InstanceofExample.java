package sec02.exam06;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // Child 타입으로 변환이 가능한지 확인
			Child child = (Child) parent;
			System.out.println("메소드1 - Child로 변환 성공");
		}else {
			System.out.println("메소드1 - Child로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // CLassCastException 발생
		System.out.println("메소드2 - Child로 변환 성공");
	}
	
	public static void main(String[] agrs) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
	}
}
