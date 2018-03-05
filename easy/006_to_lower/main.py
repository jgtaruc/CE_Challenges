import sys

filename = sys.argv[1]

with open(filename, 'r') as fp:
    line = fp.read()
    while line:
        if line != "":
            print line.lower()
        line = fp.readline()