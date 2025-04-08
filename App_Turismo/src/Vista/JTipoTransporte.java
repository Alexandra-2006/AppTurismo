package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoTransporte;
import Model.TiposMedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtIdTipoTransporte;
	TipoTransporte cr = new TipoTransporte ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTipoTransporte frame = new JTipoTransporte();
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
	public JTipoTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(76, 51, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setBounds(63, 100, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(247, 51, 102, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(182, 97, 302, 36);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon (1)guardar.png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtNombre.getText(),(txtObservaciones.getText()));
			}
		});
		btnGuardar.setBounds(333, 144, 64, 52);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2 = new JLabel("Gestión Tipos de Transporte");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(106, 11, 245, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Id Tipo Transporte");
		lblNewLabel_3.setBounds(38, 191, 143, 14);
		contentPane.add(lblNewLabel_3);
		
		txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setBounds(195, 188, 86, 20);
		contentPane.add(txtIdTipoTransporte);
		txtIdTipoTransporte.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 cr.delete(Integer.parseInt(txtIdTipoTransporte.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(342, 257, 55, 55);
		contentPane.add(btnNewButton);
		
		JButton btnConsultar = new JButton("New button");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.readOne(Integer.parseInt(txtIdTipoTransporte.getText()), txtNombre, txtObservaciones);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnConsultar.setBounds(333, 207, 64, 39);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("New button");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.Update(Integer.parseInt(txtIdTipoTransporte.getText()),txtNombre.getText(), txtObservaciones.getText());
			}
			
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(338, 323, 79, 46);
		contentPane.add(btnActualizar);
	}
}
