package 网络编程.TCP通信练习2;

import javax.sound.sampled.Line;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10005);
        Socket socket = ss.accept();
        //接收输入流,通过字节流的方式
        InputStream in = socket.getInputStream();
        byte[] re_bytes = new byte[2048];
        int read_num=0;
        while ((read_num = in.read(re_bytes))!=-1) {
            String re_string = new String(re_bytes, 0, read_num);
            if (re_string.equals("886")) {
                break;
            }
            System.out.println(re_string);
        }
        //也可以通过字符流的方式接收，但是要求客户端也用字符流传输
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(Line);
        }
        */

        //应答
        OutputStream os = socket.getOutputStream();
        os.write("通信已结束".getBytes(StandardCharsets.UTF_8));

        //释放系统资源
        ss.close();
    }
}
