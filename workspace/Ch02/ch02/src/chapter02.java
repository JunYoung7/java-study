public class chapter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ch 2.3
		
		int octNum = 012;
		int binNum = 0b1110;
		double a = 123123.12345255;
		char c = 'B';
		
		
		System.out.printf("%d , %o\n", octNum, octNum);
		
		// 이진수는 string 지시자로 한 다음, Integer.toBinaryString() 써야됨
		System.out.printf("%d , %s\n", binNum, Integer.toBinaryString(binNum));
		
		// c와 달리 정수 지시자로 출력할 때 형변환 해줘야 함
		System.out.printf("%d, %c\n", (int)c, c );
		
		// 표현할 실제 변수의 전체자리가 명시한 전체자리보다 크면 그냥 실제 변수 크기대로 출력
		System.out.printf("%30.15f", a);

		short b = 1231;
		byte zz = 5;
		
		zz = (byte)b;
	}

}
