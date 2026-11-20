class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;

                if ((mid > 0) && (target > nums[mid - 1])) {
                    ans = mid;
                }
                if ((mid == 0) && (target < nums[mid])) {
                    ans = mid;
                }
            }
            if (target > nums[mid]) {
                start = mid + 1;

                if ((mid < nums.length - 1) && (target < nums[mid + 1])) {
                    ans = mid + 1;
                }
                if ((mid == nums.length - 1) && (target > nums[mid])) {
                    System.out.println("here");
                    ans = mid + 1;
                }
            }
        }
        return ans;
    }
}