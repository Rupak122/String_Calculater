
public class StringCalulater {
	
	private final String delimeter =",|\n";
	public int Add(String input) throws Exception
	{
		
		String [] numbers= input.split(delimeter);
		if(input.isEmpty())
		{
			return 0;
		}
		if(input.length()==1)
		{
			return Integer.parseInt(input);
		}
		else
			
			return getSum(numbers);
			
	}
	
	public int  getSum(String [] numbers) throws Exception
	{
		negativeNumbersNotAllowed(numbers);
		 return calculateValues(numbers);
		
	}
	
	public int calculateValues(String [] numbers)
	{
		int sum=0;
		
		for (int i=0;i<numbers.length;i++)
		{
			if(Integer.parseInt(numbers[i])>1000)
					{
				      continue;
					}
			sum +=Integer.parseInt(numbers[i]);
		}
		return sum;
	}
	
	public void negativeNumbersNotAllowed(String [] numbers) throws Exception
	{
		for (String i:numbers)
		{
			if(Integer.parseInt(i)<0)
			{
				throw new Exception ("Negative input not allowed");
			}
		}
	}
	
		
}

