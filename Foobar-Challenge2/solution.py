def solution(l):
    
    # make a dictionary for the values
    d = dict.fromkeys(l, 0)
    # split by the .
    for v in l:
        d[v] = list(map(int, v.split('.')))
    
    # sort
    d = sorted(d.items(), key=lambda x: x[1])
    return [i[0] for i in d]
