class Solution {
    public void gameOfLife(int[][] board) {
        int[][] prev_stage = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++)
                prev_stage[i][j] = board[i][j];
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                int count = 0;
                if(i > 0 && prev_stage[i - 1][j] == 1)
                    count++;
                if(j > 0 && prev_stage[i][j - 1] == 1)
                    count++;
                if(i < board.length - 1 && prev_stage[i + 1][j] == 1)
                    count++;
                if(j < board[i].length - 1 && prev_stage[i][j + 1] == 1)
                    count++;
                if(i > 0 && j > 0 && prev_stage[i - 1][j - 1] == 1)
                    count++;
                if(i > 0 && j < board[i].length - 1 && prev_stage[i - 1][j + 1] == 1)
                    count++;
                if(i < board.length - 1 && j > 0 && prev_stage[i + 1][j - 1] == 1)
                    count++;
                if(i < board.length - 1 && j < board[i].length - 1 && prev_stage[i + 1][j + 1] == 1)
                    count++;
                if(board[i][j] == 1 && count < 2)
                    board[i][j] = 0;
                else if(board[i][j] == 1 && (count == 2 || count == 3))
                    board[i][j] = 1;
                else if(board[i][j] == 1 && count > 3)
                    board[i][j] = 0;
                else if(board[i][j] == 0 && count == 3)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
            }
        }
    }
}