package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevisionEample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchale = tv;
	}

}
