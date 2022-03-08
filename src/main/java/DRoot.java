public class DRoot {
    public static int digital_root(int n) {
        int result = getResult(n);
        if (result > 9) {
            result = getResult(getResult(n));
        }

        if (result > 9) {
            result = getResult(getResult(getResult(n)));
        }

        return result;
    }

    private static int getResult(int number) {
        int result = 0;
        String temp = Integer.toString(number);
        int[] newNumber = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newNumber[i] = temp.charAt(i) - '0';  // skad to - '0' ?
        }
        for (int i = 0; i < newNumber.length; i++) {
            result += newNumber[i];
        }
        return result;
    }
}