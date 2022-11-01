package basic; // 把多个java放到一个文件夹下组成一个package  声明所属的package

public class HelloWorld {
    public static void main(String[] args) { // psvm
        System.out.println("Hello World"); // sout
        // int bigNum = 9999999999999;
        long bigNum = 99999999999L;
        System.out.println(bigNum);
        System.out.println(1<2);
        System.out.println('A'); // char类型 2个byte 值域是所有字符，用单引号表示
        System.out.println("abc"); //字符串 用双引号表示

        byte byteVar = 127;
        short shortVar = 22222;
        int intVar = 222222222;
        long longVar = 999999999999L;
        char charVar = '1';
        float floatVar = 100.1f;
        double doubleVar = 100.1;
        boolean condition = true;
        System.out.println(condition || (10/0> 1)); // || 当左侧为true，不计算右侧，更为常用， && 同理
        // System.out.println(condition | (10/0> 1)); // | 左右两侧都会计算
        // 按位运算符 用八进制或者16进制进行表示更容易得出想要的结果
        // 0开头表示八进制 0x表示十六进制
        /*
         * 按位运算符，效率高，但不易理解，不推荐使用
        */
        int a = 0xF8; // 1111 1000
        int b = 0xF4; // 1111 0100
        int c = 0xFF; // 1111 1111
        System.out.println(a & b); // 按位与   1111 0000 -> 0xf0 -> 
        System.out.println(a | b); // 按位或   1111 1100 -> 0xfc
        System.out.println(a ^ b); // 按位异或 0000 1100 -> 0x0c
        System.out.println(~c);
        System.out.println((int) 0.7); //强制类型转换
        
        /* 
         * 字符集和编码
        */

    }
}