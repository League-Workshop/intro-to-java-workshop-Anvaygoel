package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String phone=JOptionPane.showInputDialog("what is your phone number?");
		String name=JOptionPane.showInputDialog("what is your name?");
		String bank=JOptionPane.showInputDialog("what is your bank accound info?");
		String credit=JOptionPane.showInputDialog("what is your credit card number?");
		String banknumber=JOptionPane.showInputDialog("what is your banks phone number?");
		JOptionPane.showMessageDialog(null, "hello thanks for the info "+ name +" someone will call your bank and take all your money and scam you");
	}

}
