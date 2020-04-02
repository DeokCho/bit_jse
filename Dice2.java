package com.jse.app;

import java.util.Random;
import java.util.Scanner;
public class Dice2 {
	public static void main(String[] args) {
		switchDice();
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

}
