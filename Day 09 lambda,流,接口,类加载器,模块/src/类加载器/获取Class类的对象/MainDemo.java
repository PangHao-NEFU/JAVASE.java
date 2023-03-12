package 类加载器.获取Class类的对象;

public class MainDemo {
    public static void main(String[] args) {
        Class<Student> cs = Student.class;
        System.out.println(cs);
    }
}
