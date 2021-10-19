package 排序.归并排序;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        long factorial = factorial(10);
        System.out.println(factorial);
    }

    /*
    * 计算n的阶乘，递归调用。
    * */
    public static long factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
