package 排序.冒泡排序;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] array = {3,4,2,5,6,1};
        Bubble.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
