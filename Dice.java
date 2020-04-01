package com.jse.app;

import java.util.Scanner;
import java.util.Random;
public class Dice {
	public static void main(String[] args) {
		System.out.println("주사위 맞추기 게임");
		System.out.println("기대하는 값 홀 or 짝을 입력해 주세요.");
		
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("예상값 : " + expect);
		
		Random random = new Random(); // 내부에서 값이 나오므로 입력 X
		int dice = random.nextInt(6)+1;
		//						ㄴ 내부에 어떤수를 써도 0은 나올 수 밖에 없으므로, 
		//							외부에 +1을 해야 0 이상이 도출
		System.out.println("결과값 : " + dice);
		
		String result = ""; // 초기화한 것. 디폴트 값
		if(dice == 1) {
			result = "홀";
		}else if(dice==2) {
			result = "짝";
		}else if(dice==3) {
			result = "홀";
		}else if(dice==4) {
			result = "짝";
		}else if(dice==5) {
			result = "홀";
		}else {result = "짝";
		}
		System.out.println("홀짝결과 : "+result);

//		String result = scanner.next();
//		int result = random.nextInt(6);
	}
}

