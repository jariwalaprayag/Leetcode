class Solution:
    def trailingZeroes(self, n: int) -> int:
        x = 0
        i = 5
        while(i <= n):
            x += n // i
            i *= 5
        return x
        