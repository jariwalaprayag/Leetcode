class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r_count = 0;
        int l_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R')
                r_count++;
            else if(s.charAt(i)  == 'L')
                l_count++;
            if(r_count == l_count){
                ans++;
                r_count = 0;
                l_count = 0;
            }
        }
        return ans;
    }
}