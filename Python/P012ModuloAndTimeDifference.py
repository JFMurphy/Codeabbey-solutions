"""
Dealing with remainders may cause heavy headache to novice programmers. 
Let us write a simple program which has this operation for its core to study integer division better. 
At the same time we'll have some practice in handing dates - which sometimes gives headache even to experienced coders.

In arithmetic, the remainder (or modulus) is the amount "left over" after performing the division of two integers which do not divide evenly (from Wiki). 
This task will provide further practice with modulo operation.

Suppose, we are given two timestamps - for example, when the train or ferry boat starts its travel and when it finishes. This may look like:

start: May 3, 17:08:30
end  : May 8, 12:54:15
and we are curious to know, how much time (in days, hours, minutes and seconds) is spent in traveling (perhaps, to choose faster variant). 
How this could be achieved?

One of the easiest way is:

convert both timestamps to big numbers, representing seconds from the beginning of the month (or year, or century);
calculate their difference - i.e. travel time in seconds;
convert this difference back to days, hours, minutes and seconds.
First operation could be performed by multiplying minutes by 60 and hours by 60*60 etc. and summing all values up.
The third operation should be performed on contrary by several divisions with keeping remainders.

In this task we are given several pair of timestamps. We suppose that both dates in the pair are always in the same month,
so only number of day will be given. We want to calculate difference between timestamps in each pair.

Input data: the first line contains number of test-cases, other lines contain test-cases themselves.
Each test-case contains 8 numbers, 4 for each timestamp: day1 hour1 min1 sec1 day2 hour2 min2 sec2 (second timestamp will always be later than first).
Answer: for each test-case you are to output difference as following (days hours minutes seconds) - please note brackets - separated by spaces.

Example:

input data:
3
1 0 0 0 2 3 4 5
5 3 23 22 24 4 20 45
8 4 6 47 9 11 51 13

answer:
(1 3 4 5) (19 0 57 23) (1 7 44 26)
"""

count = int(raw_input())

#Constants for each time period in seconds.
DAY = 86400
HOUR = 3600
MINUTE = 60
SEC = 1

for n in range(count):
	data = [int(i) for i in raw_input().split()]
	day1 = data[0]
	hour1 = data[1]
	min1 = data[2]
	sec1 = data[3]
	day2 = data[4]
	hour2 = data[5]
	min2 = data[6]
	sec2 = data[7]
	
	#Converting first time to seconds.
	day1_secs = ((day1 * DAY) + (hour1 * HOUR) + (min1 * MINUTE) + sec1)
	
	#Converting second time to seconds
	day2_secs = ((day2 * DAY) + (hour2 * HOUR) + (min2 * MINUTE) + sec2)
	
	timeDifference = day2_secs - day1_secs
	
	#Converting timeDifference into the format: days hours mins secs
	dayDiff = timeDifference / DAY
	timeDifference %= DAY
	
	hourDiff = timeDifference / HOUR
	timeDifference %= HOUR
	
	minDiff = timeDifference / MINUTE
	timeDifference %= MINUTE
	
	secDiff = timeDifference / SEC
	timeDifference %= SEC
	
	print "(%s %s %s %s)" % (dayDiff, hourDiff, minDiff, secDiff),