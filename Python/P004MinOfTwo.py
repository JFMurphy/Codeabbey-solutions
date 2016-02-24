count = int(raw_input())

for n in range(0, count):
	minimum = 0
	nums = raw_input().split()
		
	if int(nums[0]) > int(nums[1]):
		minimum = int(nums[1])
	else:
		minimum = int(nums[0])
	
	print minimum,