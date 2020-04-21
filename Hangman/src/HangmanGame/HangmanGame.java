package HangmanGame;

import java.util.Random;

public class HangmanGame {
	
	/**
	 * "mode": true means traditionalHangman, false means evilHangman.
	 */
	private boolean mode;
	
	HangmanGame(){
		Random r = new Random();
		// randomly select the mode of hangman game
		this.mode = r.nextBoolean();
	}
	
	public static void main(String[] args) {
		
	}
	
}
