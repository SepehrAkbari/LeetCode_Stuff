class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = {}
    
        for i, num in enumerate(nums):
            x = target - num
            if x in n:
                return [n[x], i]
            n[num] = i
        
        return None
