//This program adds a number by 1 and returns it in the form of an array.
public class OneUp {

	public static int[] oneUp(int number)
	{
		number++;
		String strNumber = Integer.toString(number);
		int[] numberPlus = new int[strNumber.length()];
		for (int i = 0; i < strNumber.length(); i++)
		{
			numberPlus[i] = Character.getNumericValue(strNumber.charAt(i));
		}
		return numberPlus;
	}
}
