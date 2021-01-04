package day1;

import javax.swing.*;
import java.awt.*;

public class FrameHelloWorldColorFont {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel pane = new JPanel();
        JLabel label= new JLabel("hello world");
        pane.add(label);
        frame.setContentPane(pane);
        frame.setSize(200,200);
        frame.setVisible(true);
        label.setForeground(Color.red);

    }
}
