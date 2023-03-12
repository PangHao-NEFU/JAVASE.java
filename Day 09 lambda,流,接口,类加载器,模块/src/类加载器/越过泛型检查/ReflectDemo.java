package 类加载器.越过泛型检查;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*说明:
* 我有一个ArrayList<Integer>集合,现在想向其中添加一个String类型数据,如何实现?*/
public class ReflectDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<>();
        Class<? extends ArrayList> aClass = array.getClass();
        Method am = aClass.getMethod("add", Object.class);
        am.invoke(array, "string");
        am.invoke(array, "hello");
        am.invoke(array, "world");
        System.out.println(array);  //反射可以越过原有数据类型
    }
}
