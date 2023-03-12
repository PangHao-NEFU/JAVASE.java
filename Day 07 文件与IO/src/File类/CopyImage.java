package File类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*需求
* 将C:\Users\PangHao\Pictures\Saved Pictures\静态壁纸-PC\001.jpg复制到模块目录下
* 思路：
*   1.根据数据源创建字节输入流
*   2.根据目的地创建字节输出流
*   3.读写数据，一次读取一个字节数组，一次也写入一个字节数组
*   4.释放资源
* */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        String ad="C:\\Users\\PangHao\\Pictures\\Saved Pictures\\静态壁纸-PC\\001.jpg";
        FileInputStream fis = new FileInputStream(ad);
        String adin="E:\\Java project\\Day 07\\src\\File类\\001.jpg";
        FileOutputStream fos=new FileOutputStream(adin);
        byte[] bytes = new byte[1024];      //字节搬运数组，通常大小为1024整数倍
        int len;
        while ((len=fis.read(bytes))!=-1){  //len为实际读取的字节数
            fos.write(bytes,0,len);     //读出来多少就写多少
        }
        fis.close();
        fos.close();

    }

}
