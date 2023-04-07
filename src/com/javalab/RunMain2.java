package com.javalab;

import java.util.Scanner;

/*
 * 콘솔 메뉴 switch문 사용
 */
public class RunMain2 {
	public static void main(String[] args) {
		//키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		int option;
		
		while (true) {
			System.out.println("번호를 입력하세요. 1.덧셈	2.뺄셈	3.나눗셈	4.곱셈");
			option = Integer.parseInt(in.next());	// Integer.parseInt : 정수로 변환 //문자열 -> int 변환
		
			switch (option) {
			case 1:
				
			case 2:
				
			case 3:
				
			case 4:
				

			default:
				break;
			}
		
		if (option == 1) {
			System.out.println("1. 덧셈");
		}else if (option == 2) {
			System.out.println("2. 뺄셈");
		}else if (option == 3) {
			System.out.println("3. 나눗셈");
		}else if (option == 4) {
			System.out.println("4. 곱셈");
		}else {	//1,2,3,4 이외의 숫자가 올 경우
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);		//0-정상적으로 종료
			break;
			}
		} //while end
		//자원 반납
		in.close();
	}	//main end
	private static void askForNumbers() {
		System.out.println("두개의 숫자를 입력하세요.");
		System.out.println();
	}
} // class end
