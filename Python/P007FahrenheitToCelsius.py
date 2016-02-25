data = raw_input().split()
data.pop(0)
data = [float(i) for i in data]

for i in data:
	result = 0
	result = (i - 32) / 1.8
	
	print int(round(result, 0)),