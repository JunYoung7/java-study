public class chapter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ch 2.3
		
		int octNum = 012;
		int binNum = 0b1110;
		double a = 123123.12345255;
		char c = 'B';
		
		
		System.out.printf("%d , %o\n", octNum, octNum);
		
		// �������� string �����ڷ� �� ����, Integer.toBinaryString() ��ߵ�
		System.out.printf("%d , %s\n", binNum, Integer.toBinaryString(binNum));
		
		// c�� �޸� ���� �����ڷ� ����� �� ����ȯ ����� ��
		System.out.printf("%d, %c\n", (int)c, c );
		
		// ǥ���� ���� ������ ��ü�ڸ��� ����� ��ü�ڸ����� ũ�� �׳� ���� ���� ũ���� ���
		System.out.printf("%30.15f", a);

	}

}
