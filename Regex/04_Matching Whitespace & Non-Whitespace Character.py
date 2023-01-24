Regex_Pattern = r"(\S\S\s){2}\S{2}"

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())
