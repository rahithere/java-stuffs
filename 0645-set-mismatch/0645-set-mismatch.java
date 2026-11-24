class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;

        while (i < nums.length){
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        System.out.println("done sorting");
        //array is sorted now
        for (int index = 0; index < nums.length; index++) {
            // System.out.println("inside 2ndloop");
            if (nums[index] != index + 1){
                System.out.println("wrong number");
                ans[0] = nums[index];
                ans[1] = index + 1;
            }
        }

        return ans;
    }

      static void swap(int[] nums, int first, int second){
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
}
}