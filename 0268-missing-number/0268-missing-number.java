class Solution {
    public int missingNumber(int[] nums){
        int i = 0;
        
        while(i < nums.length){
            if (nums[i] < nums.length && nums[i]!= i){
                swap(nums, nums[i], i);
            }else{
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (index != nums[index]){
                return index;
            }
        }
        
                    //case2
                    return nums.length;
    }

    static void swap(int[] nums, int first, int second){
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
}
}
