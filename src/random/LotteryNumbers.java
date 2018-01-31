package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int number;
		Random rand = new Random();
		String message = "";
		for (int i = 0; i < 5; i++) {
			number = rand.nextInt(60)+1;
			message += " ";
			message += number;
			
		}
		JOptionPane.showMessageDialog(null, message);
	}
}

//56 7 45 34 23