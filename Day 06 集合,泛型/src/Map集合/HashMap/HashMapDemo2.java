package Map集合.HashMap;
/*创建HashMap集合，key是学生对象，value是居住地（string），并遍历
* 如果学生对象的成员变量相同，则认为是同一个对象（重写equals和hashcode方法）*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Student,String> hm1=new HashMap<Student,String>();

        Student student1 = new Student("朴智妍", 30);
        Student student2 = new Student("咸恩静", 34);
        Student student3 = new Student("金智秀", 25);
        Student student4 = new Student("赵美延", 25);
        Student student5 = new Student("李知恩", 30);
        hm1.put(student1, "首尔");
        hm1.put(student2, "北京");
        hm1.put(student3, "台北");
        hm1.put(student4, "上海");
        hm1.put(student5, "大阪");
        hm1.put(student5, "天津");
        Set<Map.Entry<Student, String>> entrySet = hm1.entrySet();
        for (Map.Entry<Student, String> kv : entrySet) {
            Student key = kv.getKey();
            String value = kv.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
