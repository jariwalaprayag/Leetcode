class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int max = 0;
        if(rectangles.length == 0)
            return count;
        for(int i = 0; i < rectangles.length; i++){
            int temp = Math.min(rectangles[i][0], rectangles[i][1]);
            if(temp > max){
                max = temp;
                count = 1;
            }
            else if(temp == max){
                count += 1;
            }
        }
        return count;
    }
}