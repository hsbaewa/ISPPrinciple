package test.test;

public class Mac2015 implements MacPro{

	@Override
	public boolean hasDisplay() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hasKeyboard() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	/**
	 * 맥북 2015 버전은 터치바옵션 자체가 없으므로 hasTouchBar함수를 가질 필요가없다.
	 * 인터페이스 자체를 hasTouchBar함수를 가진 인터페이스를 별도로 구현하여 인터페이스를 격리하였다.
	 * 인터페이스 격리 원칙
	 */
//	public boolean hasTouchBar() {
//		// TODO Auto-generated method stub
//		return true;
//	}

}
