package 集合体系结构.不重复随机数;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();   无序集合
        Set<Integer> set=new TreeSet<>();     //有序集合
        Random ra=new Random();
        while (set.size()<10){
            int number = ra.nextInt(20);    //生成0到19的随机数，不包含20
            set.add(number);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }

}
