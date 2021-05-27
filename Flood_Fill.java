class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<int[]> res= new LinkedList<>();
        int start = image[sr][sc];
      res.add(new int[]{sr,sc});
      boolean visited[][] = new boolean[image.length][image[0].length];
        int dx[] = new int[]{0,1,-1,0};
        int dy[] = new int[]{1,0,0,-1};
        while(!res.isEmpty()){
          int cur[] = res.poll();
          int r = cur[0];
          int c = cur[1];
          if(visited[r][c])
              continue;
            visited[r][c] = true;
            image[r][c] = newColor;
          for(int i=0;i<dx.length;i++) {
              int nr = r+dx[i];
              int ny = c+dy[i];
              if(isValid(image,nr,ny,start)){
                  res.add(new int[]{nr,ny});
              }
          }
      }
        return image;
    }
    boolean isValid(int image[][],int nr,int ny,int start) {
 if(nr<0||nr>=image.length||ny<0||ny>=image[0].length||image[nr][ny]!=start)
            return false;
        return true;
    }
}