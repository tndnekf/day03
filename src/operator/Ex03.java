package operator;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
	
		System.out.print("수를 입력하세요 : ");
		a = input.nextInt();
		String b = (a%3 == 0)?"3의배수":"3의배수가 아님";
		System.out.println(a + " = " + b);
		
		b = (a%3 == 0)?"홀수":"짝수";
		
		System.out.println(a + " = " + b);
		
		System.out.println();
		
		
	}

}
