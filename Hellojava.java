package com.jse.app;
import java.util.Scanner;

public class Hellojava {  // 클래스 선언 declare
			//	ㄴ 파일
	public static void main(String[] args) {  // 메서드 선언 declare  - 클래스 선언과 메서드는 초기화를 하지 않음.
	// ㄴ 제일 먼저 보여줌   		 ㄴ 첫 대문자는 클래스 이름, 소문자는 코드					ㄴ implicitly 선언 (묵시적 선언)
	//	 한개만 지정가능	          ㄴ 메소드 // 폴더 = 클래스의 집합. 
	//								       클래스 아래의 폴더는 있을 수 없음.
	//								       클래스는 내장이 되어있거나, 외부에서 호출하던가
	//										ㄴsystem, string  ㄴ scanner
	//				 
	//	보라색 : 예약어, 기능어 
	//	검은색 : 명사
	//	자바의 언어는 기능어와 명사 2가지로 구성되어 있음.
		
		Scanner scanner = new Scanner(System.in);
		//									ㄴ system의 패키지로 생각
		System.out.println("이름이 뭐예요?");
		//						ㄴ 파란색 글씨 : 화면에 출력되는 내용
		String name = scanner.next();
		//		ㄴ 갈색 : 변수( name, scanner, where, ...)
		System.out.println("안녕하세요. "+name+"씨. \n어디사세요?");
		String where = scanner.next(); // next 다음에 String이 안나오는 것은 디폴트 값이기 때문
		System.out.println("아 "+where+" 좋은 곳이죠.");
		// 			ㄴ 메소드 : 뒤에 ()가 있음.
		System.out.println("몇살이세요?");
		int age = scanner.nextInt();
		System.out.println(age+"살이시군요. 키는 몇이고, 몸무게는 몇인가요?");
		double key = scanner.nextDouble();
		double weight = scanner.nextDouble();
		System.out.println("키는 "+key+"cm이고, 몸무게는"+weight+"kg이시군요.");
		
		int a = 0; // 변수 선언 declare - 변수는 선언 후 반드시 초기화를 해줘야함
		//				ㄴ explicitly 선언(명시적 선언)   
		System.out.println(a);
		
	}
}

// 폴더는 클래스를 여러개 포함할 수 있다.
// 클래스는 메소드를 여러개 포함할 수 있다.