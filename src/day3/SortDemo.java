package day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SortDemo {
    public static void main(String[] args) {
        int[] ary={10,345,43,23,2,342,3423,423,4,234,234};
        bubbleSort(ary);
        System.out.println(Arrays.toString(ary));
        Random random=new Random();
        Scanner console = new Scanner(System.in);
        int key= random.nextInt(100);
        binarySearch(ary, 11);


    }
    public 	static void bubbleSort(int[] ary){
        for (int i = 0; i < ary.length-1; i++) {
            for (int j = 0; j < ary.length-i-1; j++) {
                if (ary[j]>ary[j+1]) {
                    int t=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=t;

                }
            }
        }
        System.out.println();
    }
    public static void binarySearch(int[] ary , int key) {
        int i=0,j=ary.length-1;

        while(i<=j){
            int t=(i+j)/2;
            if (ary[t]==key) {
                System.out.println(t+1);
                break;
            }
            else if (ary[t]<key) {
                i=t+1;
            }
            else {
                j=t-1;
            }
        }
        if (i>j) {
            System.out.println("没有找到");

        }
    }
}