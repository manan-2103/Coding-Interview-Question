class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftScan = new int[n];
        leftScan[0] = 1;
        for (int i = 1; i < n; i++) {
            leftScan[i] = leftScan[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            leftScan[i] *= right;
            right *= nums[i];
        }
        return leftScan;
    }
}
