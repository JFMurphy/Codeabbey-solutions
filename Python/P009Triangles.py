"""
Triangle is an object built of three line segments (sides of triangle), connected by ends. 
Wiki on triangles provides more detailed explanation.
If we have three line segments with lengths A B C - we either can built a triangle with them
(for example with 3 4 5 or 3 4 7 - though this is with zero area) or we found it impossible
(for example 1 2 4).

You are given several triplets of values representing lengths of the sides of triangles. 
You should tell from which triplets it is possible to build triangle and for which it is not.

Input data: First line will contain number of triplets.
Other lines will contain triplets themselves (each in separate line).
Answer: You should output 1 or 0 for each triplet (1 if triangle could be built and 0 otherwise).

Example:

data:
2
3 4 5
1 2 4

answer:
1 0
"""

count = int(raw_input())

for n in range(count):
	sides = [int(side) for side in raw_input().split()]
	a = sides[0]
	b = sides[1]
	c = sides[2]
	minimum = 0
	maximum = 0
	
	# Finding the bigger number to aid in subtraction.
	if b > c:
		maximum = b
		minimum = c 
	else:
		maximum = c 
		minimum = b 
		
	lowerLimit = maximum - minimum
	upperLimit = maximum + minimum
	
	if a > lowerLimit and a < upperLimit:
		print 1,
	else:
		print 0,