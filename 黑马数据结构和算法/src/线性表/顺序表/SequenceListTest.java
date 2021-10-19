package 线性表.顺序表;

//顺序表测试类
public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<String>(10);
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1,"詹姆斯");
        //测试获取
        String getResult = sl.get(1);
        System.out.println("索引1处的元素为：" + getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是：" + removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后顺序表中元素个数为:" + sl.length());

    }
}
