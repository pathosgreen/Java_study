package P350;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//RemoteControl rc = new RemoteControl();
		//Audio rc = new Audio();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		
	}
}
