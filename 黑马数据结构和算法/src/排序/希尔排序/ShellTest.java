package 排序.希尔排序;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] array = {1,3,2,4,6,5,7,8,9,0};
        Shell.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
