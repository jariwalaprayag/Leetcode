class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product_without_zero = 1;
        int product = 1;
        int count_zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                product *= nums[i];
                count_zero++;
            }
            else{
                product *= nums[i];
                product_without_zero *= nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && count_zero == 1)
                ans[i] = product_without_zero;
            else if(nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = product / nums[i];
        }
        return ans;
    }
}