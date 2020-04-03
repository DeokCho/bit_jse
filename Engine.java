package com.jse.swing;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade grade = null;

		while (true) {
			System.out.println("0. 종료, 1. 학점계산기");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				grade = new Grade();
				System.out.println("성적표");
				System.out.println("이름을 입력하세요.");
				grade.setName(sc.next());
				System.out.println("과목 점수를 입력하세요");
				System.out.println("국어");
				grade.setKorean(sc.nextInt());
				System.out.println("영어");
				grade.setEnglish(sc.nextInt());
				System.out.println("수학");
				grade.setMath(sc.nextInt());
				
				System.out.println("결과 : ");
				System.out.println(String.format("[%s :, 총점 %d점, 평균 %d점,학점 : %s]", 
						grade.getName(), grade.gradesum(), grade.gradeaverage(),grade.result()));
				
				
				break;
			}
		}
	}
}
