

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; //class �ҷ���
//class �Ⱥҷ����� Elevator Ŭ���� �������� org.opentutorials.iot.Elevator �̷��� �ؾߵ�
//org���� �ȿ� opentutorials ���� �ȿ� iot ���� �ȿ� Elevator��� �ڹ��ڵ� ��� ��
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoinHomeInput {

	public static void main(String[] args) {

		// ���� �ڵ���� ���� ������� ���� ���� ���� �ڵ�� �����ϰ�
		// �̰͵��� �ϳ��� ���� ���α׷��� ������

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
		//moodLamp.setBright(bright); //�� ��ȣ �ȿ��� �Ǽ�(double)�� �;��ϴµ� ���� bright�� String�� �׷��� ������
		moodLamp.setBright(Double.parseDouble(bright));
		
		moodLamp.isOn();
		
	}

}
