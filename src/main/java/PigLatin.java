public class PigLatin {
    public static String pigIt(String str) {
        //String str = "Pig latin is cool";
        String result = "";
        String[] words = str.split(" ");
        for (String s : words) {
            System.out.println(s);
        }
        for (int i = 0; i < words.length; i++) {
            result += moveLetter(words[i]);

        }
        result = result.trim();
        System.out.println(result);

        return result;
    }
    static String moveLetter(String wordIn){
        String wordOut = "";
        String[] wordArray = new String[wordIn.length()+1];
        for(int i = 0; i<wordIn.length(); i++){
            wordArray[i] = Character.toString(wordIn.charAt(i));
        }

        //String temp = wordArray[0];
        //String last = wordArray[wordArray.length-1];
        wordArray[wordArray.length-1] = wordArray[0];;
        wordArray[0] = " ";

        for(String str : wordArray){
            wordOut += str;
        }
        wordOut +="ay";
        return wordOut;
    }

}
