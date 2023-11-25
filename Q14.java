/*14.	WAP to implement a color menu which have four options red, Green, Blue and Exit. When we’ll Press red,
 green, blue color it will set that color as background color and on exit we need to exit from the window. */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q14 extends Applet{
    Choice color  =new Choice();
    String Ch=" ";
    Button b=new Button("Color");
    public void init(){
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ch=color.getSelectedItem();
                repaint(); 
            }
            
        });

        add(color);
        add(b);
    }
    public void paint(Graphics g){
        switch (Ch) {
            case "Red":
                setBackground(Color.red);

                break;

            case "Green":
                setBackground(Color.green);

                break;

            case "Yellow":
                setBackground(Color.yellow);

                break;

            case "Blue":
                setBackground(Color.blue);

                break;

            default:
                break;
        }
    }
}

//<applet code="Q14" width=600  height=400></applet>