package QuickCoding_1;

public class MyMinimum extends SuAbstract{
	
	public int min(){
		int result = 2^31-1;
		for(int i = 0 ; i < arr.length ; i++)
			if(result>arr[i])
				result = arr[i];
		
		return result;
	}
}
