package Main;

public class Player {
    int row;
    int col;

    public Player() {
        row = 2;
        col = 1;
    }

    public boolean movePlayerLeft(int potentialTargetLocationInt) {
        if (potentialTargetLocationInt == 1) {
            //Player is not allowed to to navigate into a wall
            return false;
        } else {
            col--;
            return true;
        }
    }

    public int getPlayerColNumber() {
        return col;
    }

    public int getPlayerRowNumber() {
        return row;
    }
    public void setPlayerPosition(int row, int col){
        this.row=row;
        this.col=col;
    }
}
