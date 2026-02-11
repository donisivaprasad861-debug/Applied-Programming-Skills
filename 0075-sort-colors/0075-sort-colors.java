// Counting Approach
// Time - O(n)
// Space - O(1)
class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0, ones = 0, twos = 0;

        for (int num : nums) {
            if (num == 0)
                zeroes++;
            else if (num == 1)
                ones++;
            else
                twos++;
        }

        int idx = 0;
        for (int i = 0; i < zeroes; i++)
            nums[idx++] = 0;

        for (int i = 0; i < ones; i++)
            nums[idx++] = 1;

        for (int i = 0; i < twos; i++)
            nums[idx++] = 2;
    }
}