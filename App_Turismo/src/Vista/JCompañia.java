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
import javax.swing.ImageIcon;

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
	private JLabel lblNewLabel_7;
	private JTextField txtIdCompañia;
	private JButton btnNewButton;
	Compañia cr = new Compañia();
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
		txtCorreo.setBounds(242, 193, 125, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtFechaCreacion = new JTextField();
		txtFechaCreacion.setBounds(255, 316, 122, 20);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(234, 250, 133, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(255, 378, 112, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(60, 196, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dirección");
		lblNewLabel_1.setBounds(59, 117, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Creación");
		lblNewLabel_2.setBounds(46, 319, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setBounds(60, 57, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setBounds(57, 253, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Web");
		lblNewLabel_6.setBounds(76, 381, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
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
		txtDireccion.setBounds(252, 114, 115, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Gestión de Compañías");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(111, 11, 231, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(256, 54, 125, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Id Compañia");
		lblNewLabel_7.setBounds(76, 443, 78, 14);
		contentPane.add(lblNewLabel_7);
		
		txtIdCompañia = new JTextField();
		txtIdCompañia.setBounds(276, 440, 86, 20);
		contentPane.add(txtIdCompañia);
		txtIdCompañia.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			 cr.delete(Integer.parseInt(txtIdCompañia.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(288, 497, 89, 57);
		contentPane.add(btnNewButton);
		
	}
}
