package chapter01;

public class java01_dataType2 {
    public static void main(String[] arg) {
//        String name = "陈家伟";
//        int age = 25;
        // byte -> short -> int -> long -> float -> double
        //范围小的数据可以转为范围大的数据，但是范围大的数据无法转为小的数据 
        byte b = 10;
        short s = b;
        System.out.println(s);
    }
}
