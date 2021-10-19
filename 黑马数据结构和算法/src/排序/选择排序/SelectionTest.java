package 排序.选择排序;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] array = {3,4,2,1,6,5};
        Selection.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
