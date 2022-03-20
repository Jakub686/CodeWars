public class MiddleExample {
    public static String getMiddle(String word) {
        String result = "";
        StringBuilder sb = new StringBuilder(word);
        int sbLength = sb.length();
        int sbMiddle = sb.length()/2;
        if(sbLength%2==0){
            sb = sb.delete(0,sbMiddle-1).delete(2,sb.length());
        }else {
            sb = sb.delete(0,sbMiddle).delete(1,sb.length());
        }
        result = sb.toString();
        return result;
    }
}
