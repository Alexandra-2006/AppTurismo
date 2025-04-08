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
import java.awt.Color;
import javax.swing.JComboBox;

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
	private JTextField txtConsultar;
	private JButton btnActualizar;

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
		setBounds(100, 100, 626, 731);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.addMouseListener(new MouseAdapter() {

		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(330, 186, 125, 34);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		txtFechaCreacion = new JTextField();
		txtFechaCreacion.setBounds(330, 309, 142, 34);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(330, 243, 133, 34);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);

		txtWeb = new JTextField();
		txtWeb.setBounds(330, 381, 142, 34);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);

		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(85, 194, 86, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dirección");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(72, 115, 133, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Fecha de Creación");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(61, 307, 199, 34);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(80, 55, 112, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(85, 245, 86, 27);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Web");
		lblNewLabel_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(108, 379, 63, 14);
		contentPane.add(lblNewLabel_6);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(240, 248, 255));
		btnGuardar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.create(txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(),
						txtFechaCreacion.getText(), txtWeb.getText());

			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}

		});
		btnGuardar.setBounds(118, 624, 112, 49);
		contentPane.add(btnGuardar);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(327, 107, 128, 34);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		lblNewLabel_3 = new JLabel("Gestión de Compañías");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(172, -5, 308, 49);
		contentPane.add(lblNewLabel_3);

		txtNombre = new JTextField();
		txtNombre.setBounds(327, 47, 125, 34);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		lblNewLabel_7 = new JLabel("Id Compañia");
		lblNewLabel_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(98, 459, 107, 27);
		contentPane.add(lblNewLabel_7);

		txtIdCompañia = new JTextField();
		txtIdCompañia.setBounds(338, 457, 142, 34);
		contentPane.add(txtIdCompañia);
		txtIdCompañia.setColumns(10);

		btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.delete(Integer.parseInt(txtIdCompañia.getText()));
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(511, 446, 89, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Consultar");
		lblNewLabel_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(98, 535, 97, 14);
		contentPane.add(lblNewLabel_8);
		
		txtConsultar = new JTextField();
		txtConsultar.setBounds(238, 534, 86, 20);
		contentPane.add(txtConsultar);
		txtConsultar.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.readOne(Integer.parseInt(txtConsultar.getText()), txtNombre, txtDireccion, txtTelefono, txtCorreo, txtFechaCreacion, txtWeb);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnNewButton_1.setBounds(330, 525, 60, 34);
		contentPane.add(btnNewButton_1);
		
		btnActualizar = new JButton("New button");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtConsultar.getText()), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(),
						txtFechaCreacion.getText(), txtWeb.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(330, 570, 73, 49);
		contentPane.add(btnActualizar);

	}
}
