class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        dict = {}
        count  = 0
        for i in range(len(nums)):
            if(nums[i] in dict.keys()):
                a = dict[nums[i]]
                dict[nums[i]] += 1
                count += a
            else:
                dict[nums[i]] = 1
        return count