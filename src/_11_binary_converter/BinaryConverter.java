package _11_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JFrame frame = new JFrame();
	JPanel chanel = new JPanel();
	JTextField jerry = new JTextField(20);
	JLabel rob =  new JLabel();
	JButton button = new JButton();
	frame.add(chanel);
	frame.add(jerry);
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	
}
