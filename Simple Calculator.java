//This program returns the sum or the difference of an equation taken as a string.
public class SimpleCalculator {

	public static int calculate(String problem) 
	{
		int sum = 0;
		boolean isPlus = true;
		for (int i = 0; i < problem.length() - 1; i++) 
		{
			char cur = problem.charAt(i);
			if (cur == '+')
			{
				isPlus = true;
			}
			else if (cur == '-')
			{
				isPlus = false;
			}
			else if (isPlus)
			{
				sum += Character.getNumericValue(problem.charAt(i));
			}
			else if (!isPlus)
			{
				sum -= Character.getNumericValue(problem.charAt(i));
			}
		}
		return sum;
	}
}
