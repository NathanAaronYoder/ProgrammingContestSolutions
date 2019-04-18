def tridagonalMatrice(matrix):
	length = len(matrix) - 1
	n = len(matrix) - 2
	for i in range(n):
		for j in range(i+2, len(matrix)):
			if (matrix[i][j] != 0):
				return False
			if (matrix[length - i][length - j] != 0):
			    return False
	return True