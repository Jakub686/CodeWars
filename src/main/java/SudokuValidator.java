public class SudokuValidator {
    public static boolean check(int[][] sudoku) {

        return false;
    }
    boolean validator(String[] a){
        String numbers = "123456789";
        String sudokuString = "";

        for(int i = 0 ; i< a.length ; i++){
            sudokuString += String.valueOf(a[i]);
        }
        for(int i = 0; i <sudokuString.length(); i++) {
            if (sudokuString.contains(String.valueOf(numbers.charAt(i)))) {  // jesli string zawiera
                int index = numbers.indexOf(sudokuString.charAt(i));
                StringBuilder sb = new StringBuilder(numbers);
                sb.setCharAt(index, '-'); //replace   indexoff;
                numbers = sb.toString();
                System.out.println(numbers);
            }else{
                System.out.println(false);
                break;
            }
        }

        return false;
    }
}
