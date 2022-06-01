public class Player {
    int playerGuessor;

    public int playerGuess() {
        GetInputs input = (new GetInputs());
        playerGuessor = Integer.parseInt(input.getUserInputString("enter an integer between 0 and 9"));
        System.out.println("I am guessing " + playerGuessor);
        return playerGuessor;
    }
}
