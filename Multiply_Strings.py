class Solution(object):
    def multiply(self, num1, num2):
        int1 = int2 = 0
        zero_ascii = ord('0')
        for i in num1:
            int1 *= 10
            int1 += (ord(i) - zero_ascii)
        for i in num2:
            int2 *= 10
            int2 += (ord(i) - zero_ascii)
        return str(int1 * int2)
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """