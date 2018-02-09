import sys

filename = sys.argv[1]

def minMultiple(x, n):
    temp = n
    i = 1
    while temp < x:
        temp = n * i
        i = i + 1

    return temp

with open(filename) as fp:
    line = fp.readline()
    while line:
        if line.strip() != "":
            arr = line.strip().split(",")
            print minMultiple(int(arr[0]), int(arr[1]))

        line = fp.readline()
