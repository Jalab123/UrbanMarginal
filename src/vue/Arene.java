package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Arene extends JFrame {

	private JPanel contentPane;
	private JTextField txfChatClient;

	/**
	 * Create the frame.
	 */
	public Arene() {
		this.getContentPane().setPreferredSize(new Dimension(800, 600));
		this.pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 828);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFond = new JLabel("");
		lblFond.setIcon(new ImageIcon(Arene.class.getResource("/fonds/fondarene.jpg")));
		lblFond.setBounds(0, -16, 800, 629);
		contentPane.add(lblFond);
		
		txfChatClient = new JTextField();
		txfChatClient.setBounds(0, 598, 800, 20);
		contentPane.add(txfChatClient);
		txfChatClient.setColumns(10);
		
		JTextPane txpChatServeur = new JTextPane();
		txpChatServeur.setBounds(0, 619, 800, 170);
		contentPane.add(txpChatServeur);
	}
}
