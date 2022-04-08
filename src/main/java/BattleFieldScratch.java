public class BattleFieldScratch {
    public static void main(String[] args) {
        int[][] field = {
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}};
        boolean result = true;
        field = setBuffer(field);
        show(field);
        result = diagonal(field);
        show(field);
        result = checkPatterns(field);
        System.out.println(result);
        //return true;
    }

    static void show(int[][] field) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] setBuffer(int[][] battleField) {
        int[][] battleFieldBuffered = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                battleFieldBuffered[i][j] = 0;
            }
        }
        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                battleFieldBuffered[i][j] = battleField[i - 5][j - 5];
            }
        }
        return battleFieldBuffered;
    }
    static boolean diagonal(int[][] field) {
        int pos = 0;
        boolean result = false;
        outer: for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                pos = field[i][j];
                if (pos == 1) {
                    if(field[i - 1][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i + 1][j + 1] == 0 & field[i - 1][j + 1] == 0){
                        result = true;
                    }else {
                    result = false;
                    break outer;
                    }
                }
            }
        }
        return result;
    }
    static boolean checkPatterns(int[][] field) {
        int i=5;
        int j = 5;
        boolean patern1 = field[i - 1][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i + 1][j + 1] == 0 & field[i - 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j] == 0;
        int pos = 0;
        boolean result = false;
        outer: for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                pos = field[i][j];
                if (pos == 1 & patern1 == true ) {
                    if (patern1 == true) {
                        result = true;
                    } else {
                        result = false;
                        break outer;
                    }
                }
//                if(result == false) break outer;
//                if (pos == 1 & field[i+1][j] ==1 & field[i - 1][j - 1] == 0 & field[i - 2][j - 2] == 0 & field[i + 1][j - 1] == 0
//                        & field[i + 2][j - 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 2] == 0 & field[i - 1][j + 1] == 0
//                        & field[i - 2][j + 2] == 0 & field[i + 1][j] == 0 & field[i + 2][j] == 0 & field[i][j + 1] == 0 & field[i][j + 2] == 0
//                        & field[i][j - 1] == 0 & field[i][j - 2] == 0 & field[i - 1][j] == 0 & field[i - 2][j] == 0) {
//                    if (field[i - 1][j - 1] == 0 & field[i - 2][j - 2] == 0 & field[i + 1][j - 1] == 0 & field[i + 2][j - 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 2] == 0 & field[i - 1][j + 1] == 0 & field[i - 2][j + 2] == 0 & field[i + 1][j] == 0 & field[i + 2][j] == 0 & field[i][j + 1] == 0 & field[i][j + 2] == 0 & field[i][j - 1] == 0 & field[i][j - 2] == 0 & field[i - 1][j] == 0 & field[i - 2][j] == 0) {
//                        result = true;
//                    } else {
//                        result = false;
//                        break outer;
//                    }
//                }
            }
        }
        return result;
    }
}
