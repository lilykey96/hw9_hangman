package HangmanGame;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes a general word guess game hangman.
 * @author Xueqi Wang, Weijie Qi
 *
 */
public abstract class Hangman {
	/**
	 * "cleanWords": a String list of available words.
	 */
	private List<String> cleanWords = new ArrayList<>();
	
	/**
	 * "guesses": the times user guesses.
	 */
	private int guesses;
	
	/**
	 * "mistakes": the times user guesses wrong.
	 */
	private int mistakes;
	
	/**
	 * "knowWord": the known part of the word.
	 */
	private String[] knownWord;
	
	/**
	 * "correct": an array of booleans that represents whether the character has been guessed or not.
	 */
	private boolean[] correct;
	
	// Method
	/**
	 * This method reads the file and get the clean words.
	 * @param path
	 * @return words (a String List)
	 */
	public List<String> getCleanWords(String path){
		List<String> words = new ArrayList<>();
		return words;
	}
	
	/**
	 * This method checks whether a word is clean
	 * @param the word to be checked
	 * @return clean (true/false)
	 */
	private boolean isClean(String word) {
		boolean clean;
		return clean;
	}
	
	/**
	 * This method gets the length of the word to guess.
	 * @return length (int)
	 */
	public abstract int getLength() {
		
	}
	
	/**
	 * This method print the known word.
	 */
	void printKnownWord() {
		System.out.println(this.knownWord);
	}
	
	/**
	 * This method returns true when the game is over.
	 * When the user guesses all the characters of the
	 * word, the game is over.
	 * @return over (true/false)
	 */
	boolean isGameOver() {
		boolean over = true;
		
		// check the correct array
		for(int i=0; i<this.correct.length; i++) {
			if(correct[i] == false)
				over = false;
		}
		
		return over;
	}
}
