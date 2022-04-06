public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        for(int i=0; i< sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        boolean result = true;
        for (int i = 0; i < 9; i++) {
            int[] tempArray = new int[9]; // validator row
            for (int j = 0; j < 9; j++) {
                tempArray[j] = sudoku[i][j];
            }
            if (validator(tempArray) == true) {
                result = true;

            } else {
                result = false;
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            int[] tempArray = new int[9]; // validator column
            for (int j = 0; j < 9; j++) {
                tempArray[j] = sudoku[j][i];
            }
            if (validator(tempArray) == true) {
                result = true;

            } else {
                result = false;
                break;
            }
        }

        for(int k = 0 ; k<9 ; k++) {
            int[] tempArray = new int[9]; // validator box 1/9
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tempArray[k] = sudoku[j][i];
                }
                if (validator(tempArray) == true) {
                    result = true;

                } else {
                    result = false;
                    break;
                }
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
        if (sudokuString.contains("1") & sudokuString.contains("2") & sudokuString.contains("3") & sudokuString.contains("4") & sudokuString.contains("5") & sudokuString.contains("6") & sudokuString.contains("7") & sudokuString.contains("8") & sudokuString.contains("9") & !sudokuString.contains("0")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
