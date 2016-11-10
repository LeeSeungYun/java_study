package QuickCoding_3;

import java.util.Scanner;

public class MyException {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������Դϴ�. ���ڸ� �ΰ� �Է��ϼ���.");
		String a = scan.nextLine();
		String b = scan.nextLine();
		try{
			System.out.println(divide(a,b));
		}catch(ArithmeticException e){
			System.out.println("0���� ������ ����"+e.toString());
		}catch(IllegalArgumentException ex){
			System.out.println("���ڿ��� ������ �� ����"+ex.toString());
		}
		
	}
	
	public static int divide(String a, String b) throws MyExcep{
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		if(i>=100||j>=100){
			throw new MyExcep("���ڸ� �̻��� �ȵ�");
		}
		return i/j;
	}

}
