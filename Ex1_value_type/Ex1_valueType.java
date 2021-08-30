package Ex1_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {
		
		//자료형(기본자료형)
		//논리형 : boolean - 1bit
		//문자형 : char - 2byte
		//정수형 : byte - 1byte ...... -128 ~ 127
		//		short- 2byte ...... -32768 ~ 32767
		//		int - 4byte ....... -21억 ~ 21억
		// 		long - 8byte....... -900경 ~ 900경
		//실수형 :float - 4.n byte
		//		double - 8.n byte
		
		//변수 :  자료형과 함께 사용하며, 일종의 별칭 개념으로써 특정 값을 저장하기위한 용도
		//변수의 규칙
		//1.변수는 숫자로시작하는이름으로 작성이 불가
		//2._를 제뢰하고는 특수문자를 포함하지못함
		//3.한글, 일본어, 아랍어 등으로 변수명을 짖지 않는다
		//4.변수는 반드시 첫글자를 소문자로 만든다
		
		//변수선언규칙
		//자료형 변수명;(선언)
		//변수명 = 값;//(대입)
		//자료형 변수명 = 값;(초기화)
		
		//--------------------------------------------
		
		//논리형 : true, false즉, 사실과 사실이 아니다의 두 가지 값중 한가지만 저장이 가능
		boolean b;
		b = true;
		b = false;
		
		boolean b2 = true;
		
		
		System.out.println("b : " + b);
		System.out.println("b2 : " + b2);
		
		
		System.out.println("------------------------------------");
		
		
		//문자형 : 홀따움표 안에 딱 한글자만 저장가능한 자료형
		char c = 'A';
		System.out.println("c : " + c );
		
		char c2 = 66;
		System.out.println("c2 : " + c2);
		
		
		
	}
}
