package day6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        School[] s= new School[10];
        s[1].setSchoolNum(1);
        s[1].setSchoolName("台州学院");

        s[2].setSchoolNum(2);
        s[2].setSchoolName("台职院");

        s[3].setSchoolNum(3);
        s[3].setSchoolName("嘉院");
        int sLen=3;

        Student[] t = new Student[100];
        t[1].setSchoolNum(001);
        t[1].setStudentName("张三");
        t[1].setStudentNum(1963170001);

        t[2].setSchoolNum(002);
        t[2].setStudentName("李四");
        t[2].setStudentNum(1963170002);

        t[3].setSchoolNum(003);
        t[3].setStudentName("王五");
        t[3].setStudentNum(1963170003);

        t[4].setSchoolNum(002);
        t[4].setStudentName("toby");
        t[4].setStudentNum(1963170004);

        int tLen=4;

        Scanner console = new Scanner(System.in);
        int i=100;
        while (i--==0){
            System.out.println("请输入名字");
            String str=console.next();
            for (int j = 1; j <=tLen ; j++) {
                if (str == t[j].getStudentName()) {
                    int num=t[j].getSchoolNum();
                    for (int k = i; k <=sLen ; k++) {
                        if (num == s[k].getSchoolNum()) {
                            System.out.println(s[k].getSchoolName());

                        }

                    }

                }

            }

        }

    }
}
