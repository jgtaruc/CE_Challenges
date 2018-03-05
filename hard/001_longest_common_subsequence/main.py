import sys

def getSequence(string1, string2):
    subsequence = []
    sequence = "";
    i = 0
    j = 0

    while i < len(string1):
        if string1[i] in string2:
            temp1 = string2.index(string1[i])
            j = i+1
            sequence += string1[i]
            while j < len(string1):
                if string1[j] in string2:
                    temp2 = string2.index(string1[j])
                    if temp2 > temp1 and temp2 > string2.index(sequence[len(sequence)-1]):
                        sequence += string1[j]
                j+=1
            subsequence.append(sequence)
            sequence = "";
        i+=1      

    subsequence.sort(key=len, reverse=True)
    print subsequence[0]


with open(sys.argv[1], 'r') as fp:
    line = fp.readline().strip("\n\r")
    subsequence = []
    while line:
        string1 = line.split(";")[0]
        string2 = line.split(";")[1]
        
        getSequence(string1, string2)

        line = fp.readline().strip("\n\r")