import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputs {
    int inputLine;
    boolean isAlive = true;

    public int getUserInputString(String prompt) {

        while (isAlive) {
            System.out.println(prompt + " ");
            try {
                BufferedReader is = new BufferedReader(
                        new InputStreamReader(System.in));
                inputLine = Integer.parseInt(is.readLine());
            } catch (IOException e) {
                System.out.println("IOException " + e);
            }
            if ((inputLine >= 0) && (inputLine <= 9)) {
                break;

            } else {
                getUserInputString("invalid input! " + " " + prompt);
            }
        }

        return inputLine;
    }
}
