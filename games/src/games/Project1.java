package games;

//importing ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;
// class Project
public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
// prompting user for number of players
       System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        int totalAge = 0;
//looping through the numbers of players
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player's name: ");
            String name = scanner.next();

            System.out.print("Enter player's height in feet: ");
            int feet = scanner.nextInt();
            System.out.print("Enter player's height in inches: ");
            int inches = scanner.nextInt();
            Height height = new Height(feet, inches);

            System.out.print("Enter player's age: ");
            int age = scanner.nextInt();
            totalAge += age;
// adding players
            players.add(new Player(name, height, age));
        }
// average method calculation
        double averageAge = (double) totalAge / numPlayers;
        System.out.println("Average age of players: " + averageAge);

        Player tallestPlayer = null;
        int maxHeight = 0;

        for (Player player : players) {
            if (player.getAge() <= averageAge && player.getHeight().toInches() > maxHeight) {
                tallestPlayer = player;
                maxHeight = player.getHeight().toInches();
            }
        }

        System.out.println("Tallest player whose age is less than or equal to the average: ");
        if (tallestPlayer != null) {
            System.out.println(tallestPlayer);
        } else {
            System.out.println("No suitable player found.");
        }
    }
}
