package 网络编程.TCP通信练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*这是服务器端，要求接收客户端请求并给出应答,
* 注意要先启动服务器端，再启动客户端*/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket socket = ss.accept();
        InputStream in = socket.getInputStream();
        byte[] re_bytes = new byte[1024];
        int read_num = in.read(re_bytes);
        String re_string = new String(re_bytes, 0, read_num);
        System.out.println(re_string);


        OutputStream os = socket.getOutputStream();
        os.write("收到收到".getBytes(StandardCharsets.UTF_8));
        ss.close();
    }
}
