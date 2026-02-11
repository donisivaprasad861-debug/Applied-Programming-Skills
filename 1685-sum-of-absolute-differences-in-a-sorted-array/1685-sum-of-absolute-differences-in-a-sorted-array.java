class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // sum of elements to the left of i
        int sumLeft = 0;
        for (int i = 0; i < n; i++) {
            int number = nums[i];
            // contribution from left side: nums[i] - nums[j]
            ans[i] += (number * i) - sumLeft;
            sumLeft += number; // include current for next indices
        }

        // sum of elements to the right of i
        int sumRight = 0;
        for (int i = n - 1; i >= 0; i--) {
            int number = nums[i];
            // contribution from right side: nums[j] - nums[i]
            ans[i] += sumRight - (number * (n - i - 1));
            sumRight += number; // include current for previous indices
        }

        return ans;
    }
}