import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static Scanner input = new Scanner(System.in);

    static int randomGen() {
        return ThreadLocalRandom.current().nextInt(1, 20);
    }

    static String getUserName() {
        System.out.println("What is your name ?");
        return input.nextLine();
    }

    static Integer guessNumber() {
        System.out.println("Guess between 0 and 20");
        return input.nextInt();
    }

    public static boolean feedback(int guess, int realNum) {
        try {
            if (guess < realNum) {
                System.out.println("Too Low");
            } else if (guess > realNum) {
                System.out.println("Too High");
            } else {
                System.out.println("You won");
                return true;
            }

        } catch (Exception exception) {
            exception.toString();
        }
        return false;
    }

    static boolean playAgain() {
        System.out.println("Would you like to play again? (y or n)");
        input.nextLine();
        return isPlayAgain(input.nextLine());
    }

    static boolean isPlayAgain(String answer) {
        try {
            if (answer.startsWith("y")) {
                return true;
            }
        } catch (Exception exception) {
            exception.toString();
        }
        return false;
    }

    public static void main(String[] args) {
        String name = getUserName();
        System.out.println("Hello, " + name);
        int secret = randomGen();

        while (true) {
            if (feedback(guessNumber(), secret)) {
                if (!playAgain()) {
                break;
                }
                secret = randomGen();
            }

        }

    }
}