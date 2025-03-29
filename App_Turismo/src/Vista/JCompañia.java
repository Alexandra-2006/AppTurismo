package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCorreo;
	private JTextField txtFechaCreacion;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JTextField txtDireccion;
	private JLabel lblNewLabel_3;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCompañia frame = new JCompañia();
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
	public JCompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 731);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
		
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(141, 220, 125, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtFechaCreacion = new JTextField();
		txtFechaCreacion.setBounds(154, 398, 86, 20);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(141, 309, 133, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(154, 510, 112, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(177, 180, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dirección");
		lblNewLabel_1.setBounds(158, 112, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Creación");
		lblNewLabel_2.setBounds(161, 365, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setBounds(158, 55, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setBounds(177, 270, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Web");
		lblNewLabel_6.setBounds(187, 467, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Compañia cr = new Compañia();
				cr.create(txtNombre.getText(),txtDireccion.getText(), txtTelefono.getText(),  txtCorreo.getText(),txtFechaCreacion.getText(), txtWeb.getText());
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
		});
		btnGuardar.setBounds(161, 565, 89, 49);
		contentPane.add(btnGuardar);
		
		
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(141, 149, 115, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Gestión de Compañías");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(111, 11, 231, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(137, 80, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
	}
}
