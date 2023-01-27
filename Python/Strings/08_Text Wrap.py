def wrap(string, max_width):
    lis=[]
    fin=""
    for i in range(0,len(string),max_width):
        fin+=string[i:i+max_width]+'\n'
        #lis.append[string[i:i+max_width]]
        #print(lis[i])
    return fin
