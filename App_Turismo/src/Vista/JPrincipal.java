package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotor;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JPasswordField txtContraseña;
	private JButton btnIniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
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
	public JPrincipal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 134, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(269, 44, 164, 40);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(269, 116, 164, 41);
		contentPane.add(txtContraseña);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		lblNewLabel.setBounds(147, 47, 112, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(135, 119, 112, 27);
		contentPane.add(lblNewLabel_1);
		
		btnIniciar = new JButton("Acceder");
		btnIniciar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Promotor cr = new Promotor();
				cr.Acceso(Integer.parseInt(txtDocumento.getText()), txtContraseña.getText());
			}
		});
		btnIniciar.setBounds(253, 211, 112, 23);
		contentPane.add(btnIniciar);
		
		JButton btnUsuario = new JButton("New button");
		btnUsuario.setBackground(new Color(230, 230, 250));
		btnUsuario.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666609_user_icon.png"));
		btnUsuario.setBounds(39, 28, 65, 61);
		contentPane.add(btnUsuario);
		
		JButton btnPassword = new JButton("New button");
		btnPassword.setBackground(new Color(230, 230, 250));
		btnPassword.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666649_eye_off_iconContraseña.png"));
		btnPassword.setBounds(36, 100, 76, 61);
		contentPane.add(btnPassword);
		
		JButton btnAcceder = new JButton("New button");
		btnAcceder.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666628_user_check_iconACCEDER.png"));
		btnAcceder.setBounds(182, 193, 65, 59);
		contentPane.add(btnAcceder);
	}
}
