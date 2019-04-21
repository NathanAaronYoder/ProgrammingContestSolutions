/*Given an array of words, this program determines whether there exists a mutation in the order of the words, such that for every word 
in the list, the next word can be made by changing only 1 letter. Return 1 if such an order exists, otherwise return 0.*/
public class WordMutation
{
	//This function returns whether or not two words have one different letter.
	public static boolean oneDifference(String first, String second)
	{
		if (first.length() == second.length())
		{
			int differences = 0;
			for (int k = 0; k < first.length(); k++)
			{
				if (first.charAt(k) != second.charAt(k))
				{
					differences++;
				}
			}
			if (differences == 1)
			{
				return true;
			}
		}
		return false;
	}
	
	//This function returns 1 if there is a mutation, otherwise it returns 0. 
	public static int hasMutation(String[] words)
	{
		for (int i = 0; i < words.length; i++)
		{
			for (int j = i; j < words.length; j++)
			{
				if (oneDifference(words[i], words[j]))
				{
					j = words.length;
				}
				else if ((!oneDifference(words[i], words[j])) && j == words.length - 1)
				{
					if (i == 0)
					{
						return 0;
					}
					for (int a = i - 1; a >= 0; a--)
					{
						if (oneDifference(words[i], words[a]))	
						{
							j = words.length;
							a = -1;
						}
						else if ((!oneDifference(words[i], words[a])) && a == 0)
						{
							return 0;
						}
					}
				}
			}
		}
		return 1;
	}
}
