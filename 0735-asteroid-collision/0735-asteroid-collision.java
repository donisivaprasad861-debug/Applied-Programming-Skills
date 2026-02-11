class Solution {
    public int[] asteroidCollision(int[] ast) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : ast) {
            if (i > 0) {
                deque.push(i);
            } else {
                while (!deque.isEmpty() && deque.peek() > 0 && deque.peek() < -i) {
                    deque.pop();
                }
                if (!deque.isEmpty() && deque.peek() == -i) {
                    deque.pop();
                } else if (deque.isEmpty() || deque.peek() < 0) {
                    deque.push(i);
                }
            }
        }
        int[] arr = new int[deque.size()];
        while (!deque.isEmpty()) {
            arr[deque.size() - 1] = deque.pop();
        }
        return arr;
    }
}