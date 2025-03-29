package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class TipoTransporte {
	 public int Id_Transporte= 0;
	 public String Nombre ;
	 public String Observaciones ;
	 
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
	
	

	public void create (String Nombre,String Observaciones) {
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
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	 
	 
}}