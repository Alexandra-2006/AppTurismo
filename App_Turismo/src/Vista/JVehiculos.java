package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Vehiculos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAño;
	private JTextField txtCapacidad;
	private JTextField txtId_Transporte;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtNumeroMotor;
	private JTextField txtPlaca;
	private JTextField txtEstado;
	private JTextField txtCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVehiculos frame = new JVehiculos();
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
	public JVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAño = new JTextField();
		txtAño.setBounds(254, 42, 86, 20);
		contentPane.add(txtAño);
		txtAño.setColumns(10);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(254, 85, 86, 20);
		contentPane.add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		txtId_Transporte = new JTextField();
		txtId_Transporte.setBounds(254, 141, 86, 20);
		contentPane.add(txtId_Transporte);
		txtId_Transporte.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(254, 189, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(254, 246, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtNumeroMotor = new JTextField();
		txtNumeroMotor.setBounds(254, 352, 86, 20);
		contentPane.add(txtNumeroMotor);
		txtNumeroMotor.setColumns(10);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(254, 409, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Año");
		lblNewLabel.setBounds(83, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Capacidad");
		lblNewLabel_1.setBounds(83, 88, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Transporte");
		lblNewLabel_2.setBounds(84, 144, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setBounds(83, 192, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo");
		lblNewLabel_4.setBounds(97, 249, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numero de Motor");
		lblNewLabel_5.setBounds(83, 355, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Placa");
		lblNewLabel_6.setBounds(97, 412, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gestión de Vehículos");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(147, 11, 196, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculos cr = new Vehiculos();
				
				cr.create(txtPlaca.getText(),txtMarca.getText(), Integer.parseInt(txtAño.getText()), txtNumeroMotor.getText(),  Integer.parseInt(txtCapacidad.getText()),  txtModelo.getText(), txtEstado.getText(),  Integer.parseInt(txtId_Transporte.getText()), txtCategoria.getText());
				
			}
		});
		btnNewButton.setBounds(180, 524, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Estado");
		lblNewLabel_8.setBounds(97, 309, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(254, 306, 86, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Categoría");
		lblNewLabel_9.setBounds(97, 459, 100, 14);
		contentPane.add(lblNewLabel_9);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(257, 456, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
	}
}
