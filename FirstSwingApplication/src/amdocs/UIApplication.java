package amdocs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UIApplication {
	
	public static void main(String args[]) {
		
		Addition add = new Addition();
		//Substraction sub = new Substraction();
	}
}	
class Addition extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	
	JTextField txt1 = new JTextField(25);
	JTextField txt2 = new JTextField(25);
	JButton btn = new JButton("+\n");
	JButton btn1 = new JButton("-\n");
	JButton btn2 = new JButton("*\n");
	JButton btn3 = new JButton("/\n");
	JButton clr = new JButton("Clear\n");
	//JLabel space = new JLabel("");
	JLabel lbl = new JLabel();
	JLabel lbl1 = new JLabel();
	double valueSoFar=0.0;
	
	public Addition() {
		
		
		setLayout(new FlowLayout());
	    setVisible(true);
	    setSize(500,500);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(txt1);
		add(txt2);
		add(btn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(clr);
		//add(space);
		add(lbl);
		//frame.setPreferredSize(new Dimension(550, 300));
		//frame.getContentPane().setBackground(Color.BLUE);
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		clr.addActionListener(this);
	    
}

	
	
	public void actionPerformed(ActionEvent ae) {
		
		int num1=Integer.parseInt(txt1.getText());
		int num2=Integer.parseInt(txt2.getText());
		
		
		if(ae.getSource()==btn) {
			int result = num2 + num1;
		    lbl.setText(result + "");
		}
		else if(ae.getSource()==btn1) {
			int sub = num1 - num2;
		    lbl.setText(sub + "");
		}
		else if(ae.getSource()==btn2) {
			int mul = num1 * num2;
		    lbl.setText(mul + "");
		}
		else if(ae.getSource()==btn3) {
			double div = num1 / num2;
		    lbl.setText(div + "");
		}
		else if (ae.getSource()==clr){
			int clear = 0;
			lbl.setText(clear + "");
		}
	}
		
	

}

