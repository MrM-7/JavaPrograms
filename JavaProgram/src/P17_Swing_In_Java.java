package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class P17_Swing_In_Java{
	
	public static void main(String[] args) {
		SwingInJava sj = new SwingInJava();
	}
}

@SuppressWarnings("serial")
class SwingInJava extends JFrame{
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JTextArea ta1;
	
	JTextField j1;
	JTextField j2;
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	JCheckBox c3;
	
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	
	public SwingInJava() {
		
		l1 = new JLabel();
		l2 = new JLabel(); 
		l3 = new JLabel("What are your hobbies?");
		
		ta1 = new JTextArea(10,30);
		
		j1 = new JTextField(20);
		j2 = new JTextField(20);
		
		b1 = new JButton("Add");
		b2 = new JButton("Sub");
		b3 = new JButton("Mul");
		b4 = new JButton("Div");
		b5 = new JButton("Gender");
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Singing");
		c3 = new JCheckBox("Painting");
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(ta1);
		
		add(r1);
		add(r2);
		
		add(j1);
		add(j2);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		add(l1);
		add(l2);
		
		add(l3);
		add(c1);
		add(c2);
		add(c3);
		
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(j1.getText());
				int b = Integer.parseInt(j2.getText());
				
				if(e.getSource() == b1) {
					Integer sum = a + b;
					l1.setText("Result: "+sum.toString());					
				}
				
				if(e.getSource() == b2) {
					Integer sub = a - b;
					l1.setText("Result: "+sub.toString());					
				}
				
				if(e.getSource() == b3) {
					Integer mul = a * b;
					l1.setText("Result: "+mul.toString());					
				}
				
				if(e.getSource() == b4) {
					Integer div = a / b;
					l1.setText("Result: "+div.toString());					
				}
				
				if(e.getSource() == b5) {
					if(r1.isSelected()) {
						l2.setText("Male");
					}
					else {
						l2.setText("Female");
					}
				}
				
			}
		};
		
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		b5.addActionListener(al);

		
		setTitle("Sample Application");
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(360,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}