import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		//resul1.txt 텍스트 파일에다가 java를 이용해서 hello1이라는 텍스트를 작성할것이다.
		
		//constructer : 생성자   ex)PrintWriter (String filename) 이게 생성자다
		//자바 메뉴얼에 가서 Math랑 PrintWriter 명령어 살펴보면 생성자의 유무에 차이가 있다.
		// Math 명령어는 생성자가 없다 -> 일회성 명령어 일일이 명령해야한다.
		// PrintWriter 명령어는 생성자가 있다 -> 다회성 명령어
		// PrintWriter은 Math처럼 일이리 명령하게끔 쓸수도 있고 생성자를 사용하여 한번에 명령하게끔 쓸수 있다.
		
		
		PrintWriter p1 = new PrintWriter("result1.txt");
						   //이 부분 이 생성자임 PrintWriter("result1.txt") 위에 constructer주석 봐봐
		//컨스트럭터 앞에 new를 붙이면 컨스트럭터가 복제되서 인스턴스가 되고
		//그 인스턴스에 어떤 값이 오는가를 적은게 PrintWriter p1 이다
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
// 얘는 일일이 열고 넣고 해야됨

	}

}
