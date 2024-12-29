//Implementation of ActionListener to perform addition and multiplication
//Return error if user has entered anything other than a whole number
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingDemo implements ActionListener {
    JFrame jf;
    JTextField t1 = new JTextField(30);
    JTextField t2 = new JTextField(30);
    JLabel l3 = new JLabel("");
    SwingDemo() {
        jf = new JFrame("Swing Demo");
        jf.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter a number:");
        JLabel l2 = new JLabel("Enter a number:");
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Multiply");
        b1.addActionListener(this);
        b2.addActionListener(this);
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);
        jf.add(l3);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(350,200);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            int a = Integer.parseInt(t1.getText()), b=Integer.parseInt(t2.getText());
            if(ae.getActionCommand().equals("Add")) {
                int res = a+b;
                l3.setText(Integer.toString(res));
            }
            if(ae.getActionCommand().equals("Multiply")) {
                int res=a*b;
                l3.setText(Integer.toString(res));            }
        }
        catch (NumberFormatException e) {
            l3.setText("Invalid Input!"); 
        }
    }
    public static void main(String args[]) {
        new SwingDemo();
    }
}
