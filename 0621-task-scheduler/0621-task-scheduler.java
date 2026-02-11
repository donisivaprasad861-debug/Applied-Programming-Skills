class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) freq[task - 'A']++;

        Arrays.sort(freq);  // Sort to get the max frequency at the end

        int maxFreq = freq[25];
        int maxFreqCount = 1;

        // Count how many tasks have this max frequency
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == maxFreq) maxFreqCount++;
            else break;
        }

        int partCount = (maxFreq - 1) * (n + 1) + maxFreqCount;

        return Math.max(tasks.length, partCount);
    }
}