ogrenciler = []
if __name__ == '__main__':
    for _ in range(int(input())):
        name = input()
        score = float(input())
        ogrenciler.append([name,score])
    ogrenciler.sort(key = lambda x:x[1])
    seconder = min([x[1] for x in ogrenciler if x[1]>ogrenciler[0][1]])
    isimler = [x[0] for x in ogrenciler if x[1]==seconder]
    isimler = sorted(isimler)
    for name in isimler:
        print(name)
