import java.util.ArrayList;
/*A 1 represents a piece of land. A 0 represents a body of water. 
This program takes a 2D Array of 1's and 0's and returns how many islands there are in the map.*/
public class IslandCounter {

	private static ArrayList<int[]> countedOnes = new ArrayList<int[]>();

	public static boolean notUsed(int x, int y)
	{
		for (int[] coordinates: countedOnes)
		{
			if (coordinates[0] == x && coordinates[1] == y)
			{
				return false;
			}
		}
		return true;
	}
	  
	//This function finds all of the 1's and stores their location so they cannot be used again.
	public static void goThroughIsland(int x, int y, int[][] map)
	{
		boolean hasNoneAround = true;
		if (x != 0 && notUsed(x - 1, y) && map[x - 1][y] == 1)
		{
			hasNoneAround = false;
			countedOnes.add(new int[]{x, y});
			goThroughIsland(x - 1, y, map);
		}
		if (y != map[0].length - 1 && notUsed(x, y + 1) && map[x][y + 1] == 1)
		{
			hasNoneAround = false;
			countedOnes.add(new int[]{x, y});
			goThroughIsland(x, y + 1, map);
		}
		if (x != map.length - 1 && notUsed(x + 1, y) && map[x + 1][y] == 1)
		{
			hasNoneAround = false;
			countedOnes.add(new int[]{x, y});
			goThroughIsland(x + 1, y, map);
		}
		if (y != 0 && notUsed(x, y - 1) && map[x][y - 1] == 1)
		{
			hasNoneAround = false;
			countedOnes.add(new int[]{x, y});
			goThroughIsland(x, y - 1, map);
		}
		if (hasNoneAround)
		{
			countedOnes.add(new int[]{x, y});
		}
	}

	//This function goes through the map to count the number of islands.
	public static int countIslands(int[][] map)
	{
		int count = 0;
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map[0].length; j++)
			{
				if (notUsed(i, j) && map[i][j] == 1)
				{
					goThroughIsland(i, j, map);
					count++;
				}
			}
		}
		return count;
	}
