def intersect(a,b,c,d,e,f,g,h):
	firstArea = abs(b - d) * abs(a - c)
	secondArea = abs(f - h) * abs(e - g)
	area = firstArea + secondArea
	arr1 = [a,c,e,g]
	arr1.sort()
	arr2 = [b,d,f,h]
	arr2.sort()
	x1 = arr1[1]
	x2 = arr1[2]
	y1 = arr2[1]
	y2 = arr2[2]
	unionArea = (x2 - x1) * (y2 - y1)
	intersection = area - unionArea
	return [unionArea,intersection]