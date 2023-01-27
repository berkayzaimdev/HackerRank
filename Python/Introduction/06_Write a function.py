def is_leap(year):
    if(not year%4):
        if(not year%100):
            if(not year%400):
                return True
            else:
                return False
        else:
            return True
    else:
        return False

year = int(input())
print(is_leap(year))
