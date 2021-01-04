package sy4.no1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=20;
        while (i>0){
            System.out.println("输入选择答案：");
            String rule =  "^\\s*[a-dA-D]((,\\s*|\\s+)[a-dA-D]){0,3}\\s*$";
            String sacn=scanner.next();
            System.out.println(sacn);



            boolean a=sacn.matches(rule);
            if (a){
                System.out.println("答案正确");
                String[] answers=  sacn.trim().toUpperCase().split("(,\\s*|\\s+)");
                Arrays.sort(answers);
                System.out.println(Arrays.toString(answers));

                break;
            }
            else {
                System.out.println("输入的选择答案不合规则");

            }

            i--;
        }
    }
}
