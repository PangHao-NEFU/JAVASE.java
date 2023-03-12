package 集合体系结构.成绩排序TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int o1_score=o1.getLscore()+o1.getMscore();
                int o2_score=o2.getLscore()+o2.getMscore();
                int num = o1_score - o2_score;
                return num==0?o1.getName().compareTo(o2.getName()):num;
            }
        });

        Student student1 = new Student("张三", 90, 85);
        Student student2 = new Student("李四", 87, 63);
        Student student3 = new Student("王五", 71, 79);
        Student student4 = new Student("六子", 65, 81);

        ts.add(student1);
        ts.add(student2);
        ts.add(student3);
        ts.add(student4);

        for (Student s : ts) {
            System.out.println(s.getName()+","+(s.getMscore()+s.getLscore()));
        }

    }
}
