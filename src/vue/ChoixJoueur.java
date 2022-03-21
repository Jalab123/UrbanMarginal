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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	private JTextField txfPseudo;

	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFond = new JLabel("");
		lblFond.setIcon(new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg")));
		lblFond.setBounds(0, 0, 434, 282);
		contentPane.add(lblFond);
		
		txfPseudo = new JTextField();
		txfPseudo.setBounds(143, 250, 118, 15);
		contentPane.add(txfPseudo);
		txfPseudo.setColumns(10);
		
		JButton btnGauche = new JButton("New button");
		btnGauche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("précédent");
			}
		});
		btnGauche.setBounds(58, 147, 53, 49);
		contentPane.add(btnGauche);
		
		JButton btnDroite = new JButton("New button");
		btnDroite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("suivant");
			}
		});
		btnDroite.setBounds(284, 147, 53, 49);
		contentPane.add(btnDroite);
		
		JButton btnGo = new JButton("New button");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("GO");
			}
		});
		btnGo.setBounds(318, 207, 53, 49);
		contentPane.add(btnGo);
	}

}
