package Main;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GameSession extends JFrame implements Runnable {
	
	private Thread newThread;
	public GameBoard gameBoard = new GameBoard();
	boolean gameOver = false;
	public JFrame frame = new JFrame("Treasure hunt");
	public JTextArea text;

	public GameSession() {
		frame.setLayout(null);
		frame.setSize(460,620);
		frame.setLocation(100,50);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		text = new JTextArea();
		text.setBounds(20, 20, 400, 550);
		text.setFont(new Font("Arial", Font.PLAIN, 24));
		frame.add(text);
		frame.setVisible(true);
		
		//Skapar en ny tr�d
		newThread = new Thread(this);
		newThread.start();
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
