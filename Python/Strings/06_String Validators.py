if __name__ == '__main__':
    s = input()
v1=True
v2=True
v3=True
v4=True
v5=True
for i in s:
    if i.isalnum():
        print("True")
        v1=False
        break
if v1:
    print("False")
for i in s:
    if i.isalpha():
        print("True")
        v2=False
        break
if v2:
    print("False")
for i in s:
    if i.isdigit():
        print("True")
        v3=False
        break
if v3:
    print("False")
for i in s:
    if i.islower():
        print("True")
        v4=False
        break
if v4:
    print("False")
for i in s:
    if i.isupper():
        print("True")
        v5=False
        break
if v5:
    print("False")
