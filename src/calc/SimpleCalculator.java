package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 * 
 * @author Bala Subramanyam Lanka
 * StudentID: 2014356
 *
 */

public class SimpleCalculator {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;
	private JLabel operand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 356, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(22, 11, 296, 103);
		frame.getContentPane().add(editorPane);

		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 9);
			}
		});
		btnNewButton.setBounds(22, 190, 66, 52);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 6);
			}
		});
		btnNewButton_1.setBounds(22, 254, 66, 52);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 3);
			}
		});
		btnNewButton_2.setBounds(22, 317, 66, 52);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 0);
			}
		});
		btnNewButton_3.setBounds(22, 382, 142, 52);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 8);
			}
		});
		btnNewButton_4.setBounds(98, 190, 66, 52);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 5);
			}
		});
		btnNewButton_5.setBounds(98, 254, 66, 52);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 2);
			}
		});
		btnNewButton_6.setBounds(98, 317, 66, 52);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 7);
			}
		});
		btnNewButton_8.setBounds(174, 190, 66, 52);
		frame.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 4);
			}
		});
		btnNewButton_9.setBounds(174, 254, 66, 52);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 1);
			}
		});
		btnNewButton_10.setBounds(174, 317, 66, 52);
		frame.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1 = Double.parseDouble(value1.getText());
				double op2 = Double.parseDouble(value2.getText());
				if (operand.getText().equals("ADD")) {
					value2.setText(String.valueOf(op1 + op2));
				} else if (operand.getText().equals("SUB")) {
					value2.setText(String.valueOf(op1 - op2));
				} else if (operand.getText().equals("MUL")) {
					value2.setText(String.valueOf(op1 * op2));
				} else {
					value2.setText(String.valueOf(op1 / op2));
				}
			}
		});
		btnNewButton_11.setBounds(174, 382, 66, 52);
		frame.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				operand.setText("SUB");
				value2.setText(null);
			}
		});
		btnNewButton_12.setBounds(252, 190, 66, 52);
		frame.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				operand.setText("ADD");
				value2.setText(null);
			}
		});
		btnNewButton_13.setBounds(250, 254, 66, 52);
		frame.getContentPane().add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				operand.setText("DIV");
				value2.setText(null);
			}
		});
		btnNewButton_14.setBounds(250, 317, 66, 52);
		frame.getContentPane().add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				operand.setText("MUL");
				value2.setText(null);
			}
		});
		btnNewButton_15.setBounds(252, 382, 66, 52);
		frame.getContentPane().add(btnNewButton_15);

		value2 = new JTextField();
		value2.setBounds(110, 76, 199, 32);
		frame.getContentPane().add(value2);
		value2.setColumns(10);

		value1 = new JTextField();
		value1.setBounds(33, 11, 276, 32);
		frame.getContentPane().add(value1);
		value1.setColumns(10);

		operand = new JLabel("");
		operand.setBounds(252, 136, 66, 43);
		frame.getContentPane().add(operand);

		JButton btnNewButton_15_1 = new JButton("C");
		btnNewButton_15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				operand.setText(null);
			}
		});
		btnNewButton_15_1.setBounds(22, 125, 66, 52);
		frame.getContentPane().add(btnNewButton_15_1);
	}
}
