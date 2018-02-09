from random import *

n = 1000;

def isPrime(n, k):
    if n == 2 and n == 3:
        return True;

    while k != 0:
        a = randint(4, n-2)
        if pow(a, n-1) % n != 1:
            return False
        k = k -1
    
    return True

def isPalindrome(n):
    s = str(n)

    for i, c in enumerate(s):
        a = s[i]
        b = s[(len(s)-i)-1]
        if a != b:
            return False

    return True

for i in xrange(n, 0, -1):
    if isPrime(i, 1) and isPalindrome(i):
        print i
        break