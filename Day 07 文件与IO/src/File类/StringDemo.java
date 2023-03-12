package File类;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bys = s.getBytes("GBK");      //默认为utf-8编码
        System.out.println(Arrays.toString(bys));   //将bys的内容以字符串形式表示
        String s2 = new String(bys,"GBK");  //编码和解码的字符集必须一致
        System.out.println(s2);
    }
}
