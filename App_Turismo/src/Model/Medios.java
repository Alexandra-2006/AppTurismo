package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Medios {
	
	public int Id_Medios = 0;
	public String Nombres = "";
	public String Observaciones = "";
	public int Id_TiposMedios = 0;
	
	
	 Conexion conector = new Conexion();
		
	
	public int getId_Medios() {
		return Id_Medios;
	}
	public void setId_Medios(int id_Medios) {
		Id_Medios = id_Medios;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public int getId_TiposMedios() {
		return Id_TiposMedios;
	}
	public void setId_TiposMedios(int id_TiposMedios) {
		Id_TiposMedios = id_TiposMedios;
	}
	
	
public void create (String Nomb, String Observacion, int Id_TiposMedio) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblmedios (Nombres, Observaciones, Id_TiposMedios) values (?, ?, ?)";
		 
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setString(1,Nomb );
			pst.setString(2, Observacion);
			pst.setInt(3, Id_TiposMedio);
			
			
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
			
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
}

public void delete(int Id_Medios ) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "DELETE FROM tblmedios WHERE Id_Medios = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1,Id_Medios  );

		// Confirmar la operacion
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_Medios + "?");

		if (resp == JOptionPane.OK_OPTION) {
			// Ejecutar la Trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No. " + Id_Medios + "Eliminado");
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}
}

}
