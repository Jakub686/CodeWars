public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;

        for (int i = 0 ; i<str.length() ; i++){
            char charat = str.charAt(i);
            if(charat == 'a' || charat == 'e' || charat == 'i' || charat == 'o' || charat == 'u'){
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);

        return vowelsCount;
    }

}