package Ex1_value_type;

public class Ex2_valueType {
	public static void main(String[] args) {
	
		//정수형 : 소수점을 가지고 있지 않은 정수타입의 값만을 저장하기 위한 자료형
		byte b = 127;
		short s = 32767;
		int n = 2100000000;  //디폴트 값
		long lo = 2200000000L;  // 정수의 디폴트 값이 인트라 롱은 L 을 넣어줘야함
		
		System.out.println("long : " +lo );
		
		
		//실수형 : 소수점을 포함하고 있는 값을 저장하기 위한 자료형
		float f = 3.14f;  //롱이랑 마찬가지
		double d = 3.14;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		f = 100f;
		d = 0;
		
		System.out.println("f : "+ f);
		System.out.println("d :"+ d);
		
		
		
	}
}

