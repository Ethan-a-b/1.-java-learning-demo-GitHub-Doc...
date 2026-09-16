import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = sc.next();
        System.out.println("你好，" + name + "！");

        System.out.print("请输入一个数字：");
        int num = sc.nextInt();
        System.out.println("数字的两倍 = " + num * 2);

        sc.close();
    }
}
