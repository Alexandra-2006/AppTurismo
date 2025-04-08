package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;
import Model.TiposMedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtObservaciones;
	private JTextField txtIdTiposMedios;
	private JTextField txtIdMedios;
	Medios cr = new Medios();
	private JTextField txtConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMedios frame = new JMedios();
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
	public JMedios() {
		setBackground(new Color(210, 105, 30));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 232, 170));
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.addMouseListener(new MouseAdapter() {
		
		});
		txtNombres.setBounds(58, 58, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(34, 121, 171, 84);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtIdTiposMedios = new JTextField();
		txtIdTiposMedios.setBounds(288, 58, 86, 20);
		contentPane.add(txtIdTiposMedios);
		txtIdTiposMedios.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(63, 33, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Observaciones");
		lblNewLabel_3.setBounds(58, 96, 93, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Id Tipos Medios");
		lblNewLabel_1.setBounds(278, 36, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create (txtNombres.getText(), txtObservaciones.getText(),  Integer.parseInt((txtIdTiposMedios.getText())));
			}
		});
		btnRegistrar.setBounds(138, 255, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 255, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Gestión de Medios");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNewLabel.setBounds(155, 11, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Id Medios");
		lblNewLabel_4.setBounds(288, 121, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		txtIdMedios = new JTextField();
		txtIdMedios.setBounds(278, 153, 86, 20);
		contentPane.add(txtIdMedios);
		txtIdMedios.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(210, 105, 30));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 cr.delete(Integer.parseInt(txtIdMedios.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(288, 184, 89, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Consultar");
		lblNewLabel_5.setBounds(28, 325, 71, 14);
		contentPane.add(lblNewLabel_5);
		
		txtConsultar = new JTextField();
		txtConsultar.addMouseListener(new MouseAdapter() {

		});
		txtConsultar.setBounds(119, 322, 86, 20);
		contentPane.add(txtConsultar);
		txtConsultar.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.readOne(Integer.parseInt(txtConsultar.getText()), txtNombres, txtObservaciones, txtIdTiposMedios);
			}
		});
		btnNewButton_1.setBackground(new Color(222, 184, 135));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnNewButton_1.setBounds(227, 310, 61, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		      cr.Update(Integer.parseInt(txtConsultar.getText()),txtNombres.getText(), txtObservaciones.getText(),  Integer.parseInt(txtIdTiposMedios.getText()));
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnNewButton_2.setBounds(309, 310, 71, 45);
		contentPane.add(btnNewButton_2);
		

		
	}
}
