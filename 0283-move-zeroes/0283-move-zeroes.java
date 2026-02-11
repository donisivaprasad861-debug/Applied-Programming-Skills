class Solution {
    public void moveZeroes(int[] nums) {
        // A Pointer to track the position for the next non-zero element
        int insertPos = 0;
        // Pass 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        // Pass 2: Fill the remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}