package 排序.希尔排序;

public class Shell {
    /*
    * 对数组a中的元素进行排序。
    * */
    public static void sort(Comparable[] a){
        // 1.确定增长量h的最大值
        int N = a.length;
        int h = 1;
        while (h < N / 2){
            h = h * 2 + 1;
        }

        // 当增长量h小于1时，排序结束
        while (h >= 1){
            // 找到待插入的索引
            for (int i = h;i < N;i++){
                // a[i]就是待插入元素，而a[i-h],a[i-2h]...就是待插入序列
                for (int j = i;j >= h;j -= h){
                    // 排序比较，如果a[i - h]比a[i]大，则交换位置；否则，说明找到合适的插入位置，退出循环。
                    if (greater(a[j - h],a[j])){
                        exch(a, j - h, j);
                    }else {
                        break;
                    }
                }
            }
            // 增长量减半
            h = h / 2;
        }
    }
    /*
    * 比较v元素是否大于w元素。
    * */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w) > 0;
    }
    /*
    * 数组元素i和j交换位置。
    * */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
