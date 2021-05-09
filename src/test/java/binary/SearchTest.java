package binary;

import org.junit.Assert;
import org.junit.Test;


public class SearchTest {

    @Test
    public void whenInArrayFindCount5() {
        int[] mas = new int[]{3, 4, 1, 33, 93, 6, 88, 5};
        int val = 5;
        Search search = new Search();
        int result = search.foundValueByArray(mas, val);
        Assert.assertSame(result, 3);
    }

    @Test
    public void whenInArrayFindCountIsNotExist() {
        int[] mas = new int[]{3, 4, 1, 33, 93, 6, 88, 5};
        int val = 2;
        Search search = new Search();
        int result = search.foundValueByArray(mas, val);
        Assert.assertSame(result, -1);
    }

    @Test
    public void whenArraySort() {
        int[] mas = new int[]{3, 4, 1, 33, 93, 6, 88, 5};
        int[] expected = new int[]{1, 3, 4, 5, 6, 33, 88, 93};
        Search search = new Search();
        int[] result = search.sorting(mas);
        Assert.assertArrayEquals(result, expected);
    }
}