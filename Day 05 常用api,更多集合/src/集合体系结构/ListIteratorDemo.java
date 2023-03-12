package 集合体系结构;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        ListIterator<String> it = list.listIterator();

//        System.out.println(it.nextIndex());
//        System.out.println(it.previousIndex());

        it.add("java");
        it.previous();
        it.add("se");
        System.out.println(list);
        it.add("spring");
        System.out.println(list);
        it.add("boot");
        System.out.println(list);*/

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("se");
        ListIterator<String> it = list.listIterator();
        list.add("ee");
        System.out.println(it.previousIndex());
        try {
            System.out.println(it.next());
        } catch (Exception e) {

        }

        System.out.println(it.hasPrevious());
        System.out.println(it.nextIndex());
        System.out.println(it.hasNext());
    }
}
