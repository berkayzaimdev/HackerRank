def print_rangoli(size):
    alfabe="abcdefghijklmnopqrstuvwxyz"
    for i in range(size-1,-size,-1):
        print('-'.join(alfabe[size-1:abs(i):-1]+alfabe[abs(i):size]).center(4*size-3,'-'))
