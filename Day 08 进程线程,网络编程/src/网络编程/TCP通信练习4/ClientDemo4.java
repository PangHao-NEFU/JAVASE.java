package 网络编程.TCP通信练习4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo4 {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket so = new Socket(InetAddress.getLocalHost().getHostAddress(), 10008);
        OutputStream os = so.getOutputStream();
        InputStream in = so.getInputStream();
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        File client_file= new File("E:\\Java project\\Day 08\\src\\网络编程\\TCP通信练习3\\newfile.txt");
        //封装文本文件数据
        BufferedReader file_reader = new BufferedReader(new FileReader(client_file));
        String file_line;
        while ((file_line = file_reader.readLine()) != null) {
            bw.write(file_line);
            bw.newLine();
            bw.flush();
        }
        //最后发送自定义结束标记，让服务器退出等待
        bw.write("886");
        bw.newLine();
        bw.flush();
        /*注意，这种自定义标记并不好，如果文件中出现“886”，则会提前终止！
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        System.out.println(br.readLine());

        so.close();
        bw.close();
        //br.close();
        file_reader.close();
    }
}
