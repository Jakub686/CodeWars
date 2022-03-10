public class SquareDigit {

    public int squareDigits(int n) {
        int result = 0;
        int number = n;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        int[] resultArray = new int[temp.length()];
        String[] stringArray = new String[temp.length()];
        String numberString = "";
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        for (int i = 0 ; i<temp.length();i++){
            resultArray[i] = numbers[i]*numbers[i];
        }
        for (int i = 0 ; i<temp.length();i++){
            stringArray[i] = Integer.toString(resultArray[i]);
            numberString += stringArray[i];
        }
        result =  Integer.parseInt(numberString);
        return result;
    }

}