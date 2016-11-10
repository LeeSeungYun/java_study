package QuickCoding_1;

public class MyAverage extends SuAbstract{
	public double avg(){
		double result = 0;
		for(int i = 0 ; i<arr.length ; i++)
			result += arr[i];
		
		return result/arr.length;
	}
}
