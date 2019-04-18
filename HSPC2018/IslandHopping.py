def islandHop(arr):
	if (len(arr) == 1):
		return True
	if (arr[0] == 0):
		return False
	for i in range(1,arr[0]+1):
		if(islandHop(arr[i:len(arr)])):
			return True
	return False

print(islandHop([1,2,3,1,0,1]))