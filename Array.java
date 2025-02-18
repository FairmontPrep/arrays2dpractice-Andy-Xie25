public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x)
	{
		int[][] arr = new int[x][x];
		int count = 1;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < x; j++)
			{
				arr[i][j] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x)
	{
		int[][] arr = new int[x][x];
		int count = 1;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < x; j++)
			{
				arr[j][i] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 2 3 4
	// 5 6 7 8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column)
	{
		int[][] arr = new int[row][column];
		int count = 1;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				arr[i][j] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row)
	{
		int[][] arr = new int[row][column];
		int count = 1;
		for (int i = 0; i < column; i++)
		{
			for (int j = 0; j < row; j++)
			{
				arr[j][i] = count;
				count++;
			}
		}
		return arr;
	}

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a)
    {
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if (a[i][j] < 10)
				{
					System.out.print(" " + a[i][j] + " ");
				}
				else
				{
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	}
