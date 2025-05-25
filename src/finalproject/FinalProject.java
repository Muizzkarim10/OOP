package finalproject;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class FinalProject {

    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("D:\\coding\\oop java\\FinalProject\\src\\finalproject\\flap.png");
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setIconImage(image.getImage());
        frame.setSize(1080, 720);
        frame.setResizable(false);
        
        frame.setTitle("Flappy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
