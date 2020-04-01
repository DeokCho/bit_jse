package com.jse.app;

import java.util.Random;
import java.util.Scanner;
public class Dice2 {
	public static void main(String[] args) {
		switchDice();
		dice();

	}
	
	
	static void switchDice() {
		System.out.println("주사위 홀/짝 게임시작!");
		System.out.println("홀/짝을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String expect = sc.next();
		System.out.println("예상 결과는 "+expect+"입니다.");
		
		Random rd = new Random();
		int dice = rd.nextInt(6)+1;
		System.out.println("주사위의 결과값 : "+dice);
		
		String result = "";
		switch(dice) {
		case 1:case 3:case 5: result = "홀"; break;
		case 2:case 4:case 6: result = "짝"; break;
		}
		
		System.out.println("주사위의 홀/짝 : "+result);
		
		String end = "";
		if(expect.equals(result)) {
			end = "정답";
		}else {
			end = "오답";
		}
		System.out.println(end);
		
		
	}
	
	static void dice() {
		System.out.println("----------\n두번째 주사위 홀/짝 맞추기 게임");
		System.out.println("기대하는 홀/짝을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("사용자 예상값 : "+expect);
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("주사위 값 : "+dice);
		String result = "";
		if(dice%2==1) {
		result = "홀";
		}else{
		result = "짝";
		}	
		System.out.println("홀/짝 결과 : "+result);
		if(expect.equals(result)) { // object type 의 opepration은 method로 처리한다.
		System.out.println("매칭 결과 : 맞음\n----------");
		}else {
		System.out.println("매칭 결과 : 틀림\n----------");
		}
	}

}
