count = int(raw_input())

nums = raw_input.split(" ")
nums = [int(i) for i in nums]

result = 0

for num in nums:
	result += num
	
print result