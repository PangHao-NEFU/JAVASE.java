package 继承;

import javax.naming.Name;

public class father {
    public String name;
    public int age;

    public father() {   //无参构造
    }

    public father(String name, int age) {   //有参构造
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

}
