package io;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileOutputStream;

public class ImageIODemo {
    public static void main(String[] args) throws IOException {
        String file = "src/io/img.png";
        InputStream in = new FileInputStream(file);
        BufferedImage img = ImageIO.read(in);
        Graphics2D g=(Graphics2D)img.getGraphics();
        g.setColor(Color.WHITE);
        g.drawString("hallwode",220,150);
        OutputStream out= new FileOutputStream("img.png");
        ImageIO.write(img,"png",out);

        out.close();

        JFrame frame = new JFrame("查看图片");
        JPanel panel = new JPanel();
        JLabel label = new JLabel(new ImageIcon(img));
        panel.add(label);
        frame.setContentPane(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
