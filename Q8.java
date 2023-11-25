/*WAP to create a Form for registration of a user with the following validaitons?
i-Name should contain only character value.
ii-Address should contain Multiple values.
iii-In the subject field select maximum 2 checkbox out of three?
iv-In the Exam center field select maximum 2 list items.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Q8 extends Applet {
    public void init(){
        Label top=new Label("                                           Registeration Form");
        GridLayout g=new GridLayout(20,1);
        add(top); 
        setLayout(g);
        setBackground(new Color(220, 220, 220));
        
    add(new Label("NAME : "));
    TextField name=new TextField("Enter Your name");
    add(name);

    add(new Label("Add Addresss"));
    add(new TextField("Add new Address"));
    Button addaddress=new Button("+");
    addaddress.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          add(new TextField("Add new Address"));
          repaint();
        }
        
    });
    add(addaddress);

    add(new  Label("                                           Subject Field"));
    add(new Checkbox("English"));
    add(new Checkbox("Math"));
    add(new Checkbox("Science"));

    add(new Label("                                           Exam centre"));
    add(new Checkbox("Delhi"));
    add(new Checkbox("Mumbai"));
    add(new Checkbox("Pune"));
    add(new Checkbox("Banglore"));

    Button sumbit=new Button("Sumbit");
    sumbit.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            add(new Label("Your response has been recorded"));
            repaint();
        }
    });
    add(sumbit);
    }
    
}
//<applet code="Q8" width=400 height=400>
//</applet>