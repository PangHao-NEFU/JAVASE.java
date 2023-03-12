package it;

/*
数组的初始化，定义方式：数据类型[] 数组名;
int[] array;
动态初始化： int[] arr=new int[3]
堆空间是有默认值的
默认初始值为int:0,浮点数：0.0，布尔：false，字符：空字符，引用数据类型：null
局部变量存储在栈区，而new出来的放在堆区

静态初始化：int[] arr={数据1，数据2，......}
*/

public class 数组 {
    public static void main(String[] args) {
        int[] arr=new int[3]; //堆空间自动初始化0
        int[] arr2={1,2,3};
        System.out.println();
    }
}
