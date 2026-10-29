class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] arr = new int[length];
        int start = 0;
        int end = length/2;

         for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                arr[i] = nums[start];
                start++;
            }else{
                arr[i] = nums[end];
                end++;
            }
        }
        return arr;
    }
}