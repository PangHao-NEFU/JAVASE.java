package Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

/*练习说明:
* 有两个ArrayList集合,分别存储6个男人和女人的名称,要求完成如下操作
*   男人只要名字为3个字的前三个人
*   女人只要姓林的,而且不要第一个
*   把过滤后的男人和女人姓名合并到一起
*   把上一步操作后的元素作为构造方法的参数创建人的对象,遍历数据
*       人的类Human已经提供,有一个成员变量,一个带参构造,以及成员变量对应get和set方法*/
public class Stream流的练习 {
    public static void main(String[] args) {
        ArrayList<String> manList=new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德虎");
        manList.add("武警");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList=new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");


        Stream<String> new_man = manList.stream().filter(s -> s.length() == 3).limit(3);

        Stream<String> new_woman = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> concat = Stream.concat(new_man, new_woman);
        concat.map(s -> new Human(s)).forEach(human-> System.out.println(human.getName()));
    }


}
