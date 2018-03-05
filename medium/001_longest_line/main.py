import sys

with open(sys.argv[1], 'r') as fp:
    line = fp.readline().strip("\n\r")
    numLines = int(line)
    lines = []
    line = fp.readline().strip("\n\r")    
    while line:
        lines.append(line)
        line = fp.readline().strip("\n\r")

lines.sort(key=len, reverse=True)
for i, l in enumerate(lines):
    if i == numLines:
        break
    print l
