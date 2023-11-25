/*13.	WAP using Applet to draw circle, line ,rectangle and fill them with a color given by the user. */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseListener;


public class Q13 extends Applet {
    Panel p1, p2;
    Choice shape = new Choice();
    Choice Colors = new Choice();
    Button create = new Button("create");
    String Choicecolor = "0", Choiceshape = "0";
    int cx, cy;

    public void init() {
        p1 = new Panel();
        p2 = new Panel();

        p1.add(shape);
        shape.add("Circle");
        shape.add("Rectangle");
        shape.add("Line");

        p1.add(Colors);
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Choicecolor = Colors.getSelectedItem();
                Choiceshape = shape.getSelectedItem();
                cx = e.getX();
                cy = e.getY();
                repaint();
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
            }

        });

        add(p1);
        add(p2);
    }

    public void paint(Graphics g) {
        switch (Choicecolor) {
            case "Red":
                g.setColor(Color.red);

                break;

            case "Green":
                g.setColor(Color.green);

                break;

            case "Yellow":
                g.setColor(Color.yellow);

                break;

            case "Blue":
                g.setColor(Color.blue);

                break;

            default:
                break;
        }
        switch (Choiceshape) {
            case "Circle":
                g.fillOval(cx, cy, 200, 200);
                break;
            case "Rectangle":
                g.fillRect(cx, cy, 200, 100);

                break;
            case "Line":
                g.drawLine(cx, cy, 200, 200);
                break;

            default:
                break;
        }
    }
}

// <applet code="Q13" width=600 height=400>
// </applet>