class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Accepted : Beats 85.70%
        int len = pushed.length;
        int j = 0;
        Stack<Integer> stack = new Stack();
        for(int i=0; i<len; i++){
            stack.push(pushed[i]);
            for( ;j<len && !stack.isEmpty() && popped[j] == stack.peek(); j++){
                stack.pop();
            }
        }
        for( ;j<len; j++){
            if(stack.pop() != popped[j]){
                return false;
            }
        }
        return true;
    }
}