package Main;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GameSession extends JFrame implements Runnable, KeyListener {

	private Thread newThread;
	public GameBoard gameBoard = new GameBoard();
	public boolean gameOver = false;
	public boolean gameWon = false;
    public static boolean timeOut = false;
    public boolean youWon = false;
    public int numberOfFoundTreasures = 0;
    public int totalNumberOfTreasureOnBoard = gameBoard.numberOfCurrentTreasureOnBoard();
	public JFrame frame = new JFrame("Treasure hunt");
	public JTextArea text;
	public JLabel tCounter;

	public GameSession() {
		frame.setLayout(null);
		frame.setSize(600,650);
		frame.setLocation(100,50);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		text = new JTextArea();
		text.addKeyListener(this);
		text.setBounds(20, 20, 550, 550);
		text.setFont(new Font("Arial", Font.PLAIN, 24));
		frame.add(text);
		tCounter = new JLabel();
		tCounter.setBounds(20, 560, 200, 60);
		tCounter.setText("Number of treasures found: "+numberOfFoundTreasures+"/"+totalNumberOfTreasureOnBoard);
		frame.add(tCounter);
		frame.setVisible(true);

		//Skapar en ny tr�d
		newThread = new Thread(this);
		newThread.start();
	}

    public void keyTyped(KeyEvent e) {
        char detectedChar = e.getKeyChar();
        detectedChar = Character.toLowerCase(detectedChar);
        switch (detectedChar) {
            case 'w':
				gameBoard.playerWantToMoveUp();
                break;
            case 'a':
                gameBoard.playerWantToMoveLeft();
                break;
            case 's':
				gameBoard.playerWantToMoveDown();
				break;
            case 'd':
				gameBoard.playerWantToMoveRight();
                break;
            default:
                // Do nothing
        }
    }

	public void keyReleased(KeyEvent e) {

	}

    public void keyPressed(KeyEvent e) {

	}

	public static boolean GetTimout(){
		return timeOut;
	}

	//Call this method for Timeout in case of Laser or Finding Tresure
	public static boolean SetTimeout(){
		timeOut=true ;
		return timeOut;
	}
	
	public int remainingTreasure() {
		return totalNumberOfTreasureOnBoard-gameBoard.numberOfCurrentTreasureOnBoard();
	}

	public void run() {
		gameBoard.disableDoor(8, 29);
		while(!gameOver() && !gameWon())
		{
			text.setText("");
			text = gameBoard.print(text);
			tCounter.setText("Number of treasures found: "+remainingTreasure()+"/"+totalNumberOfTreasureOnBoard);
			gameBoard.checkToOpenDoor(0);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(gameWon()){
			text.setText("You won! Congratulations!");
		}
		if(gameOver()){
			text.setText("Game over!");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new GameSession();
	}
	private boolean gameOver(){
	    this.gameOver=gameBoard.gameBoardGameOver;
	    return gameOver;
    }
    private boolean gameWon(){
		this.gameWon=gameBoard.gameBoardGameWon;
		return gameWon;

	}
}