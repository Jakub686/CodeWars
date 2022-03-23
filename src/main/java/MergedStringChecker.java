import java.util.ArrayList;

public class MergedStringChecker {

    public static boolean isMerge(String s, String part1, String part2) {
//        String s = "codewars";
//        String part1 = "wars";
//        String part2 = "code";
        System.out.println("S = " + s);
        System.out.println("part1 = " + part1);
        System.out.println("part2 = " + part2);

        String str = part1 + part2;
        boolean result = false;
        ArrayList<String> arraylist1 = new ArrayList<>();
        ArrayList<String> arraylist2 = new ArrayList<>();

        for(int i = 0; i< s.length() ; i++){
            arraylist1.add(Character.toString(s.charAt(i)));
        }
        for(int i = 0; i< str.length() ; i++){
            arraylist2.add(Character.toString(str.charAt(i)));
        }
        for(int i = 0; i <arraylist1.size(); i++){
            if(arraylist2.contains(arraylist1.get(i))){
                System.out.println(arraylist1.get(i));
                result = true;
                int index = arraylist2.indexOf(arraylist1.get(i));

                arraylist2.set(index, "-"); //replace   indexoff
                System.out.println(arraylist2);
            }else {
                result = false;
                break;
            }
        }
        return result;
    }
}