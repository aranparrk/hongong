package sec02.exam03;

public class HankookTire extends Tire{
	// 필드
	
	// 생성자
	public HankookTire(String location, int maxRotaion) {
		super(location, maxRotaion);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) { // 정상회전 (누적 < 최대)일 경우 실행
			System.out.println(location + "HanKookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else { // 펑크 (누적 = 최대)일 경우 실행
			System.out.println("*** " + location + "HanKookTire 펑크 ***");
			return false;
		}
	}
}
