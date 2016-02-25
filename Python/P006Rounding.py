count = int(raw_input())

for n in range(count):
	nums = raw_input().split()
	result = 0.0
	nums = [float(num) for num in nums]
	
	result = nums[0] / nums[1]
	
	result = round(result, 0)
	
	print int(result),
