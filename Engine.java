package com.jse.app;

import com.jse.app.Member;
import com.jse.app.Calculator;
import java.util.Random;
import java.util.Scanner;
import com.jse.app.Dice;


public class Engine { // r 로컬변수 중 외부에서 들어오는 것: 파라미터
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ㄴ 로컬변수 중 new로 만들어 지는 것은 instance
		// instance를 생성하였다고 하여 instantation 이라고 함
		Random random = new Random();
		Member member = new Member();
		Calculator calculator = new Calculator();
		Dice dice = new Dice();
		RPSgame rpsGame = new RPSgame();
		
		
		while (true) { // 무한 Loop - 서버
			System.out.println("0 : 종료, " + "1 : 회원가입, " + "5 : 주사위 맞추기 게임" + "4 : 가위바위보" + "6 : 1부터 100까지의 합");
			int flag = sc.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String id = sc.next();
				member.setId(id);
				break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = sc.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디: " + returnId);
				if (id2.equals(returnId)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("실패");
				}
				break;

			case 3:
				System.out.println("계산기");
				System.out.println("첫번째?");
				int num1 = sc.nextInt();
				calculator.setNum1(num1);
				System.out.println("두번째?");
				int num2 = sc.nextInt();
				calculator.setNum2(num2);
				int c = calculator.calculate();
				// c가 return을 했으니 int c로 해서 받아줘야함
				System.out.println("두수의 합? "+c);
				break;
			case 4:
				System.out.println("가위1, 바위2, 보3을 입력하세요.");
				int p1 = sc.nextInt();
				rpsGame.setpVal(p1);
				System.out.println("플레이어의 선택 : "+p1);
				
				int c1 = random.nextInt(3)+1;
				System.out.println("컴퓨터의 선택 : "+c1);
				rpsGame.setcVal(c1);
				String end = rpsGame.game();
				System.out.println(end);
				break;
			case 5:
				System.out.println("주사위 게임 시작");
				System.out.println("홀/짝을 입력하세요.");
				String expect = sc.next();
				dice.setExpect(expect);
				System.out.println("예상 결과는 "+expect+"입니다.");
				
				int diceNum = random.nextInt(6)+1;
				System.out.println("주사위의 결과값 : "+diceNum);
				dice.setDiceNum(diceNum);
				String result = dice.switchDice();
				System.out.println(result);
				break;
			case 6:
				Sum1To5.sum();
				break;
			}
		}
	}
}
