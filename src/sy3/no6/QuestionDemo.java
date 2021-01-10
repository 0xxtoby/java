package sy3.no6;

import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    while (true){
        System.out.println("请输入你要回答的题目：1、单选题   2、多选题  0、退出");
        String cmd=scanner.next();
        if (cmd.equals("1")){
          SingleQuestion2 s1=new SingleQuestion2();
          String[] t= {"A:0\n","B:1\n","C:2\n","D:3\n"};

          s1.setTitle("1+1=?");
          s1.setOptions(t);

          System.out.println("请输入你的答案：");
          char da=scanner.next();
          if(s1.check(da))

        }
        else if (cmd.equals("2")){

        }
        else {
            System.out.println("已结束。。。。");
            break;
        }
    }
    }
}
