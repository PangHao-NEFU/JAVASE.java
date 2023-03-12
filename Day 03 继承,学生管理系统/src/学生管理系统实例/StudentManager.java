package 学生管理系统实例;
//实现管理系统的增删改查
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> stud = new ArrayList<Student>();
        int flag=0;
        while (flag==0) {
            System.out.println("--------欢迎来到管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出系统");
            System.out.println("请输入你的选择");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    addStudent(stud);
                    break;
                case "2":
                    delateStudent(stud);
                    break;
                case "3":
                    setStudent(stud);
                    break;
                case "4":
                    checkstudent(stud);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    flag=1;
                    break;
            }
        }
    }

    private static void setStudent(ArrayList<Student> array) {
        Student stud = new Student();
        System.out.println("请输入你要修改的学生学号");
        Scanner sc = new Scanner(System.in);
        String new_sid = sc.nextLine();
        System.out.println("请输入学生新的姓名");
        String new_name = sc.nextLine();
        System.out.println("请输入学生新的年龄");
        String new_age = sc.nextLine();
        System.out.println("请输入学生新的地址");
        String new_address = sc.nextLine();
        int flag=0;
        for (int i = 0; i < array.size(); i++) {
            stud = array.get(i);
            if (stud.getSid().equals(new_sid)) {
                stud.setSid(new_sid);
                stud.setName(new_name);
                stud.setAge(new_age);
                stud.setAddress(new_address);
                flag=1;
                break;
            }
        }
        if (flag == 0) {
            Student new_stud = new Student();
            new_stud.setSid(new_sid);
            new_stud.setName(new_name);
            new_stud.setAge(new_age);
            new_stud.setAddress(new_address);
            array.add(new_stud);
            System.out.println("未找到指定学号学生，已添加"+new_stud.getName());
            return;
        }
        System.out.println(stud.getName()+"已经修改完成！");
    }

    private static void delateStudent(ArrayList<Student> array) {
        System.out.println("请输入要删除的学生学号：");
        Scanner sc = new Scanner(System.in);
        String std_num = sc.nextLine();
        Student del_student = new Student();
        int flag=0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(std_num)) {    //字符串比较用.equals（str）方法
                del_student=array.remove(i);
                flag=1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("输入的学号不存在");
            return;
        }
        System.out.println(del_student.getName()+"学生已删除");

    }

    public static void addStudent(ArrayList<Student> array) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        if(isUsed(array, sid)){
            System.out.println("学号已被占用！");
            return;
        }else {
            s.setSid(sid);
            System.out.println("请输入学生姓名：");
            s.setName(sc.nextLine());
            System.out.println("请输入学生年龄：");
            s.setAge(sc.nextLine());
            System.out.println("请输入学生住址：");
            s.setAddress(sc.nextLine());
            array.add(s);
            System.out.println("学生添加成功！");
        }
    }

    public static void checkstudent(ArrayList<Student> array) {
        if(array.size()==0){
            System.out.println("无信息，请添加信息再查询！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t住址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }

    public static boolean isUsed(ArrayList<Student> array,String sid) {
        Student s = new Student();
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getSid().equals(sid)) {
                return true;
            }
        }
        return false;

    }
}
