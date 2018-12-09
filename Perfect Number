//This program returns whether or not an integer is a perfect number.
public class PerfectNumber {

	public static int isPerfectNumber(int number)
	{
		int sum = 0;
		for (int i = number / 2; i > 0; i--)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		if (sum == number)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
