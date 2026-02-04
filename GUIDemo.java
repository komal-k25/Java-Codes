
import javax.swing.*;

import java.awt.*;
public class GUIDemo extends JFrame{
	GUIDemo(String title){
		super(title);
		JLabel uname = new JLabel("User Name");
		JLabel pass = new JLabel("Password");
		JTextField tname = new JTextField(20);
		JTextField tpass = new JTextField(20);
		
		JButton submit = new JButton("Submit");
		JButton reset = new JButton("Reset");
		
		setLayout(new FlowLayout());
		
		add(uname);
		add(tname);
		
		add(pass);		
		add(tpass);
		
		add(submit);
		add(reset);
		
		setSize(600,600);
		setLocation(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GUIDemo("First GUI program");
	}
}
