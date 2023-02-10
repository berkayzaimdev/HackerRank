import math
import os
import random
import re
import sys

def gradingStudents(grades):
    i=0
    a=[]
    for x in grades:
        if x>=38:
            for j in range(3):
                if (x+j)%5 == 0:
                    x+=j
                    break
        a.append(x)
        i+=1  
    return a

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    grades_count = int(input().strip())
    grades = []
    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)
    result = gradingStudents(grades)
    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')
    fptr.close()
