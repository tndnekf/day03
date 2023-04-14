package if_else;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		String b = null ;
		
		System.out.print("점수 입력 : ");
		a = input.nextInt();
		
		if (a >= 90 && a <= 100) {
			b = "A"; // b는 A
		}
		
		if (a >= 80 && a <= 89) {
			b = "B";
		}
		
		if (a >= 70 && a <= 79) {
			b = "C";
		}
		
		if (a >= 60 && a <= 69) {
			b = "D";
		}
		if (a >= 0 && a <= 59) {
			b = "F";
		}
		if (a < 0 || a > 100 )
			b = "잘못 입력 하셨습니다.";
		
		System.out.println(b);
	

		
		
		
	}

}
