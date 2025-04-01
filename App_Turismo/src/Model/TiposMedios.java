package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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

}
