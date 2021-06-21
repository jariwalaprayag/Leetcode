class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> horizontal = new HashSet<>();
        HashSet<String> vertical = new HashSet<>();
        HashSet<String> square = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                
                if(horizontal.contains(Integer.toString(i) + ":" + board[i][j]))
                    return false;
                else
                    horizontal.add(Integer.toString(i) + ":" + board[i][j]);
                
                if(vertical.contains(Integer.toString(j) + ":" + board[i][j]))
                    return false;
                else
                    vertical.add(Integer.toString(j) + ":" + board[i][j]);
                
                int sq = getSquare(i, j);
                if(square.contains(Integer.toString(sq) + ":" + board[i][j]))
                    return false;
                else
                    square.add(Integer.toString(sq) + ":" + board[i][j]);
            }
        }
        return true;
    }
    
    public int getSquare(int row, int col){
        if(row < 3){
            if(col < 3)
                return 0;
            else if(col >= 3 && col < 6)
                return 1;
            else
                return 2;
        }
        else if(row >= 3 && row < 6){
            if(col < 3)
                return 3;
            else if(col >= 3 && col < 6)
                return 4;
            else
                return 5;
        }
        else{
            if(col < 3)
                return 6;
            else if(col >= 3 && col < 6)
                return 7;
            else
                return 8;
        }
    }
}