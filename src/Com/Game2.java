package Com;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;

	public int getNoOfGuesses() {
		return noOfGuesses;
	}

	public void setNoOfGuesses(int noOfGuesses) {

		this.noOfGuesses = noOfGuesses;
	}

	Game2() {
		Random rand = new Random();
		this.number = rand.nextInt(100);

	}

	void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean isCorrectNumber() {
		noOfGuesses++;
		if (inputNumber == number) {
			System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts", number,
					noOfGuesses);
			return true;
		} else if (inputNumber < number) {
			System.out.println("Too low.....");
		} else if (inputNumber > number) {
			System.out.println("Too high...");
		}
		return false;
	}

	public static void main(String[] args) {
		Game2 g = new Game2();
		boolean b = false;
		while (!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
		}

	}

}
