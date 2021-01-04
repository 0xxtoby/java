package day3;

import java.util.Arrays;
import java.util.Random;

public class SortAPIDemo {
    public static void main(String[] args) {
        int[] ary = new int [10000];

        Random random=new Random();

        for (int i = 0; i < ary.length; i++) {
            ary[i]=random.nextInt(100);
        }
//        System.out.println(Arrays.toString(ary));
        int key = ary[0];
        long t1 = System.currentTimeMillis();
        Arrays.sort(ary);
        long t2 = System.currentTimeMillis();
        SortDemo.bubbleSort(ary);
        long t3= System.currentTimeMillis();

        System.out.println(t2-t1);
        System.out.println(t3-t2);

        int index;
        index = Arrays.binarySearch(ary,50);
        System.out.println((50+" index:"+index));

        int[] ary1 = Arrays.copyOf(ary,ary.length);
        System.out.println(Arrays.equals(ary,ary1));
        System.out.println(ary==ary1);
    }
}
