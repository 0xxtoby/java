package sy6.no1;

import java.util.HashMap;

public class AccountMgr {
    private HashMap<String,User> users=new HashMap<String ,User>();
    private static int index=1;
    public User rep(String name,String pwd) throws EmailExitsException {

        if (users.containsKey(name)) {
            throw  new EmailExitsException("这个名字注册过了");
        }
        User user = new User(index++,name,pwd);
//        System.out.println(user.getPwd());
        users.put(name,user);
        return user;
    }

    public void Sign(String name, String pwd) throws EmailExitsException {
        User user=null;
        if (!users.containsKey(name)) {
            throw  new EmailExitsException("没有该名字");
        }
        user = users.get(name);
//        System.out.println(user.getPwd());
//        System.out.println(user.name);
//        System.out.println(pwd);
        if (user.getPwd().equals(pwd)){
            System.out.println("密码正确登录成功"+user);
        }
        else {
            System.out.println("密码错误");
        }

    }
    public void lookup(){

        for(String nn : users.keySet())
        {
            System.out.println(users.get(nn));
        }

    }

}
