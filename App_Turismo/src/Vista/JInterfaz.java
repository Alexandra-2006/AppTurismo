package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class JInterfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInterfaz frame = new JInterfaz();
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
	public JInterfaz() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencias = new JButton("Agencias");
		btnAgencias.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAgencias age = new JAgencias();
				age.show();
			}
		});
		btnAgencias.setBounds(102, 26, 119, 23);
		contentPane.add(btnAgencias);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JClientes client = new JClientes();
				client.show();
			}
		});
		btnClientes.setBounds(102, 71, 119, 23);
		contentPane.add(btnClientes);
		
		JButton btnCompania = new JButton("Compañía");
		btnCompania.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnCompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JCompañia Com = new JCompañia();
				Com.show();
			}
		});
		btnCompania.setBounds(102, 106, 119, 23);
		contentPane.add(btnCompania);
		
		JButton btnMedios = new JButton("Medios");
		btnMedios.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JMedios Medios = new JMedios();
				Medios.show();
			}
		});
		btnMedios.setBounds(100, 152, 121, 23);
		contentPane.add(btnMedios);
		
		JButton btnOperdadores = new JButton("Operadores");
		btnOperdadores.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnOperdadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOperadores Operadores = new JOperadores();
				Operadores.show();
			}
		});
		btnOperdadores.setBounds(102, 203, 123, 23);
		contentPane.add(btnOperdadores);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JPaquetes Paquetes = new JPaquetes();
				Paquetes.show();
			}
		});
		btnPaquetes.setBounds(102, 250, 119, 23);
		contentPane.add(btnPaquetes);
		
		JButton btnPromotor = new JButton("Promotor");
		btnPromotor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnPromotor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JPromotor Prt = new JPromotor();
				Prt.show();
			}
		});
		btnPromotor.setBounds(102, 297, 119, 23);
		contentPane.add(btnPromotor);
		
		JButton btnTiposMedios = new JButton("Tipos Medios");
		btnTiposMedios.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnTiposMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JTiposMedios TiposMedios = new JTiposMedios();
				TiposMedios.show();
			}
		});
		btnTiposMedios.setBounds(88, 342, 155, 23);
		contentPane.add(btnTiposMedios);
		
		JButton btnTipoTransporte = new JButton("Tipo de Transporte");
		btnTipoTransporte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnTipoTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JTipoTransporte TipoTransporte = new JTipoTransporte();
				TipoTransporte.show();
			}
		});
		btnTipoTransporte.setBounds(88, 383, 200, 23);
		contentPane.add(btnTipoTransporte);
		
		JButton btnVehículos = new JButton("Vehículos");
		btnVehículos.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnVehículos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JVehiculos Vehiculos = new JVehiculos();
				Vehiculos.show();
			}
		});
		btnVehículos.setBounds(102, 427, 109, 23);
		contentPane.add(btnVehículos);
	}

}
