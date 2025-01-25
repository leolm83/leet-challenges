class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int x = nums.length -1 ;
        int[] result = new int[nums.length]; 
        while(x>=0){
            int leftValue = nums[left] *nums[left];
            int rightValue =  nums[right] * nums[right] ;
           if(leftValue>=rightValue){
             result[x] = leftValue;
             left++;
           }else {
            result[x] = rightValue;
            right--;
           }
         x--;
        }
       
        return result;
    }
}
