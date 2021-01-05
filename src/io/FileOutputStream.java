package io;

import java.io.*;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        String file ="src/io/demo.txt";


        OutputStreamWriter out = new OutputStreamWriter(
                new BufferedOutputStream(
                        new java.io.FileOutputStream(file)
                ),"utf-8");
        out.write("杭");
        out.write("州");
        out.write("西");
        out.write("湖");
        out.write("真好");

        out.close();


        InputStreamReader in =new InputStreamReader(
                new BufferedInputStream(
                        new FileInputStream(file)
                ),"utf-8");

        int c;
        while ((c=in.read())!=-1){
            System.out.println((char)c);
        }

        in.close();




    }
}
