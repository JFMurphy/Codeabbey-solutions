count = int(raw_input())

for couple in range(0, count):
	array = raw_input().split()
	arraySum = 0
	
	for i in array:
		arraySum += int(i)
	
	print arraySum,