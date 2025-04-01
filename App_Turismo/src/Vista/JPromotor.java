package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtFechaNacimiento;
	private JTextField txtTipoIdentificación;
	private JTextField txtNumeroIdentificacion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtAlergias;
	private JTextField txtIdPromotor;
	Promotor cr = new Promotor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPromotor frame = new JPromotor();
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
	public JPromotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(250, 46, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(250, 89, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(250, 146, 86, 20);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(80, 49, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(80, 92, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_2.setBounds(60, 149, 149, 14);
		contentPane.add(lblNewLabel_2);
		
		txtTipoIdentificación = new JTextField();
		txtTipoIdentificación.setBounds(250, 204, 86, 20);
		contentPane.add(txtTipoIdentificación);
		txtTipoIdentificación.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de identificación");
		lblNewLabel_3.setBounds(41, 206, 168, 17);
		contentPane.add(lblNewLabel_3);
		
		txtNumeroIdentificacion = new JTextField();
		txtNumeroIdentificacion.setBounds(250, 267, 86, 20);
		contentPane.add(txtNumeroIdentificacion);
		txtNumeroIdentificacion.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número de identificación");
		lblNewLabel_4.setBounds(41, 267, 156, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(250, 318, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setBounds(62, 321, 107, 14);
		contentPane.add(lblNewLabel_5);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(250, 362, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(60, 365, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtAlergias = new JTextField();
		txtAlergias.setBounds(250, 404, 86, 20);
		contentPane.add(txtAlergias);
		txtAlergias.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Alergias");
		lblNewLabel_7.setBounds(60, 407, 66, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gestión de Promotores");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
		
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(105, 0, 217, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtTipoIdentificación.getText(), Integer.parseInt(txtNumeroIdentificacion.getText()), txtNombres.getText(), txtApellidos.getText(), txtCorreo.getText(), txtTelefono.getText(), txtFechaNacimiento.getText(),
						txtAlergias.getText());
				
			}
		});
		btnGuardar.setBounds(37, 464, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_9 = new JLabel("Id Promotor");
		lblNewLabel_9.setBounds(207, 454, 66, 14);
		contentPane.add(lblNewLabel_9);
		
		txtIdPromotor = new JTextField();
		txtIdPromotor.setBounds(199, 483, 86, 20);
		contentPane.add(txtIdPromotor);
		txtIdPromotor.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtIdPromotor.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(319, 454, 89, 60);
		contentPane.add(btnNewButton);
	}

}
