class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int index=0; index<nums.length; index++){
            int currentNum = nums[index];
            Integer containsSumsThatsEqualsToTarget = hashMap.get(currentNum);
            if( containsSumsThatsEqualsToTarget == null){
                int difference = target - currentNum;
                hashMap.put(difference,index); 
            }else{
                return new int[]{ containsSumsThatsEqualsToTarget , index}; 
            }
        }
        return new int[]{};
    }
}
