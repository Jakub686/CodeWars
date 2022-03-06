import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static int century(int number) {
        int num = 0;
        if(number % 100 != 0){
            num = (number / 100) + 1;
        } else{
            num = (number / 100);
        }
        return num;
    }
}