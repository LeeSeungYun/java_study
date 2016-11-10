package QuickCoding_1;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args){
		MyMinimum min = new MyMinimum();
		MyAverage avg = new MyAverage();
		
		Scanner scan = new Scanner(System.in);
		for(int i = 1 ; i<=5 ; i++){
			System.out.println("숫자를 입력 하세요." +i+"/5");
			String a = scan.nextLine();
			min.arr[i-1] = Integer.parseInt(a);
		}
		
		System.out.println("입력한 숫자중 최솟값은 -> "+min.min());
		System.out.println("입력한 숫자의 평균은 -> "+avg.avg());
		
	}

}
