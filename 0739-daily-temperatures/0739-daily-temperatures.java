import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n]; // Initialized to 0s by default
        
        // Stack stores pairs of [temperature, index]
        Stack<int[]> stack = new Stack<>();
 
        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            
            // Check if current temp is warmer than the temp at the top of the stack
            while (!stack.isEmpty() && stack.peek()[0] < currentTemp) {
                int[] prevDay = stack.pop();
                int prevTemp = prevDay[0];
                int prevIndex = prevDay[1];
                
                // Calculate the number of days waited
                answer[prevIndex] = i - prevIndex;
            }
            
            // Push the current day's info onto the stack to wait for a warmer day
            stack.push(new int[]{currentTemp, i});
        }
        
        return answer;
    }
}