public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "";
        for(int i : numbers){
            phoneNumber += i;
        }
        StringBuilder stb = new StringBuilder(phoneNumber);
        stb.insert(0,"(").insert(4,")").insert(5," ").insert(9,"-");
        stb.toString();
        phoneNumber = stb.toString();;
        return phoneNumber;
    }
}