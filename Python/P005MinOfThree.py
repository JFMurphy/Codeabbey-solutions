count = int(raw_input())

for n in range(count):
	nums = raw_input().split()
	minimum = 0
	
	for i in nums:	
		if minimum == 0:
			minimum = int(i)
			
		if int(i) < minimum:
			minimum = int(i)
			
	print minimum,