package sy5.no1;

import java.util.HashMap;
import java.util.Scanner;

public class LoginDemo{
    public static void main(String[] args) {
        System.out.println("请输入用户名和密码：(name pwd):");
        Scanner scanner=new Scanner(System.in);

        String name=scanner.next();
        String pwd=scanner.next();

        HashMap<String,User> users =new HashMap<String,User>();
        users.put("tom",new User(1,"tom","123"));
        users.put("jerry",new User(2,"jerry","123"));
        users.put("andy",new User(3,"andy","123"));
        users.put("mac",new User(4,"mac","123"));
        users.put("robin",new User(4,"robin","123"));



        String str=name+" "+pwd;
        System.out.println(str);

        if(!str.matches("\\w+\\s\\W+")){
            System.out.println("输入正确");
            if(users.containsKey(name)){
                System.out.println("用户名存在");
                User user = users.get(name);
                if (user.getPwd().equals(pwd)){
                    System.out.println("热烈欢迎"+user);
                }
            };
        }
        else {
            System.out.println("输入不合法");
        };


    }
}

