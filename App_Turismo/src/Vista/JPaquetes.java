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
import java.awt.Color;

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
		setBounds(100, 100, 765, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 180, 140));
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFechaEjecucion = new JTextField();
		txtFechaEjecucion.setBounds(436, 102, 86, 33);
		contentPane.add(txtFechaEjecucion);
		txtFechaEjecucion.setColumns(10);
		
		txtFechaVenta = new JTextField();
		txtFechaVenta.setBounds(34, 108, 86, 20);
		contentPane.add(txtFechaVenta);
		txtFechaVenta.setColumns(10);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setBounds(436, 172, 86, 33);
		contentPane.add(txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setBounds(30, 185, 86, 20);
		contentPane.add(txtHoraVenta);
		txtHoraVenta.setColumns(10);
		
		txtId_Agencias = new JTextField();
		txtId_Agencias.setBounds(436, 251, 55, 33);
		contentPane.add(txtId_Agencias);
		txtId_Agencias.setColumns(10);
		
		txtId_Destino = new JTextField();
		txtId_Destino.setBounds(30, 255, 86, 20);
		contentPane.add(txtId_Destino);
		txtId_Destino.setColumns(10);
		
		txtId_Medios = new JTextField();
		txtId_Medios.setBounds(436, 322, 55, 33);
		contentPane.add(txtId_Medios);
		txtId_Medios.setColumns(10);
		
		txtId_Origen = new JTextField();
		txtId_Origen.setBounds(30, 322, 86, 20);
		contentPane.add(txtId_Origen);
		txtId_Origen.setColumns(10);
		
		txtId_Vehiculo = new JTextField();
		txtId_Vehiculo.setBounds(436, 451, 55, 34);
		contentPane.add(txtId_Vehiculo);
		txtId_Vehiculo.setColumns(10);
		
		txtIdPromotores = new JTextField();
		txtIdPromotores.setBounds(30, 411, 86, 23);
		contentPane.add(txtIdPromotores);
		txtIdPromotores.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(30, 486, 86, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(34, 562, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de Ejecución");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(273, 102, 188, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Venta");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(30, 83, 144, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de Salida");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(295, 176, 177, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hora de Venta");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(30, 149, 136, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Id Agencias");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(310, 254, 127, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Id Destino");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(41, 230, 125, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Id Medios");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(329, 319, 162, 33);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id Origen");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(34, 286, 133, 25);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Id Vehículo");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(336, 443, 101, 45);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("idPromotores");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(30, 373, 144, 27);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(50, 398, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Observaciones");
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(30, 456, 162, 29);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Precio");
		lblNewLabel_14.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_14.setBounds(45, 527, 101, 24);
		contentPane.add(lblNewLabel_14);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon (1)guardar.png"));
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
		btnGuardar.setBounds(637, 445, 66, 46);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Gestión de Paquetes");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(249, 0, 242, 50);
		contentPane.add(lblNewLabel);
		
		txtIdClientes = new JTextField();
		txtIdClientes.setBounds(436, 384, 55, 34);
		contentPane.add(txtIdClientes);
		txtIdClientes.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("IdClientes");
		lblNewLabel_15.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_15.setBounds(336, 384, 101, 28);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_11 = new JLabel("Código");
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(536, 486, 66, 30);
		contentPane.add(lblNewLabel_11);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(536, 527, 55, 34);
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
		btnNewButton.setBounds(637, 565, 66, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				cr.readOne(Integer.parseInt(txtCodigo.getText()), txtId_Destino, txtId_Origen, txtFechaVenta, txtHoraVenta, txtHoraSalida, 
				txtFechaEjecucion, txtObservaciones, txtId_Medios, txtId_Agencias, txtIdClientes, txtIdPromotores, txtId_Vehiculo, txtPrecio);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnNewButton_1.setBounds(637, 502, 66, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnActualizar = new JButton("New button");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtCodigo.getText()),Integer.parseInt(txtId_Destino.getText()), Integer.parseInt(txtId_Origen.getText()), txtFechaVenta.getText(), txtHoraVenta.getText(), txtHoraSalida.getText(), txtFechaEjecucion.getText(),
						txtObservaciones.getText(), Integer.parseInt(txtId_Medios.getText()), Integer.parseInt(txtId_Agencias.getText()), Integer.parseInt(txtIdClientes.getText()), Integer.parseInt(txtIdPromotores.getText()),
						Integer.parseInt(txtId_Vehiculo.getText()), txtPrecio.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(628, 634, 75, 46);
		contentPane.add(btnActualizar);
	}
}
