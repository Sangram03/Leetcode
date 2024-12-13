class Solution {
    public long findScore(int[] nums) {
        long score = 0; // Use long to avoid overflow
        int n = nums.length;
        Deque<Integer> q = new LinkedList<>();

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // If queue is not empty and the current number is greater than or equal to the last in queue
            if (!q.isEmpty() && nums[i] >= q.peekLast()) {
                boolean skip = false;
                // Process the elements in the queue
                while (!q.isEmpty()) {
                    int add = q.pollLast();
                    if (!skip) {
                        score += add;
                    }
                    skip = !skip;
                }
                continue;
            }

            // Add current element to the queue
            q.addLast(nums[i]);
        }

        // Final processing of remaining elements in the queue
        boolean skip = false;
        while (!q.isEmpty()) {
            int add = q.pollLast();
            if (!skip) {
                score += add;
            }
            skip = !skip;
        }

        return score;
    }
}
