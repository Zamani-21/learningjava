public class SimpleGuessingGame {
    int gameGuess;
    Player playerOne;
    Player playerTwo;
    Player playerThree;

    public void playSimpleGuessingGame() {
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();

        boolean isAlive = true;

        gameGuess = (int) (Math.random() * 10);

    }

}
