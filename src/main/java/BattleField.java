public class BattleField {
    //create buffer +
    //check diagonal 1 -> ship paterns
    //patern counters
    public static boolean fieldValidator(int[][] field) {
        System.out.println();
        boolean result = true;
        field = setBuffer(field);
        showFilled(field);
        result = diagonal(field) & amountOfShips(field);
        //System.out.println(result);
        return true;
    }

    static void showFilled(int[][] field) {
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
    static boolean amountOfShips(int[][] field){
        boolean result = false;
        int amount = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                amount = field[i][j];
            }
        }
        if(amount == 20){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}