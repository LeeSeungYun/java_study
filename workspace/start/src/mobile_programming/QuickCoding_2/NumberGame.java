package QuickCoding_2;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int left = 0;
		int right = 500;
		int middle = 250;
		System.out.println("0부터 500사이의 숫자를 하나 생각하세요.");
		
		while(true){
			System.out.println(middle+" 입니까? >>> 맞았으면 1, 생각한 수보다 작으면 2, 생각한 수보다 크면 3");
			int a = scan.nextInt();
			if(a == 1){
				System.out.println("끝!");
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
