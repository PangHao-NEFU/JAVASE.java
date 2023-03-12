package File类;

import java.io.File;
/*级联删除所有文件夹下文件,但保存文件夹*/
public class Delectfile {
    public static void main(String[] args) {
        File st=new File("C:\\Users\\PangHao\\Desktop\\青年大学习");
        deleteFileButReserveDir(st);

    }

    /*删除所有文件但保留文件夹*/
    public static void deleteFileButReserveDir(File f){
        if(f.isDirectory()){
            String[] flist = f.list();
            for(String i:flist){
                File file = new File(f, i);
                deleteFileButReserveDir(file);
            }
        }else {
            f.delete();
        }
    }

    /*谁的文件夹是空的?*/
    public static void whoIsEmpty(File url) {
        File[] list = url.listFiles();
        for (File s : list) {
            if (s.isDirectory() && s.list().length==0) {
                System.out.println(s.getName());
            }
        }
    }
}
