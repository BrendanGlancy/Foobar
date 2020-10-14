def solution(data, n):
    return [s for s in data if data.count(s) <= n]
