package sample;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StopWatch implements ActionListener{
JLabel jlab;
long start;
 StopWatch() {
	JFrame jfrm = new JFrame("Секундомір");
	jfrm.setLayout(new FlowLayout());
	jfrm.setSize(320,100);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton jbtnStart = new JButton("Старт");
	JButton jbtnStop = new JButton("Стоп");
	JButton jbtnClear = new JButton("Очистка");
	
	jbtnStart.addActionListener(this);
	jbtnStop.addActionListener(this);
	jbtnClear.addActionListener(this);
	
	jfrm.add(jbtnStart);
	jfrm.add(jbtnStop);
	jfrm.add(jbtnClear);
	
	jlab = new JLabel("натисніть кнопку Старт для запуску секундоміра");
	jfrm.add(jlab);
	jfrm.setVisible(true);	
 	}
 	public void actionPerformed(ActionEvent ae){
 		Calendar cal = Calendar.getInstance();
 		if(ae.getActionCommand().equals("Старт")) {
 			start = cal.getTimeInMillis();
 			jlab.setText("Секундомір запущено...");
 		}
 		if(ae.getActionCommand().equals("Стоп") && start!=0)
 			jlab.setText("Пройшло часу: "+(double)(cal.getTimeInMillis()-start)/1000 + " c.");
 		if(ae.getActionCommand().equals("Очистка")&&start!=0){
 			start = 0;
 			jlab.setText("Секундомір очищено");
 		}
 			
 	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new StopWatch();
			}
		});

	}

}
