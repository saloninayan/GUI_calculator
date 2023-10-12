package intellij;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import java.math.*;


public class calc {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	
	double intI;
	double intII;
	
	String action;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1090, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Calibri", Font.BOLD, 32));
		textField.setBounds(25, 35, 806, 116);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s= Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("The Calculator result for sin fn is= ");
				textField.setText(textField.getText()+s);
			}
		});
		btnSin.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSin.setBounds(35, 161, 130, 89);
		frame.getContentPane().add(btnSin);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 19));
		btn7.setBounds(35, 260, 130, 89);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 19));
		btn4.setBounds(35, 370, 130, 89);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn1.getText();
				textField.setText(number);
			}
			
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 19));
		btn1.setBounds(35, 471, 130, 89);
		frame.getContentPane().add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn0.getText();
				textField.setText(number);
			}
			
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 19));
		btn0.setBounds(35, 570, 295, 89);
		frame.getContentPane().add(btn0);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 19));
		btn2.setBounds(200, 471, 130, 89);
		frame.getContentPane().add(btn2);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 19));
		btn5.setBounds(200, 370, 130, 89);
		frame.getContentPane().add(btn5);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 19));
		btn8.setBounds(200, 260, 130, 89);
		frame.getContentPane().add(btn8);
		
		final JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c= Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("The Calculator result for cos fn is= ");
				textField.setText(textField.getText()+c);	
			}
		});
		btnCos.setFont(new Font("Calibri", Font.BOLD, 19));
		btnCos.setBounds(200, 161, 130, 89);
		frame.getContentPane().add(btnCos);
		
		final JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t= Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("The Calculator result for tan fn is= ");
				textField.setText(textField.getText()+t);
			}
		});
		btnTan.setFont(new Font("Calibri", Font.BOLD, 19));
		btnTan.setBounds(367, 161, 130, 89);
		frame.getContentPane().add(btnTan);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 19));
		btn9.setBounds(367, 260, 130, 89);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 19));
		btn6.setBounds(367, 370, 130, 89);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 19));
		btn3.setBounds(367, 471, 130, 89);
		frame.getContentPane().add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Calibri", Font.BOLD, 19));
		btnDot.setBounds(367, 570, 130, 89);
		frame.getContentPane().add(btnDot);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck = null;
				if(textField.getText().length()>0) {
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck=str.toString();
					textField.setText(bck);
				}
			}
		});
		btnB.setFont(new Font("Calibri", Font.BOLD, 19));
		btnB.setBounds(538, 161, 130, 89);
		frame.getContentPane().add(btnB);
		
		final JButton btnSqr = new JButton("x^2");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x= Double.parseDouble(textField.getText());
				x = x*x;
				textField.setText("The Calculator result for square fn is= ");
				textField.setText(textField.getText()+x);
			}
		});
		btnSqr.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSqr.setBounds(538, 260, 130, 89);
		frame.getContentPane().add(btnSqr);
		
		final JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x= Double.parseDouble(textField.getText());
				x = x*x*x;
				textField.setText("The Calculator result for square fn is= ");
				textField.setText(textField.getText()+x);
			}
			
		});
		btnCube.setFont(new Font("Calibri", Font.BOLD, 19));
		btnCube.setBounds(538, 370, 130, 89);
		frame.getContentPane().add(btnCube);
		
		final JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqr= Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("The Calculator result for squareroot fn is= ");
				textField.setText(textField.getText()+sqr);
			}
		});
		btnSqrt.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSqrt.setBounds(538, 471, 130, 89);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 intII= Double.parseDouble (textField.getText());
				if(action == "+")
				{
			
			
				 double total=intI+ intII;
				 String answer= intI + " + " + intII + " = " + total;
				textField.setText(answer);
				}
				else if(action == "-")
				{
				
					double total=intI - intII;
				String answer= intI + " - " + intII + " = " + total;
				textField.setText(answer);
				
				}
				else if(action == "*")
				{
				
					double total=intI * intII;
				String answer= intI + " * " + intII + " = " + total;
				textField.setText(answer);
				}
				else if(action == "/")
				{
				
					double total=intI / intII;
				String answer= intI + " / " + intII + " = " + total;
				textField.setText(answer);
				}
				else if(action == "x^y") {
					double n =1;
					int i =0;
					while(i<intII) {
						n = intI* n;
						i++;
					}
					 String answer = intI + " ^ " + intII + " = " + n;
					textField.setText(answer);
				}
				
			}
		});
		btnEql.setFont(new Font("Calibri", Font.BOLD, 19));
		btnEql.setBounds(538, 577, 295, 89);
		frame.getContentPane().add(btnEql);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			}
		});
		btnC.setFont(new Font("Calibri", Font.BOLD, 19));
		btnC.setBounds(709, 161, 337, 89);
		frame.getContentPane().add(btnC);
		
		final JButton btnFact = new JButton("x!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double f= Double.parseDouble(textField.getText());
			double fac = 1;
			while(f!=0) {
				fac=fac*f;
				f--;
			}
			textField.setText("The factorial of opted no. is= ");
			textField.setText(textField.getText()+fac);
			}
		});
		btnFact.setFont(new Font("Calibri", Font.BOLD, 19));
		btnFact.setBounds(709, 260, 130, 89);
		frame.getContentPane().add(btnFact);
		
		final JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lg= Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("The calculated log value is= ");
				textField.setText(textField.getText()+lg );
			}
		});
		btnLog.setFont(new Font("Calibri", Font.BOLD, 19));
		btnLog.setBounds(709, 370, 130, 89);
		frame.getContentPane().add(btnLog);
		
		final JButton btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI =Double.parseDouble(textField.getText());
				textField.setText("");
				action = "x^y";
			}
		});
		btnPow.setFont(new Font("Calibri", Font.BOLD, 19));
		btnPow.setBounds(709, 471, 130, 89);
		frame.getContentPane().add(btnPow);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 19));
		btnAdd.setBounds(882, 260, 164, 89);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnSub.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSub.setBounds(882, 370, 164, 89);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnMul.setFont(new Font("Calibri", Font.BOLD, 19));
		btnMul.setBounds(882, 471, 164, 89);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDiv.setFont(new Font("Calibri", Font.BOLD, 19));
		btnDiv.setBounds(882, 570, 164, 89);
		frame.getContentPane().add(btnDiv);
		
		JRadioButton btnWant = new JRadioButton("Want");
		btnWant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnPow.setEnabled(true);
				btnLog.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnSqr.setEnabled(true);
				btnCube.setEnabled(true);
				btnFact.setEnabled(true);
			}
		});
		btnWant.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnWant.setBounds(49, 684, 96, 33);
		frame.getContentPane().add(btnWant);
		
		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnPow.setEnabled(false);
				btnLog.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnSqr.setEnabled(false);
				btnCube.setEnabled(false);
				btnFact.setEnabled(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClose.setBounds(901, 684, 96, 39);
		frame.getContentPane().add(btnClose);
	}
}

