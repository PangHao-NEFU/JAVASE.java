package Collections.ArrayList存储学生对象并排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*ArrayList存储学生对象，使用Collections对其进行排序
* 要求按照年龄从小到大排序，年龄相同时按照姓名的字母顺序排序
* */
public class demo {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student student1 = new Student("Jiyeon", 30);
        Student student2 = new Student("Eunjung", 34);
        Student student3 = new Student("Jisoo", 25);
        Student student4 = new Student("Miyeon", 25);
        Student student5 = new Student("Gyuri", 34);
        Student student6 = new Student("Taeyeon", 33);

        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        arr.add(student4);
        arr.add(student5);
        arr.add(student6);
//        Collections.sort(arr, (o1, o2) -> {
//            int num1= o1.getAge()-o2.getAge();
//            int num2= num1==0?o1.getName().compareTo(o2.getName()):num1;
//            return num2;
//        });   //lambda表达式
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1= o1.getAge()-o2.getAge();
                int num2= num1==0?o1.getName().compareTo(o2.getName()):num1;
                return num2;
            }
        });

        for (Student s : arr) {
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
