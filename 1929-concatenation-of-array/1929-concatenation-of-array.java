class Solution {
    public int[] getConcatenation(int[] nums) {
        
         int length = nums.length;
          int[] ans = new int[length*2];
          int count = 0;

          for (int i = 0; i < length*2; i++) {

            if(i < length){
                ans[count] = nums[count];
                count += 1;
            }else{
                if(i == length){
                    count = 0;
                }
                ans[i] = nums[count];
                count++;
            }
        }
        return ans;
    }
}