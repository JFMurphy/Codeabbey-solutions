count = int(raw_input())
file = open("P008Output.txt", 'w+')

for l in range(count):
	data = raw_input().split()
	listSize = int(data.pop())
	stepSize = int(data.pop())
	initialValue = int(data.pop())
	result = initialValue
	
	for i in range(1, listSize):
		result += initialValue + (i * stepSize)
	print result,
	
	""" Sending output to file (codeabbeys solution checker down) """
	file.write(str(result) + " ")

file.close()