package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methoedA(); // InterfaceA 변수는 methodA()만 호출
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methoedB(); // InterfaceB 변수는 methodB()만 호출
		System.out.println();
		
		// 모두 호출 가능
		InterfaceC ic = impl;
		ic.methoedA();
		ic.methoedB();
		ic.methoedC();
	}

}
