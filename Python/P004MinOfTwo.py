"""
Most programs should be able to make some choices and decisions. And we are going to practice conditional programming now.
This is usually done by a kind of if ... else statements which may look like:

IF some_condition THEN
    do_something
ELSE
    do_other_thing
ENDIF
Depending on your programming language syntax could be different and else part is almost always optional. 
You can read more in wikipedia article on Conditional statements.

Of two numbers, please, select one with minimum value. Here are several pairs of numbers for thorough testing.

Input data will contain number of test-cases in the first line.
Following lines will contain a pair of numbers to compare each.
For Answer please enter the same amount of minimums separated by space, for example:

data:
3
5 3
2 8
100 15

answer:
3 2 15
"""

count = int(raw_input())

for n in range(0, count):
	minimum = 0
	nums = raw_input().split()
		
	if int(nums[0]) > int(nums[1]):
		minimum = int(nums[1])
	else:
		minimum = int(nums[0])
	
	print minimum,