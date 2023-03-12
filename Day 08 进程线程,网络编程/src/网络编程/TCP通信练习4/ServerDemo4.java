package 网络编程.TCP通信练习4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        ServerSocket sk = new ServerSocket(10008);
        Socket sa = sk.accept();
        InputStream ips = sa.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        File new_file = new File("E:\\Java project\\Day 08\\src\\网络编程\\TCP通信练习4", "newfile2.txt");
        if(!new_file.exists()){
            new_file.createNewFile();
        }
        BufferedWriter fileW = new BufferedWriter(new FileWriter(new_file));
        String mid;
        while ((mid=br.readLine())!=null){

            if (mid.equals("886")){     //给服务器一个退出接口，只要客户端传来“886”就认为发送结束
                break;
            }
            System.out.println(mid);
            fileW.write(mid);
            fileW.newLine();
            fileW.flush();
        }
        //给出反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sa.getOutputStream()));
        bw.write("已成功上传文件");
        bw.newLine();
        bw.flush();


        sk.close();
        br.close();
        fileW.close();
        bw.close();
    }
}
