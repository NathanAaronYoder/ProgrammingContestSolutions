//This program finds the maximum sum of an array of integers.
public class MaximumSum {

	public static int maxSum(int[] integers)
	{
		int sum = 0;
		for (int i = 0; i < integers.length; i++)
		{
			if (integers[i] > 0)
			{
				sum += integers[i];
			}
		}
		return sum;
	}
}
