package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;



public class TiposMedios {

	 public String Nombres;
	 public String Observaciones ;
	 
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
	
	
	public void create (String Nombres,String Observaciones) {
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
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
}
