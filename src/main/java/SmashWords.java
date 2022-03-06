import java.util.Arrays;

public class SmashWords {
    public static String smash(String... words) {
        String word = null;
        for (String i : words) {
            word += i + " ";
        }
        return word.trim();
    }
}