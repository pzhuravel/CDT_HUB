package sample;

import javax.swing.*;

public class SwingDemo {
SwingDemo(){
	JFrame jfrm = new JFrame("Нове вікно");
	jfrm.setSize(275,100);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel jlbl = new JLabel("Hello, world!");
	jfrm.add(jlbl);
//	jlbl.setLocation(100, 100);
	jfrm.setVisible(true);
}

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable(){
	public void run(){
		new SwingDemo();
		}
	});


}
}
