#!/bin/python3

import math
import os
import random
import re
import sys

def diagonalDifference(arr):
    sumlr=0
    sumrl=0
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if i==j:
                sumlr+=arr[i][j]
            if i+j==len(arr)-1:
                sumrl+=arr[i][j]
    return abs(sumlr-sumrl)          

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
