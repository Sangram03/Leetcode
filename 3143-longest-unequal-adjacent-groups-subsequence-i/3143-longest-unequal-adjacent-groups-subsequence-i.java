class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int order = -1;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != order) {
                order = groups[i];
                res.add(words[i]);
            }
        }
        return res;
    }
}