import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField txtTest;

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnTest.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							btnTest_clic();
						}
					});
			}
		});
		btnTest.setBounds(10, 11, 89, 23);
		contentPane.add(btnTest);
		
		txtTest = new JTextField();
		txtTest.setBounds(10, 45, 86, 20);
		contentPane.add(txtTest);
		txtTest.setColumns(10);
	}
	
	/**
	 * Clic sur le bouton btnTest
	 */
	private void btnTest_clic() {
		txtTest.setText("Hello World !");
	}
}
