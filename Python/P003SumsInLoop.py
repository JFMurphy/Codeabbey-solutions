""" 
 If you already learned how to write program with a simple loop from Sum in Loop task, this new exercise will be just a simple modification.

Now we are given several pairs of values and we want to calculate sum for each pair.

Input data will contain the total count of pairs to process in the first line.
The following lines will contain pairs themselves - one pair at each line.
Answer should contain the results separated by spaces.

Example:

data:
3
100 8
15 245
1945 54

answer:
108 260 1999

"""

count = int(raw_input())

for couple in range(0, count):
	array = raw_input().split()
	arraySum = 0
	
	for i in array:
		arraySum += int(i)
	
	print arraySum,