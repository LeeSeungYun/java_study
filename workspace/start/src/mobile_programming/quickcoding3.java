package mobile_programming;

import java.util.Scanner;

public class quickcoding3 {
	
	public static void main(String[] args){
		
		System.out.println("���ڸ� �������� �ΰ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		divide(a,b);
	}
	
	public static void divide(String a, String b){
		try{
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
		
			int result = num1/num2;
			
			if(num1>=100||num2>=100){throw new myexception("���ڸ� �̻���");}
			
			System.out.println("result = "+result);
			}
			
			catch(ArithmeticException e){
				System.out.println(e.toString());
			}
			
			catch(Exception n){
				System.out.println(n.toString());
			}
	}
}

