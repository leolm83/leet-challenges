class Solution {
    public void moveZeroes(int[] nums) {    
        int left = 0;
        for(int index=0;index<nums.length;index++){
            if(!(nums[index]==0)){
                int temp = nums[left];
                nums[left] = nums[index];
                nums[index] = temp;
                left++;
            }
        }
    
 }
}
