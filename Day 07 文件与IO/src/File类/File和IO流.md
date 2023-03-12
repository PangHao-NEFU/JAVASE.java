File：是文件和目录名的抽象表示
文件和目录是可以通过File封装成对象的

构造方法：
File（String pathname）通过将给定的路径名字符串转换为抽象路径名来创建新File实例
File（String parent，String child）从父路径名字符串和子路径名字符串创建新的File实例
File（File parent，String child）从父抽象路径名和子路径名字符串创建新的File实例

File类创建功能
boolean createNewFile()，当具有该名称的文件不存在时，创建一个由该抽象路径名命名的空文件
boolean mkdir()创建由此抽象路径名命名的目录
boolean mkdirs()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录（创建多级目录）

File类判断和获取功能
boolean isDirectory() 路径名表示的File是否为目录
boolean isFile()    路径名表示的flie是否为文件
boolean exists()    测试路径名表示的File是否存在
String getAbsolutePath()    返回此抽象路径名的绝对路径字符串
String getPath()    将路径名转换为路径名字符串
String getName()    返回由此抽象路径名表示的文件或目录名称
String[] list()     返回路径名表示的目录中文件和目录的名称字符串数组
File[] listFiles()  返回此抽象路径名表示的目录中的文件和目录的File对象数组

File类删除功能
File delete()，删除由此路径名表示的文件或目录



IO流
1.字节流：分为字节输入流和字节输出流，都是抽象类
实现类：
FileInputStream，从文件中读数据
构造方法：
FileInputStream(String name)
读数据步骤：创建字节输入流对象，调用字节输入流对象的读数据方法，释放系统资源
.read()方法用于读数据，返回读取一个字节的数据，如果文件到达末尾则返回-1
int read() 从此输入流中读取一个字节的数据。
int read(byte[] b) 从此输入流 b.length最多 b.length字节的数据读 b.length字节数组。返回读入缓冲区的总字节数
int read(byte[] b, int off, int len) 从此输入流 len最多 len字节的数据读入一个字节数组。返回读入缓冲区的总字节数



FileOutputStream，用于将数据写入File的输出流，再通过.write()写入文件
写数据步骤：创建字节输出流对象，调用字节输出流对象的写数据方法，释放系统资源
构造方法：两者其实是一样的，给文件路径名编译器也会自动封装成一个File文件
FileOutputStream(String name,true)   创建文件输出流以指定的名称写入文件，true表示追加写入而非重新写入
FileOutputStream(File file)     创建文件输出流以写入由指定的File对象表示的文件
最后都要释放资源，关闭此文件输出流.close()
字节流写数据：
.write(int b)   一次写一个字节数据
.write(byte[] b)    一次写一个字节数组数据
.write(byte[] b,int off,int len)    将len个字节从字节数组b，从偏移量off开始写入，写一部分字节数组

采用一次读写一个字节数组的方式更快

字节缓冲流：
BufferedOutputStream(OutputStream out)
缓冲输入流，应用程序可以向底层输出流写入字节，不必为写入的每个字节导致底层系统的调用
BufferedInputStream(InputStream in)
设置一个缓冲区，提高了读写效率

2.字符流：专门针对中文字符的方式，需指定字符集，字符流->字节流->写入文件
编码方法：
    byte[] .getBytes()   使用平台默认的字符集将该string编码为字节数组
    byte[] .getBytes(String charsetName) 使用指定字符集将该string编码为字节数组
解码方法：
    String(byte[] bytes)
    String(byte[] bytes,String charsetName)指定字符集解码bytes数组来构建新的string

构造方法：
OutputStreamWriter(OutputStream out):创建一个使用默认字符编码的OutputStreamWriter
InputStreamReader(InputStream in)：创建一个使用默认字符编码的InputStreamReader

写数据：OutputStreamWriter
.write(char[] cbuf, int off, int len) 写一个字符数组的一部分。
.write(int c) 写一个字符。
.write(String str, int off, int len) 写一个字符串的一部分。
.flush() 刷新流。会先写入缓冲区不会直接写入文件，刷新流后会写入文件

读数据：
InputStreamReader
int .read() 读一个字符。
int .read(char[] cbuf, int offset, int length) 将字符读入数组的一部分。
示例：InputStreamReader isr=new InputStreamReader(new FileInputStream("路径"))
但是这么写太繁琐了，提供一种简洁写法：
为了方便读写字符文件，可以使用其子类FileReader，FileWriter，如果不涉及编码问题，直接用子类更方便
FileReader（string fileName）
FileWriter（string fileName）

字符缓冲流：提高字符流读写效率
BufferedReader(Reader in) 这里的reader可以是FileReader也可以是InputStreamReader
BufferedWriter(Writer out)同上
特有功能：
BufferedWriter:
void newLine():写一行行分隔符，一般来说windows系统就是\r\n,Linux是\n，macos是\r
void write(String line) 一次写一个字符串
BufferedReader:
public String readLine()    读一行文字，不包含换行符，结果包含行的内容的字符串，不包括任何终止字符，结尾到达则返回null

示例：String line;
     while((line=br.readline())!=null){
        bw.write(line);
        bw.newLine();
        bw.flush();
     }

