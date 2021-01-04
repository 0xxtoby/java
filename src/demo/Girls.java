package demo;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;


public class Girls extends JFrame{
    static int a = 0 ;
    static int exit = 0;
    static String[] str_exit = {"不要走嘛","尝试挽留","真的要走吗?","好吧,点1000次就给你走","骗你的,不忍心的嘻嘻","女生节快乐鸭!"};
    static String[] str = {"<html><font>女生节不是在抵抗长大<br>而是在欣赏成熟的同时<br>依然可以保留女生的天真和活力</font></html>",
            "<html><font>愿你，<br>喜爱甜食，也能吃得起生活的苦。<br></font></html>",
            "<html><font>不畏惧年纪，始终保持少女心。</font></html>",
            "<html><font>向阳而生,被世界温柔以待。</font></html>",
            "<html><font>女生节快乐鸭!!</font></html>"
    };
    public void creatJFrame(String title){
        JFrame jf;
        jf=new JFrame(title);
        Container container=jf.getContentPane();
        JLabel label=new
                JLabel(str[a]);
        label.setFont(new Font("宋体", 1, 25));

        URL url1 = getClass().getResource("a.jpg");
        URL url2 = getClass().getResource("b.jpg");
        URL url3 = getClass().getResource("c.jpg");
        URL url4 = getClass().getResource("d.gif");
        ImageIcon image1 = new ImageIcon("a.jpg");
        image1.setImage(image1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT ));
        ImageIcon image2 = new ImageIcon("b.jpg");
        image2.setImage(image2.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT ));
        ImageIcon image3 = new ImageIcon("c.jpg");
        image3.setImage(image3.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT ));
        ImageIcon image4 = new ImageIcon("d.gif");
        image4.setImage(image4.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT ));
        JLabel label1=new JLabel(image1);
        JLabel label2=new JLabel(image2);
        JLabel label3=new JLabel(image3);
        JLabel label4=new JLabel(image4);



        //设置标签文字居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JButton btnY=new JButton("接着看");
        JButton btnN=new JButton("不看了");
        //添加按钮监听事件
        btnN.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                if(Girls.a>=4|| Girls.exit>=13)
                    System.exit(0);
                if (a<5)
                    a++;
                label.setText(str[a]);
            }

        });
        btnY.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                if(Girls.a>=4|| Girls.exit>=13)
                    System.exit(0);
                if (a<5)
                    a++;
                label.setText(str[a]);
            }

        });
        btnN.addMouseListener(new MouseListener(){
            //鼠标点击、移上、移出、松开事件
            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub
                btnN.setText("接着看");

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub
                btnN.setText("不看了");

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
        btnY.setBounds(120, 260, 80, 30);
        btnN.setBounds(380, 260, 80, 30);

        label1.setBounds(25,0,150,150);
        label2.setBounds(300,10,150,150);
        label3.setBounds(500,130,100,100);
        label4.setBounds(0,160,100,100);

        container.add(btnY);
        container.add(btnN);
        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        container.add(label);


        jf.setSize(600, 400);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.addWindowListener(new MyWindowListener());
    }
    public static void main(String[] args) {
        Girls a =new Girls();
        a.creatJFrame("18软工");
    }


}

class MyJDialog extends JDialog{

    public MyJDialog(){

        super(new JFrame(),"18软工",true);
        Container c=getContentPane();
        JLabel label;
        if(Girls.exit<4)
            label=new JLabel(Girls.str_exit[Girls.exit]);
        else if(Girls.exit>=4&& Girls.exit<=10)
            label=new JLabel(1004 - Girls.exit+"");
        else
            label=new JLabel(Girls.str_exit[Girls.exit-7]);
        Girls.exit++;
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JButton btnY=new JButton("接着看");
        JButton btnN=new JButton("不看了");
        //添加按钮监听事件
        btnN.addMouseListener(new MouseListener(){
            //鼠标点击、移上、移出、松开事件
            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub
                btnN.setText("接着看");

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub
                btnN.setText("不看了");

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
        //添加按钮监听事件
        btnN.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                if(Girls.a>=4|| Girls.exit>=13)
                    System.exit(0);
                if (Girls.a<5)
                    Girls.a++;
                label.setText(Girls.str[Girls.a]);
            }

        });
        btnY.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                if(Girls.a>=4|| Girls.exit>=13)
                    System.exit(0);
                if (Girls.a<5)
                    Girls.a++;
                label.setText(Girls.str[Girls.a]);
            }

        });
        btnY.setBounds(30, 100, 80, 30);
        btnN.setBounds(158, 100, 80, 30);
        c.add(btnY);
        c.add(btnN);
        c.add(label);
        setSize(300, 200);
        setResizable(false);
        this.addWindowListener(new MyWindowListener());
        this.setLocationRelativeTo(null);

    }



}
class MyWindowListener extends WindowAdapter{
    //窗体关闭过程中触发函数
    public void windowClosing(WindowEvent e){
        if(Girls.a>=4|| Girls.exit>=13)
            System.exit(0);
        new MyJDialog().setVisible(true);

    }
}


