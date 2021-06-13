class Solution:
    def countPrimes(self, n: int) -> int:
        comp = set()
        count = 0
        for i in range(2, n):
            if i not in comp:
                count += 1
                for j in range(i*i, n, i):
                    comp.add(j)
        return count