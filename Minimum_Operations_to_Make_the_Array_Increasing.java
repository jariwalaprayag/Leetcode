class Solution {
    public int minOperations(int[] nums) {
        if(nums.length <= 1)
            return 0;
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] >= nums[i]){
                int temp = nums[i - 1] - nums[i] + 1;
                ans += temp;
                nums[i] += temp;
            }
        }
        return ans;
    }
}