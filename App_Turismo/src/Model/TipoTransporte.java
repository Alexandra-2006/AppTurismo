package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class TipoTransporte {
	public int Id_Transporte = 0;
	public String Nombre;
	public String Observaciones;

	Conexion conector = new Conexion();

	public int getId_Transporte() {
		return Id_Transporte;
	}

	public void setId_Transporte(int id_Transporte) {
		Id_Transporte = id_Transporte;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public void create(String Nombre, String Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String scrip = "INSERT INTO tbltipotransporte (Nombre, Observaciones) values (?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);

			pst.setString(1, Nombre);
			pst.setString(2, Observaciones);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	public void delete(int Id_Transporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "DELETE FROM tbltipotransporte WHERE Id_Transporte = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, Id_Transporte);

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_Transporte + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_Transporte + "Eliminado");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		

	}

	public void readOne(int Id_Transporte, JTextField Nombre, JTextField Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "SELECT *  FROM tbltipotransporte WHERE Id_Transporte = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, Id_Transporte);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			while (rs.next()) {

				Nombre.setText(rs.getString(2));
				Observaciones.setText(rs.getString(3));
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
	}

	public void Update (int Id_Transporte, String  Nombre, String Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "UPDATE tbltipotransporte SET Nombre = ?, Observaciones = ? WHERE Id_Transporte = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
            
			
			pst.setString(1, Nombre);
			pst.setString(2, Observaciones);
			pst.setInt(3, Id_Transporte);
			
			
			
			
			//Confirmar la operación
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + Id_Transporte + "?");

			if (resp == JOptionPane.YES_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro No. " + +Id_Transporte + "ACTUALIZADO");
				
			}else {
				
				JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

}