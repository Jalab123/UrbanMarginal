package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txfIP;

	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStart = new JLabel("Lancer un serveur:");
		lblStart.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStart.setBounds(5, 5, 116, 14);
		contentPane.add(lblStart);
		
		JLabel lblConnecter = new JLabel("Connecter \u00E0 un serveur existant:");
		lblConnecter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConnecter.setBounds(5, 24, 219, 14);
		contentPane.add(lblConnecter);
		
		JLabel lblIP = new JLabel("IP du serveur:");
		lblIP.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIP.setBounds(5, 44, 116, 14);
		contentPane.add(lblIP);
		
		JButton btnCommencer = new JButton("Commencer");
		btnCommencer.addActionListener(new ActionListener() {
			private Arene frmArene;

			public void actionPerformed(ActionEvent e) {
				dispose();
				this.frmArene = new Arene() ;
				this.frmArene.setVisible(true);
			}
		});
		btnCommencer.setBounds(294, 2, 116, 23);
		contentPane.add(btnCommencer);
		
		txfIP = new JTextField();
		txfIP.setText("127.0.0.1");
		txfIP.setBounds(116, 42, 108, 20);
		contentPane.add(txfIP);
		txfIP.setColumns(10);
		
		JButton btnConnecter = new JButton("Connecter");
		btnConnecter.addActionListener(new ActionListener() {
			private ChoixJoueur frmChoixJoueur;

			public void actionPerformed(ActionEvent e) {
				dispose();
				this.frmChoixJoueur = new ChoixJoueur() ;
				this.frmChoixJoueur.setVisible(true);
			}
		});
		btnConnecter.setBounds(294, 41, 116, 23);
		contentPane.add(btnConnecter);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(294, 75, 116, 23);
		contentPane.add(btnQuitter);
	}
}
