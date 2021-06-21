class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> UAM =  new HashMap<>();
        for(int i = 0; i < logs.length; i++){
            UAM.computeIfAbsent(logs[i][0], l -> new HashSet<>()).add(logs[i][1]);
        }
        int[] ans = new int[k];
        Arrays.fill(ans, 0);
        for(int i: UAM.keySet()){
            ans[UAM.get(i).size() - 1]++;
        }
        return ans;
    }
}