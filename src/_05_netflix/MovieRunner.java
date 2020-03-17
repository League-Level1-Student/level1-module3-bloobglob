package _05_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		Movie jumanji = new Movie("Jumanji: The Next Level", 5);
		Movie alita = new Movie("Alita: Battle Angel", 7);
		Movie hobbesAndShaw = new Movie("Hobbes and Shaw", 10);
		Movie endgame = new Movie("Avengers: Endgame", 20);
		Movie avatar = new Movie("Avatar", 12);
		System.out.println(jumanji.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(avatar);
		netflix.addMovie(endgame);
		netflix.addMovie(hobbesAndShaw);
		netflix.addMovie(alita);
		netflix.addMovie(jumanji);
		netflix.printMovies();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(2));
	}
}
