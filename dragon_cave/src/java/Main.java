import java.util.Scanner;

public class Main {
    public String chooseCave(int choice) {
        if (choice == 1) {
            return "You have found some treasure...";
        } else if (choice == 2) {
            return "You were eaten instantly...";
        }
        return "Loser...";
    }

    public static void main(String[] args) {
        System.out.println("BEHOLD! You are in a land full of dragons!");
        System.out.println("In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and" +
                " will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry " +
                "and will eat you on sight.");
        System.out.print("Which cave will you go into? 1 or 2");
        Scanner userInput = new Scanner(System.in);
        try {
            int input = userInput.nextInt();
            System.out.println(new Main().chooseCave(input));
        } catch (Exception exception) {
            exception.toString();
        }
    }
}