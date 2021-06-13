class Solution:
    def isHappy(self, n: int) -> bool:
        if(n < 0):
            return False
        count = 0
        while(True):
            sum = 0
            while(n > 0):
                sum += (n % 10) ** 2
                n //= 10
            count += 1
            if(sum == 1):
                return True
            if(count > 5):
                return False
            n = sum
                