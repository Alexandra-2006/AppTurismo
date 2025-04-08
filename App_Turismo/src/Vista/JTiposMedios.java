package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TiposMedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JTiposMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtIdTiposMedios;
	
	TiposMedios cr = new TiposMedios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTiposMedios frame = new JTiposMedios();
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
	public JTiposMedios() {
		setBackground(new Color(205, 133, 63));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(54, 56, 86, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setBounds(41, 106, 86, 14);
		contentPane.add(lblNewLabel_1);

		txtNombre = new JTextField();
		txtNombre.setBounds(212, 53, 191, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(212, 103, 192, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon (1)guardar.png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.create(txtNombre.getText(), txtObservaciones.getText());
			}

		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(305, 144, 62, 41);
		contentPane.add(btnGuardar);

		JLabel lblNewLabel_2 = new JLabel("Gestión Tipos de Medios");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(107, 11, 191, 34);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Id Tipos Medios");
		lblNewLabel_3.setBounds(41, 171, 170, 14);
		contentPane.add(lblNewLabel_3);

		txtIdTiposMedios = new JTextField();
		txtIdTiposMedios.setBounds(153, 168, 126, 20);
		contentPane.add(txtIdTiposMedios);
		txtIdTiposMedios.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdTiposMedios.getText()));
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(305, 248, 70, 48);
		contentPane.add(btnNewButton);
		
		JButton btnConsultar = new JButton("New button");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdTiposMedios.getText()), txtNombre, txtObservaciones);
			}
		});
		btnConsultar.setBackground(new Color(222, 184, 135));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnConsultar.setBounds(305, 196, 70, 41);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("New button");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.Update(Integer.parseInt(txtIdTiposMedios.getText()), txtNombre.getText(), txtObservaciones.getText());
			}
			
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(305, 307, 70, 48);
		contentPane.add(btnActualizar);
	}
}
