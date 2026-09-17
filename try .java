import java.util.Scanner;

public class EvenSumDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数n：");

        // 判断输入是否为整数
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n > 0){
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    if(i % 2 == 0){
                        sum += i;
                    }
                }
                System.out.println("1到" + n + "之间所有偶数的和 = " + sum);
            }else{
                System.out.println("错误！请输入大于0的数字");
            }
        }else{
            System.out.println("输入不是整数！");
        }
        sc.close();
    }
}
