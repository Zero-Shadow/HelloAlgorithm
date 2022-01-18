package Heap;

public class Heap<T extends Comparable<T>> {
    //记录堆中元素的个数
    private int N;
    //用来存储元素的数组
    private T[] items;
    //创建容量为capacity的Hea对象
    public Heap(int capacity) {
        this.items = (T[]) new Comparable[capacity];
        this.N = 0;
    }

    //判断堆中索引i处的元素是否小于索引j处的值
    private boolean less(int i,int j){
        return items[i].compareTo(items[j]) < 0;
    }
    //交换堆中索引i处和索引j处的值
    private void exch(int i,int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
    //删除堆中最大的元素，并返回这个最大元素
    public T delMax(){
        T max = items[1];
        //将最后一个元素放置到根节点
        items[1] = items[N];
        items[N] = null;
        N--;
        seek(1);
        return max;
    }
    //往堆中插入一个元素
    public void insert(T t){
        items[++N] = t;
        swim(N);
    }
    //使用上浮算法，使得索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k){
        while (k/2 >= 1){
            if (less(k/2,k)){
                exch(k,k/2);
            }else {
                break;
            }
            k = k/2;
        }
    }
    //使用下沉算法，使得索引k处的元素能在堆中处于一个正确的位置
    private void seek(int k){
        while (k * 2 <= N){
            int max;
            if (k * 2 + 1 <= N){
                if (less(k * 2,k * 2 + 1)){
                    max = k * 2 + 1;
                }else {
                    max = k * 2;
                }
            }else {
                max = k * 2;
            }

            if (less(k,max)){
                exch(k,max);
            }else {
                break;
            }
            k = max;
        }
    }
}
