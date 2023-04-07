package com.javalab;

import java.util.Scanner;

/*
 * 콘솔 메뉴
 */
public class RunMain4 {
	public static void main(String[] args) {
		//키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		int option;
		int number1, number2; 	//키보드에서 받아들일 두 숫자 저장용 변수
		while (true) {
			System.out.println("번호를 입력하세요. 1.덧셈	2.뺄셈	3.나눗셈	4.곱셈");
			option = Integer.parseInt(in.next());	// Integer.parseInt : 정수로 변환 //문자열 -> int 변환
			switch (option) {
			case 1:
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 + number2;
				System.out.println("덧셈 결과 : " + sum);
				 break;

			case 2:
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum1 = number1 - number2;
				System.out.println("뺄셈 결과 : " + sum1);
				 break;

			case 3:
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum2 = number1 / number2;
				System.out.println("나눗셈 결과 : " + sum2);
				 break;

			case 4:
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum3 = number1 * number2;
				System.out.println("곱셈 결과 : " + sum3);
				break;

			default:
				System.exit(0);
				break;
			}
		}
		
	}	//main end
	private static void askForNumbers() {
		System.out.println("두개의 숫자를 입력하세요.");
		System.out.println();
	}
} // class end
