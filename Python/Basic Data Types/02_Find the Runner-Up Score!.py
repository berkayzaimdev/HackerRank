if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split()) 
    for y in range(0,n):
        deger1=max(arr)
        arr.remove(max(arr))
        deger2=max(arr)
        if deger2!=deger1:
            print(deger2)
            break
