import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		//resul1.txt �ؽ�Ʈ ���Ͽ��ٰ� java�� �̿��ؼ� hello1�̶�� �ؽ�Ʈ�� �ۼ��Ұ��̴�.
		
		//constructer : ������   ex)PrintWriter (String filename) �̰� �����ڴ�
		//�ڹ� �޴��� ���� Math�� PrintWriter ��ɾ� ���캸�� �������� ������ ���̰� �ִ�.
		// Math ��ɾ�� �����ڰ� ���� -> ��ȸ�� ��ɾ� ������ ����ؾ��Ѵ�.
		// PrintWriter ��ɾ�� �����ڰ� �ִ� -> ��ȸ�� ��ɾ�
		// PrintWriter�� Mathó�� ���̸� ����ϰԲ� ������ �ְ� �����ڸ� ����Ͽ� �ѹ��� ����ϰԲ� ���� �ִ�.
		
		
		PrintWriter p1 = new PrintWriter("result1.txt");
						   //�� �κ� �� �������� PrintWriter("result1.txt") ���� constructer�ּ� ����
		//����Ʈ���� �տ� new�� ���̸� ����Ʈ���Ͱ� �����Ǽ� �ν��Ͻ��� �ǰ�
		//�� �ν��Ͻ��� � ���� ���°��� ������ PrintWriter p1 �̴�
		p1.write("Hello 1");
		p1.write("Hello 234");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
// ��� ������ ���� �ְ� �ؾߵ�

	}

}
