package sy3.no6;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Question[] bb = new Question[15];
        bb[0]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思：",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[1]=new SingleQuestion2("b","Java所定义的版本不包括",
                new String[]{"A:java2 EE", "B:java2 Caed", "C:java2 ME","D:java2 HE"});

        bb[2]=new MulitQuestion2(new String[]{"a", "b","c"},"下列说法正确的是：",
                new String[]{"A:1+1=1", "B:1+1！=1", "C:1*1=1","D:1/1=1"});

        bb[3]=new MulitQuestion2(new String[]{"a", "c"},"下列( )属于引用数据类型：",
                new String[]{"A:Sting", "B:char", "C:用户自定义的Student","D:int"});

        bb[4]=new SingleQuestion2("b","对象的特征在类中",
                new String[]{"A:对象", "B:属性", "C:方法","数据类型"});

        bb[5]=new SingleQuestion2("a","多态的表现形式有：",
                new String[]{"A:重写", "B:抽象", "C:继承","D:封装"});

        bb[6]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[7]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[8]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[9]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[10]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});

        bb[11]=new MulitQuestion2(new String[]{"a", "b"},"java的课是不是很有意思",
                new String[]{"A:非常有意思", "B:特别有意思", "C:没啥意思"});


        int i=0;
        int sum=0;
        while (true){
            System.out.println("\n");
            System.out.println("----------"+(i+1)+"-----------");
        bb[i].print();
        String ss=scanner.nextLine();
//            System.out.println(ss);
        String[] sss=ss.split(" ");
//            System.out.println(Arrays.toString(sss));
        if (bb[i].check(sss))
        {
            sum=sum+5;
            System.out.println("答案正确 +5");
            System.out.println("总分："+sum);
        }
        else
        {
            System.out.println("答案错误");
            System.out.println("总分："+sum);
            System.out.println("\n是否回到上一题(y/n):");
            if(scanner.nextLine().equals("y")){
                i=i-1;
            }
        }

//        scanner.nextLine();
        i++;
        }
    }
}
