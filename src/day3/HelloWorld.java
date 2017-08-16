package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog(null, "what is your name?");
		JOptionPane.showMessageDialog(null, "hi "+ answer);
	}

}
