/*15.	WAP to show the use of KeyListener/MouseListener  interface in order to generate and process those events. */

import java.applet.Applet;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Q15 extends Applet{
    TextField t=new TextField("                         ");
    TextArea ar=new TextArea();
    public void init(){

        t.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                t.setEditable(false);
                t.setBackground(Color.CYAN);
            }
            public void mouseExited(MouseEvent e){
                t.setEditable(true);
                t.setBackground(Color.WHITE);
            }
        });
        t.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            ar.setText(t.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        });
        ar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                ar.setEditable(false);
                ar.setBackground(Color.yellow);
            }
            public void mouseExited(MouseEvent e){
                ar.setEditable(true);
                ar.setBackground(Color.WHITE);
            }
        });

        add(t);
        add(ar);
    }
}

// <applet code="Q15" width=500 height=400 ></applet>