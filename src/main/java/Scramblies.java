public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean result = false;
        for(int i = 0; i <str1.length(); i++){


            if(str2.contains(Character.toString(str1.charAt(i)))){
                result = true;
                str2 = str2.replace(Character.toString(str1.charAt(i))," ");
                //System.out.println(str1 + "  -  " + str2);

            }else {
                result = false;
                break;
            }
        }

        return result;
    }
}