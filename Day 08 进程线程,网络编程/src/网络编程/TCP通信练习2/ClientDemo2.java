package 网络编程.TCP通信练习2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket(InetAddress.getLocalHost().getHostAddress(), 10005);
        //发送数据

        Scanner scanner = new Scanner(System.in);   //键盘输入流
        OutputStream os = sk.getOutputStream(); //字节输出流
        //通过字节流
        String line= "";
        while ((line = scanner.nextLine())!=null){
            os.write(line.getBytes());
            if (line.equals("886")) {
                break;
            }
            /*通过字符流一次写一个字符串也可以：把字节流包装成字符流再包装成BufferedWriter
             * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
             * while((line=scanner.nextLine())!=null){
             *      if(line.equals("886")){
             *          break;
             *      }
             *      bw.write(line);
             *      bw.newLine();
             *      bw.flush();
             * }
             * 如果这里采用字符流，服务器接收端也要用字符流接收
             * */
        }



        //接收服务端反馈
        InputStream ips = sk.getInputStream();
        byte[] bytes = new byte[2048];
        int receive_num = ips.read(bytes);
        String s = new String(bytes, 0, receive_num);
        System.out.println(s);
        //关闭
        sk.close();
    }
}
