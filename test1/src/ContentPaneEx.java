import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;


public class ContentPaneEx extends JFrame{
    public ContentPaneEx(){
        setTitle("콘텐트 패널과 제이 프라임 예제 ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane = getContentPane();
        contentPane.setBackground(Color.orange);
        contentPane.setLayout(new FlowLayout());


        contentPane.add(new JButton("ok"));
        contentPane.add(new JButton("cancel"));
        contentPane.add(new JButton("ignore"));

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        
        new ContentPaneEx();
    }
    
}
