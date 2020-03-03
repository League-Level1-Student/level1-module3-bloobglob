package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber=0;
    static int nextNumber = 1;
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = this.nextNumber;
        nextNumber++;
    }

    public static void main(String[] args) {
    	//create 2 new athletes
        Athlete bob = new Athlete("Bob", 10);
        Athlete joe = new Athlete("Joe", 15);
        System.out.println(bob.name + "'s bib number is " + bob.bibNumber + " and the race is at " + bob.raceLocation);
        System.out.println(joe.name + "'s bib number is " + joe.bibNumber + " and the race is at " + joe.raceLocation);
        //print their names, bibNumbers, and the location of their race.
    }
}