package com.jse.swing;


public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getKorean() {
		return korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getEnglish() {
		return english;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * * 이름과 국,영,수 세과목점수를 입력받아서() 
	 * [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
	 * 단) 평균은 소수점이하는 절삭합니다 
	 * 평균점수가 90점 이상 A * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
	 */
	
	
	
	
	public int gradesum() {
		return korean + english + math;
	}
	
	public int gradeaverage() {
		return  gradesum()/3;
	}
	
	
	public String result2() {
		String gradeResult2 = "";
		int average = gradeaverage();
		int gradee = average/10;
		switch(gradee) {
		case 5: System.out.println();
		
		}
		
		return gradeResult2;
	}
	
	
	public String result() {
	String gradeResult ="";
	int average = gradeaverage();
	if(average<50) {
		gradeResult = "F";
	}else if(average<60) {
		gradeResult = "E";
	}else if(average<70) {
		gradeResult = "D";
	}else if(average<80) {
		gradeResult = "C";
	}else if(average<90) {
		gradeResult = "B";
	}else {
		gradeResult = "A";
	}
	return gradeResult;	
	}
}

