import org.opentutorials.iot.Elevator; //class 불러옴
//class 안불러오면 Elevator 클래스 쓸때마다 org.opentutorials.iot.Elevator 이렇게 해야됨
//org폴더 안에 opentutorials 폴더 안에 iot 폴더 안에 Elevator라는 자바코드 라는 뜻
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkjavaGoinHome {

	public static void main(String[] args) {

		// 샘플 코드들을 여러 사람들이 각자 만들 여러 코드라 생각하고
		// 이것들을 하나로 합쳐 프로그램을 만들어본다
		
		String ID = "JAVA APT 507";
		//String ID = JOptionPane.showInputDialog("Enter a ID");
		//String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		
		
		
		//Elevator call 
		Elevator myElevator = new Elevator(ID);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(ID);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(ID + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(ID + " / floor Lamp");
		floorLamp.on();
	
		
	}

}
