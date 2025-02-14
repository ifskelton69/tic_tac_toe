# Tic Tac Toe in Java

A simple console-based Tic Tac Toe game implemented in Java. Play against a friend and enjoy this classic game!

## Features

- **2-Player Game**: Play with a friend on the same device.
- **Real-Time Board Updates**: The game board refreshes after each move.
- **Win/Draw Detection**: Automatically checks for a winner or a draw.
- **Simple Interface**: Easy-to-use command-line interface.

## Prerequisites

- Java 8 or higher installed on your machine.

## How to Run

1. **Clone the repository**:
   
         git clone https://github.com/ifskelton69/tic_tac_toe.git
         cd tic_tac_toe

3. **Compile the Java file**:
   
         javac tic_tac_toe.java

5. **Start the game**:
   
         java tic_tac_toe

## Game Instructions

1. **Run the game** and follow the prompts.
2. **Players take turns** entering their moves.
3. **Enter row and column numbers** (0, 1, or 2) when prompted.
4. The game ends when a player wins or the board is full (draw).

Example:
Enter row (0, 1, or 2) for player X: 1
Enter column (0, 1, or 2) for player X: 1
## Code Structure

- **Board Initialization**: A 3x3 grid represented as a 2D `char` array.
- **Game Loop**: Alternates turns between players until a win/draw is detected.
- **Win Checks**: Validates rows, columns, and diagonals for a winning pattern.
- **Draw Check**: Determines if the board is full with no winner.

Key methods:
- `printBoard()`: Displays the current state of the board.
- `checkWin()`: Checks if the current player has won.
- `checkDraw()`: Checks if the game is a draw.

## Possible Improvements

- Add a **GUI** using Swing or JavaFX.
- Implement an **AI opponent** with varying difficulty levels.
- Add **input validation** for non-integer or out-of-bounds inputs.
- Support **network play** for remote multiplayer.

## Contributions

Contributions are welcome! Fork the repository, create a feature branch, and submit a pull request. Please ensure code is well-documented and tested.
