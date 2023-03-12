package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPReciveDemo {
    public static void main(String[] args) throws IOException {
        //构造数据报套接字并将其绑定至本地主机指定的10086端口，即确定接收端口
        DatagramSocket socket = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        socket.receive(dp);

        byte[] gotdata = dp.getData();  //获取接收的数据
        int dpLength = dp.getLength();  //确定实际接收数据的长度

        String s = new String(gotdata,0,dpLength);
        System.out.println(s);
        socket.close();
    }
}
