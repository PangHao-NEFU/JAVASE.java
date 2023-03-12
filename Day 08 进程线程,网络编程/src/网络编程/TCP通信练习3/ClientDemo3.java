package 网络编程.TCP通信练习3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket(InetAddress.getLocalHost().getHostAddress(), 10006);
        //发送数据
        Scanner scanner = new Scanner(System.in);   //键盘输入流
        OutputStream os = sk.getOutputStream(); //字节输出流
/*        //通过字节流
        String line= "";
        while ((line = scanner.nextLine())!=null){
            os.write(line.getBytes());
            if (line.equals("886")) {
                break;
            }*/
        //通过字符流一次写一个字符串也可以：把字节流包装成字符流再包装成BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        String line;
        while((line=scanner.nextLine())!=null){

           bw.write(line);
           bw.newLine();
           bw.flush();
           if(line.equals("886")){
                break;
           }
        }


        //接收服务端反馈
        InputStream ips = sk.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ips));
        String line1 = reader.readLine();
        System.out.println(line1);
        //关闭
        sk.close();
    }
}
