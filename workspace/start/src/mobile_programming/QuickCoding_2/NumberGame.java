package QuickCoding_2;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int left = 0;
		int right = 500;
		int middle = 250;
		System.out.println("0���� 500������ ���ڸ� �ϳ� �����ϼ���.");
		
		while(true){
			System.out.println(middle+" �Դϱ�? >>> �¾����� 1, ������ ������ ������ 2, ������ ������ ũ�� 3");
			int a = scan.nextInt();
			if(a == 1){
				System.out.println("��!");
				return ;
			}
			else if(a == 2){
				left = middle+1;
				middle = (left+right)/2;
			}
			else if(a == 3){
				right = middle-1;
				middle = (left+right)/2;
			}
		}
	}

}
