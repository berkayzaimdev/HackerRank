def minion_game(string):
    components={"Stuart":0,"Kevin":0}
    unluler="AEIOU"
    
    for i in range(len(string)):
        if string[i] in unluler:
            components["Kevin"]+=len(string)-i
        else:
            components["Stuart"]+=len(string)-i
    print("Kevin "+str(components["Kevin"]) if components["Kevin"]>components["Stuart"] else "Stuart "+str(components["Stuart"]) if components["Stuart"]>components["Kevin"] else "Draw")
