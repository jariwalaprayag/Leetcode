class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(graph, temp, 0);
        return ans;
    }
    public void dfs(int[][] graph, List<Integer> path, int curr){
        if(path.get(path.size() - 1) == graph.length - 1){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < graph[curr].length; i++){
            path.add(graph[curr][i]);
            dfs(graph, path, graph[curr][i]);
            path.remove(path.size() - 1);
        }
        return;
    }
}