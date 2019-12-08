

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; //class 불러옴
//class 안불러오면 Elevator 클래스 쓸때마다 org.opentutorials.iot.Elevator 이렇게 해야됨
//org폴더 안에 opentutorials 폴더 안에 iot 폴더 안에 Elevator라는 자바코드 라는 뜻
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoinHomeInput {

	public static void main(String[] args) {

		// 샘플 코드들을 여러 사람들이 각자 만들 여러 코드라 생각하고
		// 이것들을 하나로 합쳐 프로그램을 만들어본다

		String ID = JOptionPane.showInputDialog("enter a ID");		
		String bright =JOptionPane.showInputDialog("enter a Bright level");		
		
		
		/*
		String ID = args[0];
		String bright = args[1];
		*/
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
		
		DimmingLights moodLamp = new DimmingLights(ID +"moodLamp");
		//moodLamp.setBright(bright); //이 괄호 안에는 실수(double)가 와야하는데 지금 bright는 String임 그래서 에러뜸
		moodLamp.setBright(Double.parseDouble(bright));
		
		moodLamp.isOn();
		
	}

}
