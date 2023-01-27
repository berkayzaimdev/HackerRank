def merge_the_tools(string, k):
    words = []
    for i in range(0,len(string),k):
        words.append(string[i:i+k])
    for i in range(len(words)):
        tw = ""
        for c in words[i]:
            if c not in tw:
                tw+=c
        words[i]=tw
            
    print("\n".join(words))
