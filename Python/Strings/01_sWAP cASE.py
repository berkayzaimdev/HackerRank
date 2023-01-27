def swap_case(s):
    s2=""
    for i in s:
        if i.islower():
            s2+=chr(ord(i)-32)
        elif i.isupper():
            s2+=chr(ord(i)+32)
        else:
            s2+=i
    return s2
