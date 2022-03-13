public class SortTheOdd {
    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if(array[i]%2!=0){

                    if (array[i] > array[j] & array[j]%2!=0 ) {
                        tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        return array;
    }
}

/*
Array a -> oddArray, evenArray -> sort oddArray
 */
