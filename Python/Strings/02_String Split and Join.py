def split_and_join(line):
    l=line.split(" ")
    return "-".join(l)

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
