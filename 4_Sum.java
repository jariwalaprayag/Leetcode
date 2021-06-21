class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
                int a = nums[i];
                int b = nums[j];
                int left = j+1;
                int right = nums.length - 1;
                while(left <  right){
                    if(a + b + nums[left] + nums[right] == target){
                        if(!ans.contains(Arrays.asList(a, b, nums[left], nums[right])))
                            ans.add(Arrays.asList(a, b, nums[left], nums[right]));
                    }
                    if(a + b + nums[left] + nums[right] < target)
                        left++;
                    else
                        right--;
                }
            }
        }
        return ans;
    }
}