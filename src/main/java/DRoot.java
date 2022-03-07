public class DRoot {
    public static int digital_root(int n) {

        int result = 0;
        String temp = Integer.toString(n);
        int[] newNumber = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newNumber[i] = temp.charAt(i) - '0';  // skad to - '0' ?
        }
        for (int i = 0; i < newNumber.length; i++) {
            result += newNumber[i];
        }

        int result1 = 0;
        if(result>9){
            String temp1 = Integer.toString(result);
            int[] newNumber1 = new int[temp1.length()];
            for (int i = 0; i < temp1.length(); i++) {
                newNumber1[i] = temp1.charAt(i) - '0';  // skad to - '0' ?
            }
            for (int i = 0; i < newNumber1.length; i++) {
                result1 += newNumber1[i];
            }
        }
        int a = 0;
        if(result<10){
            a = result;
        }else {
            a = result1;
        }

        return  a;
    }
}