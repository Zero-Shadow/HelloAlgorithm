package 排序.归并排序;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] arr = {8,4,5,7,1,3,6,2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
