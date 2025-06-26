package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RollingBall extends JPanel implements ActionListener{
    int x =100 , y = 90;
int start_Angle = 0;
int end_Angle = 180;
public RollingBall(){
Timer time1 = new Timer(50, this);
time1.start();
}
public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawOval(x,y, 80,80);
    g.fillArc(x,y,80,80,start_Angle,end_Angle);
}
@Override
public void actionPerformed(ActionEvent e) {
    x += 5 ;
    start_Angle -= 2;
    repaint();
    if (x>300) {
        x = 0;
    }
}
}
