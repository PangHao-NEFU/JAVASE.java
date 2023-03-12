package 集合体系结构.HashSet;

import java.util.Comparator;

public class Wife implements Comparable<Wife> {
    private  String name;
    private int age;

    public Wife() {
    }

    public Wife(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {   //重写判断两对象的equals方法
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wife wife = (Wife) o;

        if (age != wife.age) return false;
        return name != null ? name.equals(wife.name) : wife.name == null;
    }

    @Override
    public int hashCode() {     //哈希函数
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Wife o) {  //年龄从小到大，如果重复则按字母顺序排序
        int num=this.age-o.age;     //this表示当前添加元素，o表示上一元素

        return num == 0?this.name.compareTo(o.name):num;
    }
}
