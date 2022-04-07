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
        boolean resultRow = true;
        boolean resultColumn = true;
        boolean resultBox = true;
        int[] tempArray = new int[9]; // validator row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tempArray[j] = sudoku[i][j];
            }
            if (validator(tempArray) == true) {
                resultRow = true;
            } else {
                result = false;
                break;
            }

        }
        tempArrayEraser(tempArray);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tempArray[j] = sudoku[j][i];
            }
            if (validator(tempArray) == true) {
                resultColumn = true;
            } else {
                resultColumn = false;
                break;
            }
        }
        tempArrayEraser(tempArray);

        // validator box 1/9
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempArray[k] = sudoku[i][j];
                k++;
                if(k>=9) break;

            }
        }
        if (validator(tempArray) == true) {
            resultBox = true;

        } else {
            resultBox = false;

        }
        result = resultRow & resultColumn & resultBox;

        return result;
    }

    private static void tempArrayEraser(int[] tempArray) {
        for(int i = 0 ; i<9 ; i++){
            tempArray[i] =0;
        }
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