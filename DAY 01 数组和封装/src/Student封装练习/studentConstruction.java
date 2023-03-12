package Student封装练习;

public class studentConstruction {
    /*构造方法，完成对象数据的初始化,类似于python中的__init__()
    格式：
    修饰符 类名（参数）{
        ......
    }
    * */
    private String name;
    private int age;

    public studentConstruction(String name, int age) {  //构造方法，如果自定义，则系统不再提供默认的构造方法
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name+","+age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }


}

