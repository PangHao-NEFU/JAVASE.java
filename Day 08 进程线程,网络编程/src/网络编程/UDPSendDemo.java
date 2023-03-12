package 网络编程;

import java.io.IOException;
import java.net.*;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造一个数据报包，用于将长度为 length的数据包发送到指定主机上的指定端口号。
        byte[] bys="hello world".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());
        int port=10086;

        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        ds.send(dp);

        ds.close();
    }
}
