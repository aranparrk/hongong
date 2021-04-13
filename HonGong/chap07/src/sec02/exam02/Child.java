package sec02.exam02;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("자식클래스 재정의 된 메소드2 호출");
	}
	
	public void method3() {
		System.out.println("자식클래스 메소드3 호출");
	}
}
