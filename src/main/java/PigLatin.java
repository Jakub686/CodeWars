public class PigLatin {
    public static String pigIt(String str) {
        System.out.println(str);
        String result = "";
        String[] words = str.split(" ");
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
        wordArray[wordArray.length-1] = wordArray[0];;
        wordArray[0] = " ";
        for(String str : wordArray){
            wordOut += str;
        }
        wordOut +="ay";
        if(wordOut.equals(" !ay")){
            wordOut = " !";
        }
        if(wordOut.equals(" ?ay")){
            wordOut = " ?";
        }
        return wordOut;
    }
}
