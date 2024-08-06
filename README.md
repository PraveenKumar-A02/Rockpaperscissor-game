Rock, Paper, Scissors Game
This is a simple implementation of the classic Rock, Paper, Scissors game using Python. The game allows a user to play against the computer and displays the results of the game in a text-based format.

Features:
--> Play Rock, Paper, Scissors against the computer.
--> The computer makes a random choice from Rock, Paper, or Scissors.
--> The game displays the user's and computer's choices in ASCII art.
--> The game determines the winner and displays the result.

Game Rules:
 * Rock crushes Scissors.
 * Scissors cuts Paper.
 * Paper covers Rock.

Usage
To play the game:

 * Clone or download the repository.
 * Run the Python script rock_paper_scissors.py.

 ----- " python rock_paper_scissors.py " -----

  * Follow the on-screen prompt to choose Rock, Paper, or Scissors by typing 0, 1, or 2 respectively.

Code Explanation
1. Importing Libraries
 --> random is used to make a random choice for the computer.
   
3. ASCII Art
 --> rock, paper, and scissors are variables containing ASCII art representations of the choices.
   
3. User Input
 --> The user is prompted to enter their choice, and input is validated to ensure it's within the allowed range (0 to 2).
   
5. Computer Choice
 --> The computer makes a random choice between Rock, Paper, and Scissors.
   
5. Result Determination
 --> The script compares the user's choice and the computer's choice to determine the winner and prints the result.


Example:

![Screenshot 2024-08-06 192916](https://github.com/user-attachments/assets/75cb1ae6-b377-417d-9196-8b15b8a1ae89)


What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors.
1
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)

Computer chose:
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)

You lose




License
This project is licensed under the MIT License - see the LICENSE file for details.
