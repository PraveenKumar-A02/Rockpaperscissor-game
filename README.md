# Rock-Paper-Scissors Game

This repository contains a simple implementation of the classic **Rock-Paper-Scissors** game in Java. The program allows a user to play the game against the computer in an interactive and fun way.

## Features

- User-friendly console interface.
- Visual representation of the chosen options (rock, paper, scissors) using ASCII art.
- Randomized computer choices for fairness.
- Option to replay the game or exit after each round.

## Gameplay Rules

1. Rock beats Scissors.
2. Scissors beat Paper.
3. Paper beats Rock.
4. If both players choose the same, it’s a draw.

## Requirements

- Java Development Kit (JDK) 8 or later.

## How to Run

1. Clone the repository or download the source code:

   ```bash
   git clone https://github.com/PraveenKumar-A02/Rockpaperscissor-game.git
   cd rock-paper-scissors
   ```

2. Compile the program:

   ```bash
   javac RockPaperScissors.java
   ```

3. Run the program:

   ```bash
   java RockPaperScissors
   ```

## Code Overview

The program follows a simple structure:

1. **ASCII Art**: Each choice (rock, paper, scissors) is represented using ASCII art stored in an array.
2. **User Input**: The program prompts the user to input their choice (0 for Rock, 1 for Paper, 2 for Scissors).
3. **Computer Choice**: The computer’s choice is randomly generated.
4. **Game Logic**: The game compares the user’s choice and the computer’s choice to determine the outcome.
5. **Replay Option**: After each round, the user can choose to play again or exit the game.

## Example

### Input:
```
What do you choose? Type 0 for Rock, 1 for Paper, or 2 for Scissors.
0
```

### Output:
```
You chose:
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)

Computer chose:
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)

You lose

Do you want to play again? Type 'yes' to continue or 'no' to exit.
```

## Contributing

Feel free to contribute to this project by forking the repository, making changes, and submitting a pull request. Suggestions and improvements are always welcome!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy coding and have fun playing the game!

