import java.util.Locale;

public class PangramChecker {
    public boolean check(String sentence){
        String[] charsArray = new String[] {"a", "b","c", "d", "e", "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        boolean result = false;
        for(String s : charsArray){
            if(sentence.toLowerCase(Locale.ROOT).contains(s)){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        return result;
    }
}