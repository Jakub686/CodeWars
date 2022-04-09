public class BattleFieldScratch {
    public static void main(String[] args) {
        int[][] field = {
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        boolean result = true;
        field = setBuffer(field);
        show(field);
        result = checkPatterns(field);
        System.out.println("checkPattern " + checkPatterns(field));
        System.out.println("oneShipCounter " + oneShipCounter(field));
        System.out.println("twoShipCounter " + twoShipCounter(field));
        System.out.println("threeShipCounter " + threeShipCounter(field));
        System.out.println("fourShipCounter " + fourShipCounter(field));

        result = checkPatterns(field) & oneShipCounter(field) & oneShipCounter(field) & twoShipCounter(field) & threeShipCounter(field) & fourShipCounter(field);
        //return result;
    }

    static boolean counter(int[][] field) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                count += field[i][j];
            }
        }
        if (count == 20) {
            return true;
        } else {
            return false;
        }

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
        outer:
        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                pos = field[i][j];
                if (pos == 1) {
                    if (field[i - 1][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i + 1][j + 1] == 0 & field[i - 1][j + 1] == 0) {
                        result = true;
                    } else {
                        result = false;
                        break outer;
                    }
                }
            }
        }
        return result;
    }

    static boolean checkPatterns(int[][] field) {
        boolean finalResult = false;
        int i = 5;
        int j = 5;
        boolean pattern1 = field[i - 1][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i + 1][j + 1] == 0 & field[i - 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j] == 0;
        boolean pattern21 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 2] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0;
        boolean pattern22 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 2][j] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0;
        boolean pattern31 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 3] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0 & field[i - 1][j + 3] == 0 & field[i + 1][j + 3] == 0;
        boolean pattern32 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 3][j] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0;
        boolean pattern41 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i - 1][j + 3] == 0 & field[i - 1][j + 4] == 0 & field[i][j + 4] == 0 & field[i + 1][j + 4] == 0 & field[i + 1][j + 3] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0;
        boolean pattern42 = field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 4][j + 1] == 0 & field[i + 4][j] == 0 & field[i + 4][j - 1] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0;
        int pos = 0;
        boolean result1 = true;
        boolean result21 = true;
        boolean result22 = true;
        boolean result31 = true;
        boolean result32 = true;
        boolean result41 = true;
        boolean result42 = true;
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 0 & field[i - 1][j] == 0 & field[i + 1][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0) {
                    if (field[i - 1][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i + 1][j + 1] == 0 & field[i - 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j] == 0) {
                        result1 = true;
                    } else {
                        result1 = false;
                        break outer;
                    }
                }
            }
        }

        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i][j + 1] == 1 & field[i - 1][j] == 0 & field[i + 1][j] == 0 & field[i][j + 2] == 0 & field[i][j - 1] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 2] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                        result21 = true;
                    } else {
                        result21 = false;
                        break outer;
                    }
                }
            }
        }
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 1 & field[i - 1][j] == 0 & field[i + 2][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 2][j] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                        result22 = true;
                    } else {
                        result22 = false;
                        break outer;
                    }
                }
            }
        }
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j - 1] == 0 & field[i][j] == 1 & field[i][j + 1] == 1 & field[i][j + 2] == 1 & field[i][j + 3] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 3] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0 & field[i - 1][j + 3] == 0 & field[i + 1][j + 3] == 0) {
                        result31 = true;
                    } else {
                        result31 = false;
                        break outer;
                    }
                }
            }
        }
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i - 1][j] == 0 & field[i][j] == 1 & field[i + 1][j] == 1 & field[i + 2][j] == 1 & field[i + 3][j] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 3][j] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                        result32 = true;
                    } else {
                        result32 = false;
                        break outer;
                    }
                }
            }
        }
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j - 1] == 0 & field[i][j] == 1 & field[i][j + 1] == 1 & field[i][j + 2] == 1 & field[i][j + 3] == 1 & field[i][j + 4] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i - 1][j + 3] == 0 & field[i - 1][j + 4] == 0 & field[i][j + 4] == 0 & field[i + 1][j + 4] == 0 & field[i + 1][j + 3] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0) {
                        result41 = true;
                    } else {
                        result41 = false;
                        break outer;
                    }
                }
            }
        }
        outer:
        for (i = 5; i < 15; i++) {
            for (j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 1 & field[i + 2][j] == 1 & field[i + 3][j] == 1 & field[i + 4][j] == 0) {
                    if (field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 4][j + 1] == 0 & field[i + 4][j] == 0 & field[i + 4][j - 1] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                        result42 = true;
                    } else {
                        result42 = false;
                        break outer;
                    }
                }
            }
        }
        finalResult = result1 & result21 & result22 & result31 & result32 & result41 & result42;

        return finalResult;
    }

    static boolean oneShipCounter(int[][] field) {
        boolean result = true;
        int counter = 0;

        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 0 & field[i - 1][j] == 0 & field[i + 1][j] == 0 & field[i][j + 1] == 0 & field[i][j - 1] == 0) {
                    counter++;
                }
            }
        }
        if (counter == 4) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    static boolean twoShipCounter(int[][] field) {
        boolean result = true;
        int counter = 0;

        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i][j + 1] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 2] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                    counter++;
                }
            }
        }
        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 2][j] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                    counter++;
                }
            }
        }
        if (counter == 3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    static boolean threeShipCounter(int[][] field) {
        boolean result = true;
        int counter = 0;

        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i][j + 1] == 1 & field[i][j + 2] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 3] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0 & field[i - 1][j + 3] == 0 & field[i + 1][j + 3] == 0) {
                    counter++;
                }
            }
        }
        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if ((field[i][j] == 1 & field[i + 1][j] == 1 & field[i + 2][j] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 3][j] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0)) {
                    counter++;
                }
            }
        }
        if (counter == 2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    static boolean fourShipCounter(int[][] field) {
        boolean result = true;
        int counter = 0;

        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i][j + 1] == 1 & field[i][j + 2] == 1 & field[i][j + 3] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i - 1][j + 2] == 0 & field[i][j + 4] == 0 & field[i + 1][j + 2] == 0 & field[i + 1][j + 1] == 0 & field[i + 1][j] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0 & field[i - 1][j + 3] == 0 & field[i + 1][j + 3] == 0 & field[i - 1][j + 4] == 0 & field[i + 1][j + 4] == 0) {
                    counter++;
                }
            }
        }
        for (int i = 5; i < 15; i++) {
            for (int j = 5; j < 15; j++) {
                if (field[i][j] == 1 & field[i + 1][j] == 1 & field[i + 2][j] == 1 & field[i + 3][j] == 1 & field[i - 1][j] == 0 & field[i - 1][j + 1] == 0 & field[i][j + 1] == 0 & field[i + 1][j + 1] == 0 & field[i + 2][j + 1] == 0 & field[i + 3][j + 1] == 0 & field[i + 4][j + 1] == 0 & field[i + 4][j] == 0 & field[i + 4][j - 1] == 0 & field[i + 3][j - 1] == 0 & field[i + 2][j - 1] == 0 & field[i + 1][j - 1] == 0 & field[i][j - 1] == 0 & field[i - 1][j - 1] == 0) {
                    counter++;
                }
            }
        }
        if (counter == 1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}