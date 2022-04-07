public class BattleField {
    //create buffer
    //check diagonal 1
    //check amount of types ships
    public static boolean fieldValidator(int[][] field) {
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pos = field[i][j];
                if (pos == 1 & field[i - 1][j - 1] != 0 & field[i + 1][j - 1] != 0 & field[i + 1][j + 1] != 0 & field[i - 1][j + 1] != 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                System.out.print(pos);
            }
            System.out.println();
        }
        return true;
    }

    //static boolean validator()
    static int[][] setBuffer(int[][] battleField) {
        int[][] battleFieldBuffered = new int[12][12];
        int pos = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                //if(pos)
            }
        }
        return battleFieldBuffered;
    }
}