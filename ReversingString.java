import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReversingString extends JFrame {

	private JPanel heading;
	private JTextField tf1;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReversingString frame = new ReversingString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReversingString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		heading = new JPanel();
		heading.setBackground(new Color(0, 64, 64));
		heading.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(heading);
		heading.setLayout(null);
		
		JLabel lblBinarySearch = new JLabel("Reverse String");
		lblBinarySearch.setForeground(new Color(255, 255, 255));
		lblBinarySearch.setFont(new Font("Colonna MT", Font.BOLD, 18));
		lblBinarySearch.setBounds(138, 25, 121, 20);
		heading.add(lblBinarySearch);
		
		JLabel lblEnterAString = new JLabel("Enter a String\r\n");
		lblEnterAString.setForeground(new Color(255, 255, 255));
		lblEnterAString.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblEnterAString.setBounds(59, 69, 101, 18);
		heading.add(lblEnterAString);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(215, 70, 96, 19);
		heading.add(tf1);
		
		JButton btnBinarySearch = new JButton("Reverse String");
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Reverse String codeing
				String s=tf1.getText();
				char arr[]=s.toCharArray();
				char arr1[]=new char[arr.length];
				int j=arr1.length-1;
				for (int i = 0; i < arr1.length; i++) {
				arr1[j]=arr[i];
				j--;
				}
				s=new String(arr1);
				res.setText(s);
			}
		});
		btnBinarySearch.setForeground(Color.BLACK);
		btnBinarySearch.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		btnBinarySearch.setBackground(new Color(0, 128, 0));
		btnBinarySearch.setBounds(138, 124, 162, 29);
		heading.add(btnBinarySearch);
		
		JLabel lblReversedString = new JLabel("Reversed String\r\n");
		lblReversedString.setForeground(new Color(255, 255, 255));
		lblReversedString.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblReversedString.setBounds(59, 190, 115, 18);
		heading.add(lblReversedString);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(216, 191, 113, 19);
		heading.add(res);
	}

}
