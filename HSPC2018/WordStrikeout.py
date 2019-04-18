def wordStrikeout(s,e):
	count = 0
	for i in e:
		if(s.count(i) > 1):
			count += s.count(i) / e.count(i)
	return int(count)

print(wordStrikeout("happpy", "happy"))