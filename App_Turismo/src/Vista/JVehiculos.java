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
import javax.swing.ImageIcon;
import java.awt.Color;

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
	private JTextField txtIdVehiculo;
	Vehiculos cr = new Vehiculos();
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
		setForeground(new Color(210, 180, 140));
		setBackground(new Color(210, 180, 140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
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
		txtPlaca.setBounds(254, 394, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Año");
		lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 17));
		lblNewLabel.setBounds(83, 42, 60, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Capacidad");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblNewLabel_1.setBounds(69, 84, 114, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Transporte");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(69, 138, 126, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(83, 186, 100, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblNewLabel_4.setBounds(83, 242, 86, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numero de Motor");
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(48, 344, 169, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Placa");
		lblNewLabel_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(97, 393, 88, 17);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gestión de Vehículos");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(220, 11, 196, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon (1)guardar.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.create(txtPlaca.getText(),txtMarca.getText(),txtAño.getText(), txtNumeroMotor.getText(),  Integer.parseInt(txtCapacidad.getText()),  txtModelo.getText(), txtEstado.getText(),  Integer.parseInt(txtId_Transporte.getText()), txtCategoria.getText());
				
			}
		});
		btnNewButton.setBounds(555, 189, 67, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Estado");
		lblNewLabel_8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblNewLabel_8.setBounds(83, 296, 98, 35);
		contentPane.add(lblNewLabel_8);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(254, 306, 86, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Categoría");
		lblNewLabel_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(83, 434, 147, 35);
		contentPane.add(lblNewLabel_9);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(254, 444, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Id Vehículo");
		lblNewLabel_10.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_10.setBounds(419, 199, 126, 35);
		contentPane.add(lblNewLabel_10);
		
		txtIdVehiculo = new JTextField();
		txtIdVehiculo.setBounds(440, 240, 46, 32);
		contentPane.add(txtIdVehiculo);
		txtIdVehiculo.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtIdVehiculo.getText()));
			}
		});
		btnNewButton_1.setForeground(new Color(255, 250, 205));
		btnNewButton_1.setBackground(new Color(255, 250, 205));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton_1.setBounds(555, 287, 67, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnConsultar = new JButton("New button");
		btnConsultar.setBackground(new Color(255, 250, 205));
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdVehiculo.getText()), txtPlaca, txtMarca, txtAño, txtNumeroMotor, txtCapacidad, txtModelo, txtEstado, txtId_Transporte, txtCategoria);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnConsultar.setBounds(555, 236, 67, 41);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("New button");
		btnActualizar.setBackground(new Color(255, 250, 205));
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtIdVehiculo.getText()),txtPlaca.getText(),txtMarca.getText(),txtAño.getText(), txtNumeroMotor.getText(),  Integer.parseInt(txtCapacidad.getText()),  txtModelo.getText(), txtEstado.getText(),  Integer.parseInt(txtId_Transporte.getText()), txtCategoria.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(555, 352, 77, 45);
		contentPane.add(btnActualizar);
	}
}
