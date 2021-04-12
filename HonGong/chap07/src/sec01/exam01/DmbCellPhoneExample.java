package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("애플", "white", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCellPhone.channel );
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요! 저 박아란인데요");
		dmbCellPhone.sendVoice("아 눼뉑??");
		dmbCellPhone.hangUP();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannerDmb(25);
		dmbCellPhone.turnOffDmb();
		
	}

}
