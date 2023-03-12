package Student封装练习;

public class StudentDemo {
    public static void main(String[] args) {
        studentConstruction stud = new studentConstruction("张三",18);
        stud.show();
        stud.setName("李四");
        stud.setAge(27);
        stud.show();
        studentConstruction stud2 = new studentConstruction(null,23);
        stud2.show();
    }
}
