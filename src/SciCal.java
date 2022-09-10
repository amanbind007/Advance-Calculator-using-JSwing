import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SciCal {

	private JFrame SciCalculator;
	double firstNo, secondNo, result;
	static double memory;
	int memCheck = 1;
	String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SciCal window = new SciCal();
					window.SciCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SciCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		SciCalculator = new JFrame();
		SciCalculator.setTitle("Calculator - Aman Bind");
		SciCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		SciCalculator.setBounds(100, 100, 312, 462);
		SciCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SciCalculator.getContentPane().setLayout(null);

		TextField textField = new TextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.setBounds(10, 10, 275, 37);
		SciCalculator.getContentPane().add(textField);

		Button button_1 = new Button("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "1";
				textField.setText(temp);
			}
		});
		button_1.setForeground(Color.ORANGE);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(10, 275, 53, 30);
		SciCalculator.getContentPane().add(button_1);

		Button button_2 = new Button("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "2";
				textField.setText(temp);
			}
		});
		button_2.setForeground(Color.ORANGE);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(86, 275, 53, 30);
		SciCalculator.getContentPane().add(button_2);

		Button button_3 = new Button("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "3";
				textField.setText(temp);
			}
		});
		button_3.setForeground(Color.ORANGE);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(159, 275, 53, 30);
		SciCalculator.getContentPane().add(button_3);

		Button button_4 = new Button("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "4";
				textField.setText(temp);
			}
		});
		button_4.setForeground(Color.ORANGE);
		button_4.setBackground(Color.GRAY);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_4.setBounds(10, 311, 53, 30);
		SciCalculator.getContentPane().add(button_4);

		Button button_5 = new Button("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "5";
				textField.setText(temp);
			}
		});
		button_5.setBackground(Color.GRAY);
		button_5.setForeground(Color.ORANGE);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_5.setBounds(86, 311, 53, 30);
		SciCalculator.getContentPane().add(button_5);

		Button button_6 = new Button("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "6";
				textField.setText(temp);
			}
		});
		button_6.setForeground(Color.ORANGE);
		button_6.setBackground(Color.GRAY);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_6.setBounds(159, 311, 53, 30);
		SciCalculator.getContentPane().add(button_6);

		Button button_7 = new Button("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "7";
				textField.setText(temp);
			}
		});
		button_7.setBackground(Color.GRAY);
		button_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_7.setForeground(Color.ORANGE);
		button_7.setBounds(10, 347, 53, 30);
		SciCalculator.getContentPane().add(button_7);

		Button button_8 = new Button("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "8";
				textField.setText(temp);
			}
		});
		button_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_8.setBackground(Color.GRAY);
		button_8.setForeground(Color.ORANGE);
		button_8.setBounds(86, 347, 53, 30);
		SciCalculator.getContentPane().add(button_8);

		Button button_9 = new Button("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "9";
				textField.setText(temp);
			}
		});
		button_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_9.setBackground(Color.GRAY);
		button_9.setForeground(Color.ORANGE);
		button_9.setBounds(159, 347, 53, 30);
		SciCalculator.getContentPane().add(button_9);

		Button button_Add = new Button("+");
		button_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "+";
				textField.setText("");
			}
		});
		button_Add.setBackground(new Color(255, 255, 0));
		button_Add.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Add.setBounds(10, 239, 53, 30);
		SciCalculator.getContentPane().add(button_Add);

		Button button_Sub = new Button("-");
		button_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "-";
				textField.setText("");
			}
		});
		button_Sub.setBackground(new Color(255, 255, 0));
		button_Sub.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Sub.setBounds(86, 239, 53, 30);
		SciCalculator.getContentPane().add(button_Sub);

		Button button_Div = new Button("\u00F7");
		button_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "/";
				textField.setText("");
			}
		});
		button_Div.setBackground(new Color(255, 255, 0));
		button_Div.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Div.setBounds(159, 239, 53, 30);
		SciCalculator.getContentPane().add(button_Div);

		Button button_0 = new Button("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "0";
				textField.setText(temp);
			}
		});
		button_0.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_0.setBackground(Color.GRAY);
		button_0.setForeground(Color.ORANGE);
		button_0.setBounds(86, 383, 53, 30);
		SciCalculator.getContentPane().add(button_0);

		Button button_Mul = new Button("\u00D7");
		button_Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "*";
				textField.setText("");
			}
		});
		button_Mul.setBackground(new Color(255, 255, 0));
		button_Mul.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Mul.setBounds(232, 239, 53, 30);
		SciCalculator.getContentPane().add(button_Mul);

		Button button_Equal = new Button("=");
		button_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNo = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstNo + secondNo;
					textField.setText(result + "");
				} else if (operation == "-") {
					result = firstNo - secondNo;
					textField.setText(result + "");
				} else if (operation == "/") {
					result = firstNo / secondNo;
					textField.setText(result + "");
				} else if (operation == "*") {
					result = firstNo * secondNo;
					textField.setText(result + "");
				} else if (operation == "%") {
					result = (firstNo * 100) / secondNo;
					textField.setText(result + "");
				} else if (operation == "pow") {
					Double power = Math.pow(firstNo, secondNo);
					textField.setText(power + "");
				}

			}
		});
		button_Equal.setBackground(Color.GREEN);
		button_Equal.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Equal.setBounds(232, 347, 53, 66);
		SciCalculator.getContentPane().add(button_Equal);

		Button button_AC = new Button("AC");
		button_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operation = "";
			}
		});
		button_AC.setBackground(Color.RED);
		button_AC.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_AC.setBounds(232, 311, 53, 30);
		SciCalculator.getContentPane().add(button_AC);

		Button button_00 = new Button("00");
		button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "00";
				textField.setText(temp);
			}
		});
		button_00.setForeground(Color.ORANGE);
		button_00.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_00.setBackground(Color.GRAY);
		button_00.setBounds(10, 383, 53, 30);
		SciCalculator.getContentPane().add(button_00);

		Button button_Dot = new Button("\u00B7");
		button_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + ".";
				textField.setText(temp);
			}
		});
		button_Dot.setForeground(Color.ORANGE);
		button_Dot.setFont(new Font("Dialog", Font.PLAIN, 40));
		button_Dot.setBackground(Color.GRAY);
		button_Dot.setBounds(159, 383, 53, 30);
		SciCalculator.getContentPane().add(button_Dot);

		Button button_sin = new Button("sin");
		button_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.sin(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_sin.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_sin.setBackground(Color.CYAN);
		button_sin.setBounds(10, 97, 53, 30);
		SciCalculator.getContentPane().add(button_sin);

		Button button_cos = new Button("cos");
		button_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.cos(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_cos.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_cos.setBackground(Color.CYAN);
		button_cos.setBounds(86, 97, 53, 30);
		SciCalculator.getContentPane().add(button_cos);

		Button button_tan = new Button("tan");
		button_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.tan(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_tan.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_tan.setBackground(Color.CYAN);
		button_tan.setBounds(159, 97, 53, 30);
		SciCalculator.getContentPane().add(button_tan);

		Button button_sinh = new Button("sinh");
		button_sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.sinh(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_sinh.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_sinh.setBackground(Color.CYAN);
		button_sinh.setBounds(10, 133, 53, 30);
		SciCalculator.getContentPane().add(button_sinh);

		Button button_cosh = new Button("cosh");
		button_cosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.cosh(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_cosh.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_cosh.setBackground(Color.CYAN);
		button_cosh.setBounds(86, 133, 53, 30);
		SciCalculator.getContentPane().add(button_cosh);

		Button button_tanh = new Button("tanh");
		button_tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.tanh(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_tanh.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_tanh.setBackground(Color.CYAN);
		button_tanh.setBounds(159, 133, 53, 30);
		SciCalculator.getContentPane().add(button_tanh);

		Button button_Add_2 = new Button("x^2");
		button_Add_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.pow(firstNo, 2);
					textField.setText("" + calc);
				}
			}
		});
		button_Add_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Add_2.setBackground(new Color(255, 153, 0));
		button_Add_2.setBounds(10, 169, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2);

		Button button_Add_2_1 = new Button("x^3");
		button_Add_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.pow(firstNo, 3);
					textField.setText("" + calc);
				}
			}
		});
		button_Add_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Add_2_1.setBackground(new Color(255, 153, 0));
		button_Add_2_1.setBounds(86, 169, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2_1);

		Button button_Add_2_2 = new Button("x^n");
		button_Add_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "pow";
				textField.setText("");
			}
		});
		button_Add_2_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Add_2_2.setBackground(new Color(255, 153, 0));
		button_Add_2_2.setBounds(159, 169, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2_2);

		Button button_Add_2_3 = new Button("1/x");
		button_Add_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = 1 / firstNo;
					textField.setText("" + calc);
				}
			}
		});
		button_Add_2_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Add_2_3.setBackground(new Color(255, 153, 0));
		button_Add_2_3.setBounds(10, 205, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2_3);

		Button button_Add_2_5 = new Button("x^(1/3)");
		button_Add_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.cbrt(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_Add_2_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		button_Add_2_5.setBackground(new Color(255, 153, 0));
		button_Add_2_5.setBounds(159, 205, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2_5);

		Button button_Exp = new Button("exp");
		button_Exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.exp(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_Exp.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_Exp.setBackground(Color.CYAN);
		button_Exp.setBounds(232, 133, 53, 30);
		SciCalculator.getContentPane().add(button_Exp);

		Button button_Add_2_2_1 = new Button("\u221Ax");
		button_Add_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.sqrt(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_Add_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Add_2_2_1.setBackground(new Color(255, 153, 0));
		button_Add_2_2_1.setBounds(86, 203, 53, 30);
		SciCalculator.getContentPane().add(button_Add_2_2_1);

		Button button_log = new Button("log");
		button_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double calc = Math.log(firstNo);
					textField.setText("" + calc);
				}
			}
		});
		button_log.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_log.setBackground(Color.CYAN);
		button_log.setBounds(232, 97, 53, 30);
		SciCalculator.getContentPane().add(button_log);

		Button button_DEL = new Button("DEL");
		button_DEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					StringBuilder toDelete = new StringBuilder(textField.getText());
					toDelete.deleteCharAt(textField.getText().length() - 1);
					String toSet = toDelete.toString();
					textField.setText(toSet);
				}
			}
		});
		button_DEL.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_DEL.setBackground(Color.RED);
		button_DEL.setBounds(232, 275, 53, 30);
		SciCalculator.getContentPane().add(button_DEL);

		Button button_Fact = new Button("!x");
		button_Fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					firstNo = Double.parseDouble(textField.getText());
					double i, sum = 1;
					for (i = 2; i <= firstNo; i += 1) {
						sum *= i;
					}
					Double calc = sum;
					textField.setText("" + calc);
				}
			}
		});
		button_Fact.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_Fact.setBackground(new Color(255, 153, 0));
		button_Fact.setBounds(232, 169, 53, 30);
		SciCalculator.getContentPane().add(button_Fact);

		Button button_Perc = new Button("%");
		button_Perc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "%";
				textField.setText("");
			}
		});
		button_Perc.setFont(new Font("Dialog", Font.PLAIN, 18));
		button_Perc.setBackground(new Color(255, 255, 0));
		button_Perc.setBounds(232, 205, 53, 30);
		SciCalculator.getContentPane().add(button_Perc);

		Button button_MR = new Button("MR");
		button_MR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("" + memory);
			}
		});
		button_MR.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_MR.setBackground(new Color(204, 153, 255));
		button_MR.setBounds(10, 61, 53, 30);
		SciCalculator.getContentPane().add(button_MR);

		Button button_MC = new Button("MC");
		button_MC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory = 0;
				textField.setText("");
			}
		});
		button_MC.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_MC.setBackground(new Color(204, 153, 255));
		button_MC.setBounds(86, 61, 53, 30);
		SciCalculator.getContentPane().add(button_MC);

		Button button_mPlus = new Button("M+");
		button_mPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (memCheck == 1) {
					memory = Double.parseDouble(textField.getText());
					memCheck++;
				} else {
					memory += Double.parseDouble(textField.getText());
					textField.setText("" + memory);
				}
			}
		});
		button_mPlus.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_mPlus.setBackground(new Color(204, 153, 255));
		button_mPlus.setBounds(159, 61, 53, 30);
		SciCalculator.getContentPane().add(button_mPlus);

		Button button_mMinus = new Button("M-");
		button_mMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (memCheck == 1) {
					memory = Double.parseDouble(textField.getText());
					memCheck++;
				} else {
					memory -= Double.parseDouble(textField.getText());
					textField.setText("" + memory);
				}

			}
		});
		button_mMinus.setFont(new Font("Dialog", Font.PLAIN, 22));
		button_mMinus.setBackground(new Color(204, 153, 255));
		button_mMinus.setBounds(232, 61, 53, 30);
		SciCalculator.getContentPane().add(button_mMinus);
	}
}
