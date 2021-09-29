package amdocs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UIApplication {
	
	public static void main(String args[]) {
		
		Addition add = new Addition();
		
	}
}	
class Addition extends JFrame implements ActionListener{
	
	JTextField txt1 = new JTextField(25);
	JTextField txt2 = new JTextField(25);
	JButton btn = new JButton("Perform Addition\n");
	//JLabel space = new JLabel("");
	JLabel lbl = new JLabel();
	
	public Addition() {
		
		
		
		add(txt1);
		add(txt2);
		add(btn);
		//add(space);
		add(lbl);
		
		btn.addActionListener(this);
		
	    setLayout(new FlowLayout());
	    setVisible(true);
	    setSize(500,500);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

	
	public void actionPerformed(ActionEvent ae) {
		
		int add1=Integer.parseInt(txt1.getText());
		int add2=Integer.parseInt(txt2.getText());
		
		int result = add1 + add2;
		
		lbl.setText(result + "");
		
		
	}

}
