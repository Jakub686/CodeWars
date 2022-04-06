public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        boolean result = true;
        for(int i = 0; i <sudoku[0].length; i++){
            if(validator(sudoku[i])==true){
                result = true;
                System.out.println("true");
            }else {
                result = false;
            }
        }
        return result;
    }

    static boolean validator(int[] sudoku) {
        boolean result = true;
        String sudokuString = "";
        for (int i = 0; i < sudoku.length; i++) {
            sudokuString += String.valueOf(sudoku[i]);
        }

        if (sudokuString.contains("1") && sudokuString.contains("2") && sudokuString.contains("3") && sudokuString.contains("4") && sudokuString.contains("5") && sudokuString.contains("6") && sudokuString.contains("7") && sudokuString.contains("8") && sudokuString.contains("9") && !sudokuString.contains("0")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
