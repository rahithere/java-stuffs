class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int totalDig = 0;
        int totalEven = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] > 0){
                totalDig += 1;
                nums[i] = nums[i]/10;
            }
            if(totalDig%2 == 0){
                totalEven += 1;
            }
            totalDig = 0;
        }
        return totalEven;
    }
    }
