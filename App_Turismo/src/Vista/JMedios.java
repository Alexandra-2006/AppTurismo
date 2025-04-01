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

public class JMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtObservaciones;
	private JTextField txtIdTiposMedios;
	private JTextField txtIdMedios;
	Medios cr = new Medios();

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
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 529);
		contentPane = new JPanel();
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
		txtIdTiposMedios.setBounds(58, 272, 86, 20);
		contentPane.add(txtIdTiposMedios);
		txtIdTiposMedios.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(63, 33, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Observaciones");
		lblNewLabel_3.setBounds(58, 96, 93, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Id Tipos Medios");
		lblNewLabel_1.setBounds(58, 236, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create (txtNombres.getText(), txtObservaciones.getText(),  Integer.parseInt((txtIdTiposMedios.getText())));
			}
		});
		btnRegistrar.setBounds(131, 342, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 342, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Gestión de Medios");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNewLabel.setBounds(155, 11, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Id Medios");
		lblNewLabel_4.setBounds(307, 236, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtIdMedios = new JTextField();
		txtIdMedios.setBounds(290, 261, 86, 20);
		contentPane.add(txtIdMedios);
		txtIdMedios.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 cr.delete(Integer.parseInt(txtIdMedios.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(300, 366, 89, 57);
		contentPane.add(btnNewButton);
		

		
	}
}
