package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class TiposMedios {

	public String Nombres;
	public String Observaciones;

	Conexion conector = new Conexion();

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String Nombres) {
		Nombres = Nombres;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String Observaciones) {
		Observaciones = Observaciones;
	}

	public void create(String Nombres, String Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String scrip = "INSERT INTO tbltiposmedios (Nombres, Observaciones) values (?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);

			pst.setString(1, Nombres);
			pst.setString(2, Observaciones);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

	public void delete(int Id_TiposMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "DELETE FROM tbltiposmedios WHERE Id_TiposMedios = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, Id_TiposMedios);

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_TiposMedios + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_TiposMedios + "Eliminado");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	public void readOne(int Id_TiposMedios, JTextField Nombres, JTextField Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "SELECT *  FROM tbltiposmedios WHERE Id_TiposMedios = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, Id_TiposMedios);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			while (rs.next()) {

				Nombres.setText(rs.getString(2));
				Observaciones.setText(rs.getString(3));
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
	}

	public void Update (int Id_TiposMedios, String  Nombres, String Observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "UPDATE tbltiposmedios SET Nombres = ?, Observaciones = ? WHERE Id_TiposMedios = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
            
			
			pst.setString(1, Nombres);
			pst.setString(2, Observaciones);
			pst.setInt(3, Id_TiposMedios);
			
			
			
			//Confirmar la operación
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + Id_TiposMedios + "?");

			if (resp == JOptionPane.YES_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro No. " + +Id_TiposMedios + "ACTUALIZADO");
				
			}else {
				
				JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

}