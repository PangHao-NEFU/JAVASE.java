package 类加载器.获取Class类的对象;

public class Student {
    //成员变量,一个私有一个默认一个公共
    private  String name;
    int age;
    public String address;

    //构造方法,一个私有,一个默认,两个公共
    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //成员方法,一个私有,4个公共
    private  void function(){
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String s) {
        System.out.println("method2"+s);
    }

    @Override
    public String toString() {
        return "Student{"+"name='"+name+'\''+
                ",age="+age+
                ",address='"+address+"\'"+"}";
    }
}
