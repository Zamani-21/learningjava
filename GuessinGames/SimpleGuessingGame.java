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
                System.out.println("the game guess is " + gameGuess);
                System.out.println("player one is right");

                isAlive = false;
            } else if (gameGuess == playerTwoGuess) {
                System.out.println("the game guess is " + gameGuess);
                System.out.println("player two is right");

                isAlive = false;
            } else if (gameGuess == playerThreeGuess) {
                System.out.println("the game guess is " + gameGuess);
                System.out.println("player three is right");

                isAlive = false;
            }
        }
    }
}
