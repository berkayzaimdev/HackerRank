def print_formatted(number):
    j = len(str(bin(number).replace("0b","")))
    for i in range(1,number+1):
        oc=list()
        temp=i
        while temp>0:
            oc.append(temp%8)
            temp//=8
        i=str(i).rjust(j,' ')
        oc=''.join([str(x) for x in oc[::-1]]).rjust(j,' ')
        he=hex(int(i)).replace('0x','').title().rjust(j,' ')
        bi=(bin(int(i)).split('b')[-1]).rjust(j,' ')
        print (i,oc,he,bi)
