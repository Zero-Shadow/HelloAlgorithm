package test01;

public class Test01_02 {
    public static void main(String[] args) {
        System.out.println(sum01(1, 100));
        System.out.println(sum02(1, 100));
    }
    //计算1到100的和,循环
    public static int sum01(int a, int b){
        int result = 0;
        for (int i = a; i <= b; i++){
            result += i;
        }
        return result;
    }
    //计算1到100的和，等差数列公式
    public static int sum02(int a, int b){
        int result = 0;
        result = (a + b) * (b - a + 1) / 2;
        return result;
    }

}
