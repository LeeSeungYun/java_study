package QuickCoding_3;

import java.util.Scanner;

public class MyException {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("나눗셈입니다. 숫자를 두개 입력하세요.");
		String a = scan.nextLine();
		String b = scan.nextLine();
		try{
			System.out.println(divide(a,b));
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없음"+e.toString());
		}catch(IllegalArgumentException ex){
			System.out.println("문자열은 실행할 수 없음"+ex.toString());
		}
		
	}
	
	public static int divide(String a, String b) throws MyExcep{
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		if(i>=100||j>=100){
			throw new MyExcep("세자리 이상은 안됨");
		}
		return i/j;
	}

}
