def solve(s):
    st=s[0].title()
    attr=0
    for i in s[1:]:
        if not i.isalpha() or i.isupper():
            attr=0  
        st+=chr(ord(i)-attr)
        attr=0
        if i==' ':
            attr=32
    return st
