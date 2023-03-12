package Map集合.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*创建map集合，key是学号，value是学生对象，并用两种方式遍历map集合*/
public class HashMapDemo {
    public static void main(String[] args) {
        /*创建集合对象*/
        HashMap<String, Student> map = new HashMap<>();
        /*创建学生对象*/
        Student student1 = new Student("朴智妍", 30);
        Student student2 = new Student("咸恩静", 34);
        Student student3 = new Student("金智秀", 25);
        Student student4 = new Student("赵美延", 25);
        Student student5 = new Student("李知恩", 30);
        /*把学生添加入集合*/
        map.put("001", student1);
        map.put("002", student2);
        map.put("003", student3);
        map.put("004", student4);
        map.put("005", student5);
        /*遍历*/

        //方式1
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Student s1 = map.get(s);
            System.out.println(s+","+s1.getName() +","+ s1.getAge());
        }
        System.out.println("---------------------");
        //方式2
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> kv : entrySet) {
            Student v=kv.getValue();
            String k=kv.getKey();
            System.out.println(k+","+v.getName()+","+v.getAge());

        }


    }
}
