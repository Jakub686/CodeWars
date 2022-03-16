import java.util.ArrayList;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        // 1. kod dzialajacy na string builderze
        boolean result = false;
        for(int i = 0; i <str2.length(); i++){
            if(str1.contains(String.valueOf(str2.charAt(i)))){  // jesli string zawiera
                System.out.println(str1.charAt(i));
                result = true;
                int index = str1.indexOf(str2.charAt(i));
                System.out.println(str1.charAt(index));
                StringBuilder sb = new StringBuilder(str1);
                sb.setCharAt(index, '-'); //replace   indexoff;
                str1 = sb.toString();
                System.out.println(str2);
            }else {
                result = false;
                break;
            }
        }
        return result;
    }

        // 2 dzialajacy kod nad Arraylistach
//    public static void main(String[] args) {
//        String str1 = "world";
//        String str2 = "rkqodlw";
//        boolean result = false;
//        ArrayList<String> arraylist1 = new ArrayList<>();
//        ArrayList<String> arraylist2 = new ArrayList<>();
//
//        for(int i = 0 ; i<str1.length() ; i++){
//            arraylist1.add(Character.toString(str1.charAt(i)));
//        }
//        for(int i = 0 ; i<str2.length() ; i++){
//            arraylist2.add(Character.toString(str2.charAt(i)));
//        }
//        for(int i = 0; i <arraylist1.size(); i++){
//            if(arraylist2.contains(arraylist1.get(i))){
//                System.out.println(arraylist1.get(i));
//                result = true;
//                int index = arraylist2.indexOf(arraylist1.get(i));
//                System.out.println(arraylist2.get(i));
//                System.out.println(index);
//                arraylist2.set(index, "-"); //replace   indexoff
//                System.out.println(arraylist2);
//            }else {
//                result = false;
//                break;
//            }
//        }
//        System.out.println(result);
//    }
}