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

public class BinarySearch extends JFrame {

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
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBinarySearch = new JLabel("BINARY SEARCH");
		lblBinarySearch.setForeground(new Color(64, 0, 0));
		lblBinarySearch.setFont(new Font("Colonna MT", Font.BOLD, 18));
		lblBinarySearch.setBounds(125, 10, 173, 20);
		contentPane.add(lblBinarySearch);
		
		JLabel la = new JLabel("Enter 5 Numbers");
		la.setForeground(Color.BLACK);
		la.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		la.setBounds(50, 67, 101, 18);
		contentPane.add(la);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(202, 68, 96, 19);
		contentPane.add(tf1);
		
		JLabel lb = new JLabel("Enter Key To Search\r\n");
		lb.setForeground(Color.BLACK);
		lb.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lb.setBounds(50, 113, 123, 18);
		contentPane.add(lb);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(202, 114, 96, 19);
		contentPane.add(tf2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblResult.setBounds(77, 161, 74, 18);
		contentPane.add(lblResult);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(202, 162, 113, 19);
		contentPane.add(res);
		
		JButton btnBinarySearch = new JButton("Binary Search");
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// BinarySearch codes!
				String s = tf1.getText();
				String arr[] = s.split(" ");
				String key = tf2.getText();
				int low = 0;
				int high = arr.length-1;
				while(low<=high)
				{
					int mid=(low+high)/2;
					if(Integer.valueOf(key).intValue()==Integer.valueOf(arr[mid]).intValue())
					{
						res.setText("key found at"+mid);
						return;
					}
					else if(Integer.valueOf(key).intValue() > Integer.valueOf(arr[mid]).intValue())
					{
						low=mid+1;
						high=high;
					}
					else
					{
						high=mid+1;
						low=low;
					}
				}
				res.setText("Key not found");
			}
		});
		btnBinarySearch.setForeground(new Color(0, 0, 0));
		btnBinarySearch.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		btnBinarySearch.setBackground(new Color(0, 128, 0));
		btnBinarySearch.setBounds(125, 209, 162, 29);
		contentPane.add(btnBinarySearch);
	}

}
