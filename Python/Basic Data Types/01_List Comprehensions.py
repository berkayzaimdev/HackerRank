if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    lis = [[d,e,f] for d in range(x+1) for e in range(y+1) for f in range(z+1) if (d+e+f)!=n]
    print(lis)
