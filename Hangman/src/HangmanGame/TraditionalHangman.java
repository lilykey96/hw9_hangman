package HangmanGame;

import java.util.Random;

/**
 * This class describes traditional hangman game.
 * Once the word is selected, it will not change.
 * @author Xueqi Wang, Weijie Qi
 */
public class TraditionalHangman extends Hangman {
	
	/**
	 * "word": a randomly selected word for user to guess.
	 */
	private String word;
	
	/**
	 * "incorrectGuesses": a String array that stores all the incorrect guesses.
	 */
	public String[] incorrectGuesses;
	
	// Methods
	/**
	 * This method randomly select a word from CleanWords list.
	 * @return RandomWord (String)
	 */
	String getRandomWord() {
		String RandomWord;
		return RandomWord;
	}
	
	/**
	 * This method gets the length of the word to guess.
	 * @return length (int)
	 */
	public int getLength() {
		
		// get the length of the randomly selected word
		int length = this.word.length();
		
		// initialize the correct array
		this.correct = new boolean[length];
		
		return length;
	}
	
	/**
	 * This method returns true when a character is a correct guess.
	 * This method also updates the correct array.
	 * @param ch
	 * @return match (true/false)
	 */
	public boolean isCorrect(String ch) {
		boolean match;
		return match;
	}
	
	/**
	 * This method shows all the incorrect guesses and add 
	 * last incorrect guess to the incorrectGuesses array.
	 * @param ch
	 */
	void incorrectGuesses(String ch) {
		
	}
}
