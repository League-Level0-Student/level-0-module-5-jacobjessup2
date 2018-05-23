import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class PracticeExam {
public static void main(String[] args) {
	Robot Jazz = new Robot();
	Jazz.penDown();
	Jazz.setSpeed(100);
	for (int i = 0; i < 4; i++) {
		Jazz.move(100);	
		Jazz.turn(360/4);
	}
	
	String squares = JOptionPane.showInputDialog("Chose the amount of squares.");
	int meme = Integer.parseInt(squares);
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	
	if(color.equals("green")){
		Jazz.setPenColor(0,255,0);
	}
	
	for (int i = 0; i < meme ; i++) {
		for (int j = 0; j < 4; j++) {
			Jazz.move(100);	
			Jazz.turn(360/4);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}
