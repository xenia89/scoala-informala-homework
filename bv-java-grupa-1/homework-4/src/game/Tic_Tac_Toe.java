package game;

public class Tic_Tac_Toe {
    protected char[][]board;
    protected char currentPlayer;
    public Tic_Tac_Toe(){
        board=new char[3][3];
        currentPlayer='x';
        createBoard();
    }
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public void createBoard(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
    }
    public void printBoard(){
        System.out.println("- - - - - - - - - - - - -");
        for (int i=0;i<3;i++){
            System.out.println("|");
            for(int j=0;j<3;j++){
                System.out.println(board[i][j]+"|");
            }
            System.out.println();
            System.out.println("- - - - - - - - - - - - -");
        }
    }
    public boolean checkBoardFull(){
        boolean isFull=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                    isFull=false;
                }
            }
        }
        return isFull;
    }
    public boolean checkWin(){
        return(checkRowsWin()||checkColumnsWin()||checkDiagonalWin());
    }
    public boolean checkRowsWin(){
        for(int i=0;i<3;i++){
            if(checkRowCol(board[i][0],board[i][1],board[i][2])){
                return true;
            }
        }
        return false;
    }
    public boolean checkColumnsWin(){
        for(int i=0;i<3;i++){
            if(checkRowCol(board[0][i],board[1][i],board[2][i])){
                return true;
            }
        }
        return false;
    }
    public boolean checkDiagonalWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) || (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }
    public boolean checkRowCol(char c1,char c2,char c3){
        return((c1!='-')&&(c1==c2)&&(c2==c3));
    }
    public void changePlayer(){
        if (currentPlayer=='x'){
            currentPlayer='0';
        }
        else{
            currentPlayer='x';
        }
    }
    public boolean placeCorrectChar(int row, int col){
        if((row>=0)&&(row<3)){
            if((col>=0)&&(col<3)){
                if(board[row][col]=='-'){
                    board[row][col]=currentPlayer;
                    return true;
                }
            }
        }
        return false;
    }
}
