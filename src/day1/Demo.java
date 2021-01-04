package day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        //字符串变为时间Date类,解析p格式化f,pf

        Date date=new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));





        Scanner conole=new Scanner(System.in);

        System.out.println("请输入出生日期（yyyy-MM-dd)：");
        String str=conole.next();
        String birthday = str;
        Date d = sdf.parse(birthday);
        //获得时间毫秒值        
        long myTime = d.getTime();
        //当前日期毫秒值        
        long currentTime = new Date().getTime();
        System.out.println("现在是"+(currentTime-myTime)/1000/60/60/24/365+"岁");
    }
}