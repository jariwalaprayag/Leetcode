class Solution {
    public int findCenter(int[][] edges) {
        int ans = -1;
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            ans = edges[0][0];
        if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1])
            ans = edges[0][1];
        return ans;
    }
}