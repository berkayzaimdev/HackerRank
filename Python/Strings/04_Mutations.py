def mutate_string(string, position, character):
    s_new=""
    for i in range(len(string)):
        if i==position:
            s_new+=character
        else:
            s_new+=string[i]
        
    return s_new
