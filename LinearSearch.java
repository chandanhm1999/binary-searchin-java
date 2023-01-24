import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearch extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
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
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setBounds(145, 24, 173, 20);
		heading.setForeground(new Color(64, 0, 0));
		heading.setFont(new Font("Colonna MT", Font.BOLD, 18));
		contentPane.add(heading);
		
		JLabel la = new JLabel("Enter 5 Numbers");
		la.setForeground(new Color(0, 0, 0));
		la.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		la.setBounds(66, 71, 101, 18);
		contentPane.add(la);
		
		JLabel lb = new JLabel("Enter Key To Search\r\n");
		lb.setForeground(Color.BLACK);
		lb.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lb.setBounds(66, 119, 123, 18);
		contentPane.add(lb);
		
		tf1 = new JTextField();
		tf1.setBounds(223, 72, 96, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(223, 120, 96, 19);
		contentPane.add(tf2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblResult.setBounds(93, 162, 74, 18);
		contentPane.add(lblResult);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(223, 163, 113, 19);
		contentPane.add(res);
		
		JButton search = new JButton("Linear Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			// Linear Search code
				String s = tf1.getText();
				String arr[] = s.split(" ");
				String key = tf2.getText();
				for (int i = 0; i <= arr.length-1; i++) {
					if(Integer.valueOf(key) == Integer.valueOf(arr[i]))
					{
						res.setText("search success key @"+i);
						return;
					}
				}
				res.setText("key not found");
			}
		});
		search.setForeground(new Color(0, 64, 0));
		search.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		search.setBackground(new Color(0, 128, 0));
		search.setBounds(128, 206, 162, 29);
		contentPane.add(search);
	}
}
