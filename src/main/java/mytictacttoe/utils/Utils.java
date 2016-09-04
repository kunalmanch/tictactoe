package mytictacttoe.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kmishra on 9/1/2016.
 */
public class Utils {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getUserInput() {
        String input = "" ;
        try {
            input = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return input;
    }
}
