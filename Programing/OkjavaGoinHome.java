import org.opentutorials.iot.Elevator; //class �ҷ���
//class �Ⱥҷ����� Elevator Ŭ���� �������� org.opentutorials.iot.Elevator �̷��� �ؾߵ�
//org���� �ȿ� opentutorials ���� �ȿ� iot ���� �ȿ� Elevator��� �ڹ��ڵ� ��� ��
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkjavaGoinHome {

	public static void main(String[] args) {

		// ���� �ڵ���� ���� ������� ���� ���� ���� �ڵ�� �����ϰ�
		// �̰͵��� �ϳ��� ���� ���α׷��� ������
		
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
