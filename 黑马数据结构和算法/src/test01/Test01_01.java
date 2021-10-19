package test01;

public class Test01_01 {
    public static void main(String[] args) {
        System.out.println(jiecheng01(10));
        System.out.println(jiecheng02(10));
    }

    //计算阶乘,递归
    public static long jiecheng01(long a){
        if (a == 1){
            return 1;
        }
        return a * jiecheng01(a - 1);
    }
    //计算阶乘，循环
    public static long jiecheng02(long a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
