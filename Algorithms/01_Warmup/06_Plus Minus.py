import math
import os
import random
import re
import sys

def plusMinus(arr):
    plus=0
    minus=0
    zero=0
    for x in arr:
        if x>0:
            plus+=1/len(arr)
        elif x<0:
            minus+=1/len(arr)
        else:
            zero+=1/len(arr)
    print(plus)
    print(minus)
    print(zero)
if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
