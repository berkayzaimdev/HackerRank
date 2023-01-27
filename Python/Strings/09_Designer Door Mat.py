pat=".|."
inp=input()
x,y=int(inp.split(" ")[0]),int(inp.split(" ")[1])
c=0
artis=0
carpan=1
for i in range(x):
    if i==int(x/2):
        print("WELCOME".center(y,"-"))
        carpan*=-1
    else:
        print((pat*(artis+1)).center(y,"-"))
    artis+=2*carpan
