import java.util.*;

class Solution {
    public int firstUniqChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // no unique character
    }
}
