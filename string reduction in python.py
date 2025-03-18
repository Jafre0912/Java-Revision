#string reduction hackerrank solution
#!/usr/bin/py
# Head ends here
dyn = {}
def stringReduction(a):
    #print(a)
    if a in dyn.keys():
        return dyn[a]
    if len(a) == 1:
        dyn[a] = 1
        return 1
    ans = 101
    ko = 0
    for i in range(len(a) - 1):
        if a[i] != a[i + 1]:
            b = list(a)
            b[i + 1] = ({'a', 'b', 'c'} - {b[i], b[i + 1]}).pop()
            del b[i]
            ans = min(ans, stringReduction(''.join(b)))
            ko += 1
            if ko > 1:
                break
    if ko == 0:
        ans = len(a)
    dyn[a] = ans
    return ans
# Tail starts here
if _name_ == '_main_':
    t = int(input())
    for i in range(0,t):
        a=input()
        print(stringReduction(a)
