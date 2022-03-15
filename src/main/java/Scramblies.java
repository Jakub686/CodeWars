import java.util.ArrayList;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean result = false;
        ArrayList<String> arraylist1 = new ArrayList<>();
        ArrayList<String> arraylist2 = new ArrayList<>();

        for(int i = 0 ; i<str2.length() ; i++){
            arraylist1.add(Character.toString(str2.charAt(i)));
        }
        for(int i = 0 ; i<str1.length() ; i++){
            arraylist2.add(Character.toString(str1.charAt(i)));
        }
        for(int i = 0; i <arraylist1.size(); i++){
            if(arraylist2.contains(arraylist1.get(i))){
               //System.out.println(arraylist1.get(i));
                result = true;
                int index = arraylist2.indexOf(arraylist1.get(i));
                //System.out.println(arraylist2.get(i));
                //System.out.println(index);
                arraylist2.set(index, "-"); //replace   indexoff
                //System.out.println(arraylist2);
            }else {
                result = false;
                break;
            }
        }

        return result;
    }
}