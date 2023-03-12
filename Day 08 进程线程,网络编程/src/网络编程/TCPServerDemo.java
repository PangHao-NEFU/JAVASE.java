package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端socket对象
        ServerSocket ss = new ServerSocket(10001);
        //侦听要连接到此套接字并接受它
        Socket socket = ss.accept();
        //获取输入流，读数据，并把数据显示在控制台
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println(s);

    //释放资源
        ss.close();
        socket.close();
        inputStream.close();

    }
}
