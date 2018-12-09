//This program takes a phone number in letter form and returns the actual numerical phone number.
public class PhoneNumberConversion {

	public static String convert(String phoneNumber)
	{
		String convertedNumber = "";
		phoneNumber = phoneNumber.toLowerCase();
		String[] alphabet = {null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		for (int i = 0; i < phoneNumber.length(); i++)
		{
			boolean isChar = true;
			for(int j = 2; j < alphabet.length; j++)
			{
				for (int k = 0; k < alphabet[j].length(); k++)
				{
					if (alphabet[j].charAt(k) == phoneNumber.charAt(i)) {
						convertedNumber += Integer.toString(j);
						isChar = false;
					}
				}
			}
			if (isChar)
			{
				 convertedNumber += phoneNumber.charAt(i);
			}
		}
		return convertedNumber;
	}
}
