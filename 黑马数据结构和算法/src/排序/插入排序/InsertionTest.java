package 排序.插入排序;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] array = {1,4,2,3,6,5};
        Insertion.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
