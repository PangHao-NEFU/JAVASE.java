package 网络编程.TCP通信练习3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket sk = new ServerSocket(10006);
        Socket sa = sk.accept();
        InputStream ips = sa.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        File new_file = new File("E:\\Java project\\Day 08\\src\\网络编程\\TCP通信练习3", "newfile.txt");
        if(!new_file.exists()){
            new_file.createNewFile();
        }
        BufferedWriter fileW = new BufferedWriter(new FileWriter(new_file));
        String mid;
        while ((mid=br.readLine())!=null){

            if (mid.equals("886")){
                break;
            }
            System.out.println(mid);
            fileW.write(mid);
            fileW.newLine();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sa.getOutputStream()));
        bw.write("已经收到");
        bw.newLine();
        bw.flush();
        sk.close();
        br.close();
        fileW.close();
        bw.close();
    }
}
