package day5;
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;
public class Magic8Ball {
	// Copyright Wintriss Technical Schools 2013
	



		// 1. Make a main method that includes all the steps below….
         public static void main(String[] args) {
			
		
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
         int random=new Random().nextInt(4);
		// 3. Print out this variable
          System.out.println(random);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask me a yes or no question");
		// 5. If the random number is 0
if (random==0) {
	

		// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "yes");
}
		// 6. If the random number is 1
if (random==1) {
	

		// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "message");
}
		// 7. If the random number is 2
if (random==2) {
	JOptionPane.showMessageDialog(null,  "maybe you should ask Google");
	
}
if (random==3) {
	JOptionPane.showMessageDialog(null,  "never");
	
}

}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
         
		// -- write your own answer
         

	}



