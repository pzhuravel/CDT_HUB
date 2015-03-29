package sample;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StopWatch implements ActionListener{
JLabel jlab;
long start;
 StopWatch() {
	JFrame jfrm = new JFrame("���������");
	jfrm.setLayout(new FlowLayout());
	jfrm.setSize(320,100);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton jbtnStart = new JButton("�����");
	JButton jbtnStop = new JButton("����");
	JButton jbtnClear = new JButton("�������");
	
	jbtnStart.addActionListener(this);
	jbtnStop.addActionListener(this);
	jbtnClear.addActionListener(this);
	
	jfrm.add(jbtnStart);
	jfrm.add(jbtnStop);
	jfrm.add(jbtnClear);
	
	jlab = new JLabel("�������� ������ ����� ��� ������� ����������");
	jfrm.add(jlab);
	jfrm.setVisible(true);	
 	}
 	public void actionPerformed(ActionEvent ae){
 		Calendar cal = Calendar.getInstance();
 		if(ae.getActionCommand().equals("�����")) {
 			start = cal.getTimeInMillis();
 			jlab.setText("��������� ��������...");
 		}
 		if(ae.getActionCommand().equals("����") && start!=0)
 			jlab.setText("������� ����: "+(double)(cal.getTimeInMillis()-start)/1000 + " c.");
 		if(ae.getActionCommand().equals("�������")&&start!=0){
 			start = 0;
 			jlab.setText("��������� �������");
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
