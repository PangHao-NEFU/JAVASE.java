package 网络编程.TCP通信练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*这是客户端，要求发送数据，接收服务器反馈
* 注意：先启动服务器端*/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket(InetAddress.getLocalHost().getHostAddress(), 10002);
        //获取输出流，写数据·
        OutputStream os = sk.getOutputStream();
        os.write("我是客户端，请接收".getBytes());

        //接收服务器反馈
        InputStream is = sk.getInputStream();
        byte[] bytes = new byte[1024];
        int read_num = is.read(bytes);  //这一步读取数据存入bytes中并返回读取字节个数
        String re = new String(bytes, 0, read_num);
        System.out.println(re);

        //别忘了释放资源，只要释放Socket对象，连接就会断开，系统资源就会被释放
        sk.close();
    }
}
