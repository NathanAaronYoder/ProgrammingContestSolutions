def stringDiff(s,e):
	count = 0
	for i in range(len(s)):
		if (s[i] != e[i]):
			count+= 1
	return count

def survive(s, e, array):
	arr = array.copy()
	arr.append(e)
	for i in arr:
		if (stringDiff(s,i) == 1):
			for c in range(len(s)):
				if (s[c] != e[c] and e[c] == i[c]):
					newArr = arr.copy()
					newArr.remove(i)
					new_s = s[0:c] + i[c] + s[c+1:len(s)]
					if(new_s == e):
						return True
					if(survive(new_s,e,newArr)):
						return True
	return False

print(survive("000","111",["011","110","101","001"]))