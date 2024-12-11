import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] gameImages = {
                "    _______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)",
                "    _______\n---'   ____)____\n          ______)\n          _______)\n         _______)\n---.__________)",
                "    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.println("What do you choose? Type 0 for Rock, 1 for Paper, or 2 for Scissors.");
            int userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice >= 3) {
                System.out.println("You typed an invalid number, you lose!");
            } else {
                System.out.println("You chose:");
                System.out.println(gameImages[userChoice]);

                int computerChoice = random.nextInt(3);
                System.out.println("Computer chose:");
                System.out.println(gameImages[computerChoice]);

                if (userChoice == 0 && computerChoice == 2) {
                    System.out.println("You win!");
                } else if (computerChoice == 0 && userChoice == 2) {
                    System.out.println("You lose");
                } else if (computerChoice > userChoice) {
                    System.out.println("You lose");
                } else if (userChoice > computerChoice) {
                    System.out.println("You win!");
                } else {
                    System.out.println("It's a draw");
                }
            }

            System.out.println("\nDo you want to play again? Type 'yes' to continue or 'no' to exit.");
            String userResponse = scanner.next().toLowerCase();
            if (!userResponse.equals("yes")) {
                keepPlaying = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }

        scanner.close();
    }
}


//@GitHub PraveenKumar-A02
