class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<String>, List<String>> ana = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String i: strs){
            List<String> key = new ArrayList<String>();
            for(int j = 0; j < i.length(); j++){
                key.add(String.valueOf(i.charAt(j)));
            }
            Collections.sort(key);
            ana.computeIfAbsent(key, k -> new ArrayList<>()).add(i);
        }
        for(List<String> i : ana.values()){
            ans.add(i);
        }
        return ans;
    }
}