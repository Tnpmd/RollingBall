package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RollingBall extends JPanel{
    int x =100 , y = 90;
    int start_Angle = 0;
    int end_Angle = 180;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(x,y, 80,80);
        g.fillArc(x,y,80,80,start_Angle,end_Angle);

    }
}
