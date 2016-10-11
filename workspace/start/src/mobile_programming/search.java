package mobile_programming;

import java.util.Scanner;

public class search{
	public static void main(String[] args){
		int[] array = new int[]{1,3,4,5,7,9,10,11,12,14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 15중 임의의 10개의 숫자가 있습니다.");
		System.out.print("숫자를 입력하세요 : ");
		int val = sc.nextInt();
		int key = search_method(array,val);
		System.out.println("Index값 : "+key+"(Index가 -1이면 존재하지 않음)");
	}
	
	public static int search_method(int array[], int val){
		int key = -1;
		
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == val){
				key = i;
				break;
			}
		}
		
		return key;
	}
}
