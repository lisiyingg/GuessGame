import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();//生成随机数
        int answer = r.nextInt(100) + 1;//记录猜的次数
        int count = 0;
        System.out.println("欢迎进入猜数字游戏！");
        System.out.println("我已经想好1~100之间一个数字");
        while(true){//一直让用户猜中为止
            System.out.print("请输入你猜的数字：");
            int num = sc.nextInt();
            count++;
            if(num > answer){
                System.out.println("猜大了！");
            }else{
                if(num < answer){
                    System.out.println("猜小了！");
                }else{
                    System.out.println("恭喜你猜对啦！");
                    System.out.println("你一共猜了" + count + "次");
                    break;
                }
            }
        }
        sc.close();
    }
}