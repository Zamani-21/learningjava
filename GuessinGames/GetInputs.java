import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputs {
    String inputLine;

    public String getUserInputString(String prompt) {
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
        return inputLine;

    }
}
