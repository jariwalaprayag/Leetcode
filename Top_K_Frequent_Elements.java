class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i: nums)
            count.put(i, count.getOrDefault(i, 0) + 1);
        List<Integer> list = new ArrayList<>(count.keySet());
        Collections.sort(list, (a, b) -> (count.get(b) - count.get(a)));
        for(int i = 0; i < k; i++)
            ans[i] = list.get(i);
        return ans;
    }
}