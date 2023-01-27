if __name__ == '__main__':
    N = int(input())
li=[]
for i in range(N):
    s=input()
    li2=s.split(" ")
    if(li2[0]=="insert"):
        li.insert(int(li2[1]),int(li2[2]))
    if(li2[0]=="print"):
        print(li)
    if(li2[0]=="remove"):
        li.remove(int(li2[1]))
    if(li2[0]=="append"):
        li.append(int(li2[1]))
    if(li2[0]=="sort"):
        li.sort()
    if(li2[0]=="pop"):
        li.pop()
    if(li2[0]=="reverse"):
        li.reverse()
