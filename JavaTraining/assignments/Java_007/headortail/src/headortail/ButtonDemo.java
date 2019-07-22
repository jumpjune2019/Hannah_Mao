package headortail;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class ButtonDemo  implements ActionListener {
	JLabel jlab;
	String first; //first button label
	String second; //second button label
	String Msg;    //message
	String MsgReset;
	
	public void setButtons(JPanel frm, String f, String s, String sMsg) {
		first = f;
		second = s;
		Msg = "";
		MsgReset = sMsg;
		
		
		JButton FlipButton = new JButton(first);
		JButton resetButton = new JButton(second);
		// Add action listeners.
		FlipButton.addActionListener(this);
		resetButton.addActionListener(this);
		// Add the buttons to the content pane.
		frm.add(FlipButton);
		frm.add(resetButton);
		// Create a label.
		jlab = new JLabel("Waiting...");
		// Add the label to the frame.
		frm.add(jlab);
	}
	
	// Handle button events.

	public void actionPerformed(ActionEvent ae) {
		
		MyRandom num= (m,n)-> {return (int)Math.floor(Math.random()*(m-n+n)+n);};

		 int result = num.Rand(2,1);
		
		 	MyFlip myflip= (f, output)-> { 
		 		   
		 		if (result==1) {
		 			
		 			output="Head";
		 			Msg= "You have flipped a "+ output;
		 			 		
		 		}
		
		 		if(result==2) {
		 			output="Tail";
		 			Msg= "You have flipped a "+ output;
		 		}
		 		
		 		return output;
		 	};
	
	
		 	myflip.flip(result,"");
		
		
		if(ae.getActionCommand().equals(first)) {
			
			jlab.setText(Msg);
			
		} else {
			jlab.setText(MsgReset);
		}
	}
}

