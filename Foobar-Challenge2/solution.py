def solution(l):
    result = sorted(l, key=lambda l:[int(i) for i in l.split('.')])
    print(result)
