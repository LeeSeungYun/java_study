package mobile_programming;

import java.util.Scanner;

public class binary_search{
	public static void main(String[] args){
		int[] array = new int[]{1,3,4,5,7,9,10,11,12,14};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 15중 임의의 10개의 숫자가 있습니다.");
		System.out.print("숫자를 입력하세요 : ");
		int val = sc.nextInt();
		int key = binarysearch(array,val);
		
		System.out.println("Index값 : "+key+"(Index가 -1이면 존재하지 않음)");
	}
	
	public static int binarysearch(int array[], int val){
		int key = -1;
		int fir = 0,  fin = array.length-1,  mid = (fir+fin)/2;
		for(;;)
		{
			if(array[mid]==val){
				return mid;
			}
			else if(array[mid]<val){
				fir=mid;
				mid=(fir+fin)%2==0?(fir+fin)/2:(fir+fin)/2+1;
				
			}
			else if(array[mid]>val){
				fin=mid;
				mid=(fir+fin)/2;//==0?(fir+fin)/2:(fir+fin)/2+1;
			}
			if((fin-fir==1&&(array[fir]<val&&val<array[fin]))||(val<array[0]||val>array[array.length-1])){
				break;
			}
		}
		
		return key;
	}
}