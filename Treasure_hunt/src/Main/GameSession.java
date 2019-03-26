package Main;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GameSession extends JFrame implements Runnable, KeyListener {

	private Thread newThread;
	public GameBoard gameBoard = new GameBoard();
	public boolean gameOver = false;
	public JFrame frame = new JFrame("Treasure hunt");
	public JTextArea text;

	public GameSession() {
		frame.setLayout(null);
		frame.setSize(600,620);
		frame.setLocation(100,50);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		text = new JTextArea();
		text.addKeyListener(this);

		text.setBounds(20, 20, 600, 550);
		text.setFont(new Font("Arial", Font.PLAIN, 24));
		frame.add(text);
		frame.setVisible(true);

		//Skapar en ny tråd
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

	public void run() {
		while(!gameOver)
		{
			text.setText("");
			text = gameBoard.print(text);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new GameSession();
	}
}
