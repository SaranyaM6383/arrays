class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,(k%nums.length)-1);
        reverse(nums,k%nums.length,nums.length-1);
    }
    private void reverse(int[] nums,int left,int right){
        while(left<right){
     int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
