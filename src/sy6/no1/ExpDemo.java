package sy6.no1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ExpDemo {
    public static void main(String[] args) {
        Scanner c =new Scanner(System.in);
        AccountMgr accountMgr=new AccountMgr();
        while (true) {
            System.out.println("-----------------");
            System.out.println("请输入命令：1注册  2登录  3查看全部用户  0拜拜");
            String cmd = c.nextLine();
            System.out.println(cmd);

            if (cmd.equals("0")) {
                System.out.println("拜拜");
                break;
            } else if (cmd.equals("1")) {
                System.out.println("请输入（name，pwd）：");
                String s = c.nextLine();
                String[] ss = s.split("\\s+");
                String name = ss[0];
                String pwd = ss[1];

                User user = null;
                try {
                    user = accountMgr.rep(name, pwd);
                    System.out.println("注册成功" + user);
                } catch (EmailExitsException e) {
//                    e.printStackTrace();
                    System.out.println("这个用户名已存在");
                }


            }
            else if (cmd.equals("2")){
                System.out.println("请输入登录（name，pwd）：");
                String s = c.nextLine();
                String[] ss = s.split("\\s+");
                String name = ss[0];
                String pwd = ss[1];


                try {
                    accountMgr.Sign(name,pwd);


                } catch (EmailExitsException e) {
                   // e.printStackTrace();
                    System.out.println("密码错误");
                }
            }
            else if (cmd.equals("3")){
                accountMgr.lookup();
            }
        }
    }
}
