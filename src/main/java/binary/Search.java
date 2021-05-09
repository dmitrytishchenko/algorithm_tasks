package binary;

import java.util.Arrays;

public class Search {

    public int foundValueByArray(int[] array, int value) {
        int[] sortArray = sorting(array);
        int start = 0;
        int finish = sortArray.length - 1;
        while (start <= finish) {
            int middle = (start + finish) / 2;
            if (sortArray[middle] == value) {
                System.out.println("Value is search " + middle);
                return middle;
            } else if (sortArray[middle] < value) {
                start = middle + 1;
            } else {
                finish = middle - 1;
            }
        }
        return -1;
    }

    public int[] sorting(int[] array) {
        Arrays.sort(array);
        System.out.println("Array sorted");
        return array;
    }
}
