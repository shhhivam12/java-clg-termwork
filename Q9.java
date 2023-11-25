/*WAP in an Applet Make two Button  one is Circle within Square  and second is Square within Circle. When user 
click on Circle within Square then draw Circle within Square. And when user click on Square within Circle then 
draw Square within Circle on the panel window? */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q9 extends Applet{
    Button b,b1;
    boolean flag;
    public void init(){
        b=new Button("Circle within Square");
        b1=new Button("Square within Circle ");
        add(b);
        add(b1);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
                flag=true;
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
                flag=false;
            }
        });
        
    }
    public void paint(Graphics g){
        if(flag){
            //circle within sq
            g.drawOval(100, 100, 200, 200);
            g.drawRect(100, 100, 200, 200);
        }
        else{
            g.drawOval(100, 100, 200, 200);
            g.drawRect(130, 130, 140, 140);
            //sq within circle
        }
    }
}


//<applet code="Q9" width=400 height=400>
//</applet>