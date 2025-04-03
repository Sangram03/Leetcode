class Solution {
    public long maximumTripletValue(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int diff = 0;
        long res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
            if (i >= 2)
                res = Math.max(res, (long)diff * nums[i]);
            if (i >= 1)
                diff = Math.max(diff, maxi - nums[i]);
        }
        
        return res;
    }
}