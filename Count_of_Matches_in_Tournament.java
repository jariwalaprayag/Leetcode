class Solution {
    public int numberOfMatches(int n) {
        if(n < 2)
            return 0;
        int total_matches = 0;
        while(n > 2){
            if(n % 2 == 0){
                total_matches += (n / 2);
                n = n / 2;
            }
            else{
                total_matches += ((n - 1) / 2);
                n = (n - 1) / 2 + 1;
            }
        }
        return total_matches + 1;
    }
}