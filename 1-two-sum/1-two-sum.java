class Solution {
    public int[] twoSum(int[] nums, int target) {
         int l = 0;
        int m = 0;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    l = i;
                    m = j;
                }
            }
        }
        int[] arr = {l,m};
        return arr;
    }
}