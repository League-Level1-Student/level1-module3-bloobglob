package _05_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		Movie jumanji = new Movie("Jumanji: The Next Level", 5);
		Movie alita = new Movie("Alita: Battle Angel", 7);
		Movie hobbesAndShaw = new Movie("Hobbes and Shaw", 10);
		Movie endgame = new Movie("Avengers: Endgame", 20);
		System.out.println(jumanji.getTicketPrice());
	}
}
