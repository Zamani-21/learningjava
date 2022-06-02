public class SimpleGuessingGame {
    int gameGuess;
    Player playerOne;
    Player playerTwo;
    Player playerThree;

    public void playSimpleGuessingGame() {
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();
        int playerOneGuess = 0;
        int playerTwoGuess = 0;
        int playerThreeGuess = 0;
        boolean isAlive = true;
        boolean playerOneIsRight = false;
        boolean playerTwoIsRight = false;
        boolean playerThreeIsRight = false;

        gameGuess = (int) (Math.random() * 10);
        System.out.println("the game guess is " + gameGuess);
        while (isAlive) {
            playerOneGuess = playerOne.playerGuess();
            System.out.println("player one is guessing " + playerOneGuess);

            playerTwoGuess = playerTwo.playerGuess();
            System.out.println("player two is guessing " + playerTwoGuess);

            playerThreeGuess = playerThree.playerGuess();
            System.out.println("player three is guessing " + playerThreeGuess);

            if (gameGuess == playerOneGuess) {
                playerOneIsRight = true;

            }
            if (gameGuess == playerTwoGuess) {
                playerTwoIsRight = true;

            }
            if (gameGuess == playerThreeGuess) {
                playerThreeIsRight = true;

            }
            if (playerOneIsRight || playerTwoIsRight || playerThreeIsRight) {
                System.out.println("player one is right? " + playerOneIsRight);
                System.out.println("player two is right? " + playerTwoIsRight);
                System.out.println("player three is right? " + playerThreeIsRight);
                break;
            } else {
                System.out.println("all players are wrong! Try again");
                System.out.println();
            }
        }
    }
}
