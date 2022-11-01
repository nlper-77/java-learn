package basic; // 把多个java放到一个文件夹下组成一个package

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
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
        

    }
}