import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseWordSen extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWordSen frame = new ReverseWordSen();
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
	public ReverseWordSen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Reverse Words of Sentence");
		heading.setForeground(new Color(0, 128, 128));
		heading.setFont(new Font("Colonna MT", Font.BOLD, 20));
		heading.setBounds(141, 25, 243, 22);
		contentPane.add(heading);
		
		JLabel lblEnterASentence = new JLabel("Enter a Sentence");
		lblEnterASentence.setForeground(new Color(0, 64, 0));
		lblEnterASentence.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblEnterASentence.setBounds(58, 70, 111, 18);
		contentPane.add(lblEnterASentence);
		
		JLabel lblReversedSentence = new JLabel("Reversed Sentence");
		lblReversedSentence.setForeground(new Color(0, 64, 64));
		lblReversedSentence.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lblReversedSentence.setBounds(58, 172, 126, 18);
		contentPane.add(lblReversedSentence);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(217, 71, 146, 19);
		contentPane.add(tf1);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(217, 173, 146, 19);
		contentPane.add(res);
		
		JButton btnReverseSentence = new JButton("Reverse Sentence");
		btnReverseSentence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Reverse words strings
				String s=tf1.getText();
				String sarr[]=s.split(" ");
				String revsent=" ";
				for(int i=0;i<=sarr.length-1;i++)
				{
				String word=sarr[i];
				String revword=" ";
				for(int j=word.length()-1;j>=0;j--)
				{
				revword=revword+word.charAt(j);
				}
				revsent=revsent+revword+" ";
				}
				res.setText(revsent);

			}
		});
		btnReverseSentence.setForeground(Color.BLACK);
		btnReverseSentence.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		btnReverseSentence.setBackground(new Color(0, 128, 0));
		btnReverseSentence.setBounds(141, 115, 162, 29);
		contentPane.add(btnReverseSentence);
	}

}
