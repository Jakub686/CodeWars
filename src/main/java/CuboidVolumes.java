public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int result = 0;
        int firstCuboidResult = 1;
        int secondCuboidResult = 1;

        for (int i : firstCuboid) {
            firstCuboidResult *= i;
        }

        for (int i : secondCuboid) {
            secondCuboidResult *= i;
        }

        result = firstCuboidResult - secondCuboidResult;

        return result;
    }
}