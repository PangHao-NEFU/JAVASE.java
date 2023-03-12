package Student封装练习;

public class FengZhuang {
    private int age;
    private String name;
    //需要提供get和set方法来对private成员进行改动
    public void setAge(int age) {
        if(age>=0&&age<120){
            this.age = age;     //this关键字用于处理成员变量和方法形参的命名冲突
        }else{                  //this修饰的变量是成员变量
            System.out.println("年龄输入错误！");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
