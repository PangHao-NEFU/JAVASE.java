package API;

import java.util.Scanner;

/*什么是api？ application programming interface，应用程序编程接口，这些接口类就是厂家提供给应用程序的编程接口
* 就是JDK中提供的各种功能的Java类，将底层实现封装起来了，使用者不需关心这些类是如何实现的，只需要学习如何使用即可，可
* 大大提高编程者的编写代码效率，可通过帮助文档来使用
* 更多关于api的知识，在day05中*/
public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();    //输入sc.nextline（）后按ctrl alt v可以快速生成等号左边
        line.charAt(1);
    }
}
