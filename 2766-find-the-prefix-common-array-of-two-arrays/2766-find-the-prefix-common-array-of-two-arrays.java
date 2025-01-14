class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] fre = new int[A.length]; // Frequency array
        int[] ans = new int[A.length]; // Result array
        int temp = 0; // Running count of common elements

        for (int i = 0; i < A.length; i++) {
            // Update frequency for A[i]
            fre[A[i] - 1]++;
            if (fre[A[i] - 1] == 2) temp++;

            // Update frequency for B[i]
            fre[B[i] - 1]++;
            if (fre[B[i] - 1] == 2) temp++;

            // Update result array
            ans[i] = temp;
        }

        return ans;
    }
}