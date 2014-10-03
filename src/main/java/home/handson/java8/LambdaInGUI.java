package home.handson.java8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaInGUI {

	public static void main(String[] args) {
		new MyFrame().setVisible(true);
	}
}


class MyFrame extends JFrame {
	JButton btn; 
	public MyFrame() {
		setSize(150, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn = new JButton("Show Hello");
		add(btn);
		// Java7 
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Hello!!");
//				
//			}
//		});
		
		// java 8
		btn.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello!!"));
	}
}
