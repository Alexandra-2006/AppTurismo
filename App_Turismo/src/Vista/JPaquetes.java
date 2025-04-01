package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Paquetes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFechaEjecucion;
	private JTextField txtFechaVenta;
	private JTextField txtHoraSalida;
	private JTextField txtHoraVenta;
	private JTextField txtId_Agencias;
	private JTextField txtId_Destino;
	private JTextField txtId_Medios;
	private JTextField txtId_Origen;
	private JTextField txtId_Vehiculo;
	private JTextField txtIdPromotores;
	private JTextField txtObservaciones;
	private JTextField txtPrecio;
	private JTextField txtIdClientes;
	private JTextField txtCodigo;
	Paquetes cr = new Paquetes ();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaquetes frame = new JPaquetes();
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
	public JPaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 730);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFechaEjecucion = new JTextField();
		txtFechaEjecucion.setBounds(315, 90, 86, 20);
		contentPane.add(txtFechaEjecucion);
		txtFechaEjecucion.setColumns(10);
		
		txtFechaVenta = new JTextField();
		txtFechaVenta.setBounds(30, 69, 86, 20);
		contentPane.add(txtFechaVenta);
		txtFechaVenta.setColumns(10);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setBounds(315, 146, 86, 20);
		contentPane.add(txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setBounds(30, 146, 86, 20);
		contentPane.add(txtHoraVenta);
		txtHoraVenta.setColumns(10);
		
		txtId_Agencias = new JTextField();
		txtId_Agencias.setBounds(315, 200, 86, 20);
		contentPane.add(txtId_Agencias);
		txtId_Agencias.setColumns(10);
		
		txtId_Destino = new JTextField();
		txtId_Destino.setBounds(30, 215, 86, 20);
		contentPane.add(txtId_Destino);
		txtId_Destino.setColumns(10);
		
		txtId_Medios = new JTextField();
		txtId_Medios.setBounds(315, 333, 86, 20);
		contentPane.add(txtId_Medios);
		txtId_Medios.setColumns(10);
		
		txtId_Origen = new JTextField();
		txtId_Origen.setBounds(30, 264, 86, 20);
		contentPane.add(txtId_Origen);
		txtId_Origen.setColumns(10);
		
		txtId_Vehiculo = new JTextField();
		txtId_Vehiculo.setBounds(315, 412, 86, 20);
		contentPane.add(txtId_Vehiculo);
		txtId_Vehiculo.setColumns(10);
		
		txtIdPromotores = new JTextField();
		txtIdPromotores.setBounds(30, 332, 86, 23);
		contentPane.add(txtIdPromotores);
		txtIdPromotores.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(30, 423, 86, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(30, 526, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de Ejecución");
		lblNewLabel_1.setBounds(304, 65, 136, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Venta");
		lblNewLabel_2.setBounds(20, 44, 144, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de Salida");
		lblNewLabel_3.setBounds(315, 121, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hora de Venta");
		lblNewLabel_4.setBounds(30, 118, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Id Agencias");
		lblNewLabel_5.setBounds(326, 175, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Id Destino");
		lblNewLabel_6.setBounds(45, 190, 75, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Id Medios");
		lblNewLabel_7.setBounds(325, 308, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id Origen");
		lblNewLabel_8.setBounds(40, 246, 97, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Id Vehículo");
		lblNewLabel_9.setBounds(326, 373, 75, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("idPromotores");
		lblNewLabel_10.setBounds(45, 307, 75, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(50, 398, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Observaciones");
		lblNewLabel_13.setBounds(30, 373, 108, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Precio");
		lblNewLabel_14.setBounds(41, 486, 75, 14);
		contentPane.add(lblNewLabel_14);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			cr.create(Integer.parseInt(txtId_Destino.getText()), Integer.parseInt(txtId_Origen.getText()), txtFechaVenta.getText(), txtHoraVenta.getText(), txtHoraSalida.getText(), txtFechaEjecucion.getText(),
					txtObservaciones.getText(), Integer.parseInt(txtId_Medios.getText()), Integer.parseInt(txtId_Agencias.getText()), Integer.parseInt(txtIdClientes.getText()), Integer.parseInt(txtIdPromotores.getText()),
							Integer.parseInt(txtId_Vehiculo.getText()), txtPrecio.getText());
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(45, 606, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Gestión de Paquetes");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 0, 191, 34);
		contentPane.add(lblNewLabel);
		
		txtIdClientes = new JTextField();
		txtIdClientes.setBounds(315, 264, 86, 20);
		contentPane.add(txtIdClientes);
		txtIdClientes.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("IdClientes");
		lblNewLabel_15.setBounds(325, 239, 86, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_11 = new JLabel("Código");
		lblNewLabel_11.setBounds(279, 500, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(253, 526, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 cr.delete(Integer.parseInt(txtCodigo.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(263, 575, 89, 50);
		contentPane.add(btnNewButton);
	}
}
