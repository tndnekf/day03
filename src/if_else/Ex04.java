package if_else;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("첫번째 수를 입력 : ");
		a = input.nextInt();
		
		System.out.print("두번째 수를 입력 : ");
		b = input.nextInt();
		
		if (a > b) {
			System.out.println("첫번째 수 :" + a + " 두번째 수 :" + b + "보다 큽니다.");
		}
		if (a < b) {
			System.out.println("첫번째 수 :" + a + " 두번째 수 :" + b + "보다 작습니다.");
		}
		
		
	}

}
