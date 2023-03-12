package File类;
/*复制多级文件夹，文件夹中可能有文件也有文件夹，要求把所有的内容都复制
* 思路：
*   1.创建数据源File对象
*   2.创建目的地file对象
*   3.写方法实现文件夹复制
*   4.判断数据源FILE是否为目录，
*       是：在目的地下创建和数据源file名称一样的目录
*           获取数据源File下所有文件或目录的File数组
*           遍历File数组得每个对象
*           把该File作为数据源File对象，递归调用复制文件夹的方法
*       不是：那就是文件，用字节流复制
*
* */

import java.io.*;

public class copyFileNDir {
    public static void main(String[] args) throws IOException {
        File srcfile =new File("C:\\Users\\PangHao\\Desktop\\青年大学习220307");
        File desfile=new File("E:\\");
        copyFolder(srcfile, desfile);
    }
    //复制文件夹方法
    private static void copyFolder(File srcfile, File desfile) throws IOException {
        //判断数据源File是否为目录
        if (srcfile.isDirectory()) {
            String fName = srcfile.getName();
            File newfold = new File(desfile, fName);
            if(!newfold.exists()){
                newfold.mkdir();            //创建同名目录
            }
            File[] listFiles = srcfile.listFiles(); //是文件夹的话获取其下所有File数组
            for (File file : listFiles) {
                copyFolder(file, newfold);      //递归调用复制文件夹
            }
        }else {//如果不是文件夹，是文件，直接复制
            File newFile=new File(desfile,srcfile.getName());
            copyFile(srcfile, newFile);
        }
        
        
    
    }
    //复制文件方法,采用字节流
    private static void copyFile(File srcfile, File desfile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desfile));
        byte[] bytes = new byte[2048];  //一次读2048字节
        int len;
        while ((len = bis.read(bytes))!=-1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
