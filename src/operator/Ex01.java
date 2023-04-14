package operator;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println(3 | 5); // 11 & 101
		// 프로그래밍에서 0은 거짓이라고 한다. 0을 제외한 모든것은 참.
		
		System.out.println();
		System.out.println("=== 증감 연산자 ===");
		/*
		 증감연산자 : 결과적으로 자기자신을 1 증가 또는 감소
		 ++num, num++, --num, num--
		 num = num + 1
		 */
		int a,b,c;
		c = 10;
		a = ++c + 10; // 연산이 앞에 붙으면 자기자신 먼저 계산
		
		c = 10;
		b = c++ + 10;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		
		int n;
		n = 5;
		n ++;
		System.out.println(n);
		
		n = 5; // 연산된 값을 다시 5로 초기화
		++ n;
		System.out.println(n);
		
		
		System.out.println();
		System.out.println("=== 논리 연산자 ===");
		/*
		 논리 연산자 : true 또는 false만 표현 
		 ||(or연산) : 식들 중 하나라도 참이면 참
		 &&(and연산) : 모든 값이 참 일때만 참 (하나라도 거짓이면 거짓)
		 !(not연산) : !true => false.
		 */
		int number = 10;
		System.out.println(number > 5 && number % 2 == 1);
		System.out.println(true || true); // (||)하나라도 참이면 참
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		System.out.println(true && true); // (&&)하나라도 거짓이면 거짓
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		System.out.println("!true : " + !true); // 반대로 결과를 출력함.
		System.out.println("!true : " + !false);
		
		
		System.out.println();
		System.out.println("=== 관계 연산자 ===");
		/*
		관계연산자 : true 또는 false의 결과
		
		a=10, b=20
		a > b : a가 b보다 크냐?  =>  false
		
		>, <, >=, <=, ==, !=
		*/
		double do01 = 1.1, do02 = 1.2;
		
		System.out.println(do01 >= do02); // 01이 02보다 크거다 같냐
		System.out.println(do01 <= do02); 
		System.out.println(do01 == do02);
		System.out.println(do01 != do02);
		
		
		/*
		 복학대입 연산자
		 num = 10;
		 num = num + 10; => num += 10; 
		 num = num / 10; => num /= 10; 
		 num = num % 10; => num %= 10; 
		*/
		
		System.out.println();
		System.out.println("=== 복합대입연산자 ===");
		
		int su1, su2;
		su1 = su2 = 5;
		su1 += 1;  // su1(6) = su1(5) + 1;
		System.out.println(su1);
		
		su1 -= 1;  // su1(5) = su1(6) - 1;
		System.out.println(su1);
		
		su1 *= su2;  // su1(25) = su1(5) * (5)su2;
		System.out.println(su1);
		
		su1 /= su2;  // su1(5) = su1(25) / (5)su2;
		System.out.println(su1);
		
		su1 %= su2;  // su1(0) = su1(5) % (5)su2;
		System.out.println(su1);
		// 중첩되서 계산된다.
		
		
		System.out.println();
		System.out.println("=== 연산자 ===");
		/*
		 
		 +, -, *, /, %
		 
		 / : 정수 / 정수 = 정수(몫). 
		   => 10 / 3 = 3,  10 / 3.0 = 3.333
		 
		 %(mod) : 나머지를 구해준다. 
		   => 10 % 3 = 1
		  
		 */
		
		int num1 = 9, num2 = 2;
		System.out.println(num1 / num2);
		System.out.println(num1 / (float)num2);
		System.out.println(num1 % num2);
		
	}

}
