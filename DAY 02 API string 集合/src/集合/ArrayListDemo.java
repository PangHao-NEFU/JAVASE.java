package 集合;

import java.util.ArrayList;
/*ArrayList的常用方法：
 * add（object o），在末尾添加指定元素
 * add（int index，object o），在指定位置插入元素
 * bool remove（object o），删除指定元素
 * E remove（int index），删除指定索引的元素并返回
 * E set（int index，E element），修改指定索引处的元素，并返回被修改的元素
 * E get（int index），返回指定索引处元素
 * int size（），返回集合中元素个数*/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();  //构造方法
        array.add("hello");                                 //添加方法，在末尾添加
        array.add("world");
        System.out.println(array);
        array.add(1, "JAVASE");                //插入方法，原有的元素向后移动
        System.out.println(array);
        ArrayList<String> array2 = new ArrayList<String>();

    }
}
