package mobile_programming;

import java.util.Scanner;

public class sorting
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[10];
		System.out.println("임의의 정수를 10개 입력하세요.");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print(i+1+"번째 정수 : ");
			array[i] = scan.nextInt();
		}
		int a;
		sort(array);
		for(int val:array){
			System.out.println(val);
		}
	}
	
	public static void sort(int array[])
	{
		for(int j = 0 ; j<array.length; j++)
		{
			for(int i = 0 ; i<array.length-1 ; i++)
			{
				if(array[i] > array[i+1]){
					swap(array,i);
				}
			}
		}
	}
	public static void swap(int array[],int i)
	{
		int temp = array[i];
		array[i] = array[i+1];
		array[i+1] = temp;
	}
}