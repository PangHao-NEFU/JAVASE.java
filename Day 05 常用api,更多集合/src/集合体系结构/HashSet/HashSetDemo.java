package 集合体系结构.HashSet;

import java.util.HashSet;

/*需求：创建一个存储对象的集合，存储三个老婆对象，遍历该集合
* 要求：老婆对象的成员变量值相同，我们就认为是同一个对象
* */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Wife> hs = new HashSet<Wife>();

        Wife wife1 = new Wife("朴孝敏", 33);
        Wife wife2 = new Wife("咸恩静", 34);
        Wife wife3 = new Wife("朴智妍", 30);   //3和4要视为同一个对象
        Wife wife4 = new Wife("朴智妍", 30);   //需要重写hasCode和equals方法

        hs.add(wife2);
        hs.add(wife3);
        hs.add(wife1);
        hs.add(wife4);

        for (Wife w : hs) {
            System.out.println(w.getAge()+","+w.getName());
        }
    }

}
