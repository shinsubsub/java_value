package Ex1_value_type;

public class Ex2_valueType {
	public static void main(String[] args) {
	
		//������ : �Ҽ����� ������ ���� ���� ����Ÿ���� ������ �����ϱ� ���� �ڷ���
		byte b = 127;
		short s = 32767;
		int n = 2100000000;  //����Ʈ ��
		long lo = 2200000000L;  // ������ ����Ʈ ���� ��Ʈ�� ���� L �� �־������
		
		System.out.println("long : " +lo );
		
		
		//�Ǽ��� : �Ҽ����� �����ϰ� �ִ� ���� �����ϱ� ���� �ڷ���
		float f = 3.14f;  //���̶� ��������
		double d = 3.14;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		f = 100f;
		d = 0;
		
		System.out.println("f : "+ f);
		System.out.println("d :"+ d);
		
		
		
	}
}

