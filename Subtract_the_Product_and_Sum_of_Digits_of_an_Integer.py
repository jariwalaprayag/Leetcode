class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product = 1
        sum1 = 0
        while n > 0:
            i = n % 10
            n = n // 10
            product *= i
            sum1 += i
        return product - sum1