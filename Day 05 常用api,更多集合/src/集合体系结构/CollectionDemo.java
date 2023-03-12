package 集合体系结构;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("java");
        c.add("se");
        c.add("world");
        c.add("se");
        c.add("world");
//        c.remove("world");  //会删除第一个添加的相同元素
        while(c.remove("world"));  //循环删除c中的“world”
        System.out.println(c);

    }
}
