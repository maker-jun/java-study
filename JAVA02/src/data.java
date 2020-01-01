
public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char var1='홍';
		String var2="홍드로이드홍홍홍";
		byte var3 = -128; //-128 ~ +127 까지 숫자 가능
		short var4 = -32768; //-32768~ +32767 까지 가능
		int var5 = 99999999; //-21억~+21억
		long var6 = 99999; //여러숫자 입력가능
		
		float var7=0.5f; //소수점선언후 뒤에 f를 까먹지 말고 붙이자
		double var8 =0.000005;
		
		boolean isStart = false; //ture or false 입력하여 조건식에서 사용
		
		System.out.println(var1 + var2 + var3 + var4 + var5);
		System.out.println(var6 + var7 + var8);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(isStart);
	}

}
