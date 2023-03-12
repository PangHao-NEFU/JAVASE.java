package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
/*客户端发送数据到服务端*/
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        //Socket(InetAddress address, int port),跟下一行都可以
        //Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        //static InetAddress getByName(String host) 根据主机名称确定主机的IP地址。
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 10001);
        //OutputStream getOutputStream() 返回此套接字的输出流。
        OutputStream os=socket.getOutputStream();
        os.write("hello world".getBytes(StandardCharsets.UTF_8));
        socket.close();



    }
}
