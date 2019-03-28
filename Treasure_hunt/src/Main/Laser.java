package Main;

public class Laser {

    GameBoard gameBoard = new GameBoard();

    //
    public boolean isLaserEnabled(int x, int y) {

        int laserValue = gameBoard.getValueOfPosition(x, y);
        if (laserValue == 5) {
            return true;
        }
        return false;
    }

    public boolean isLaserEnabled() {
        return false;
    }

}
