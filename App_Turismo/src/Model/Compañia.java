package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Compañia {
	
	public int Id_Compañia = 0;
	public String nombre;
	public String direccion = "";
	public String telefono = "";
	public String correo = "";
	public String FechaCreacion = "";
	public String Web = "";
	
	 Conexion conector = new Conexion();
	 
		
	
	

	public int getId_Compañia() {
		return Id_Compañia;
	}
	public void setId_Compañia(int id_Compañia) {
		Id_Compañia = id_Compañia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public String getWeb() {
		return Web;
	}
	public void setWeb(String web) {
		Web = web;
	}
	
	
	
	
	
	public void create (String nombre, String direccion, String telefono, String correo, String FechaCreacion, String Web) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		

		String scrip = "INSERT INTO tblcompania (nombre, direccion, telefono, correo, FechaCreacion, Web) values (?,?,?,?,?,?)";
		
		
		  try {
				
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(scrip);
				
				pst.setString(1,nombre );
				pst.setString(2, direccion);
				pst.setString(3,telefono );
				pst.setString(4,correo );
				pst.setString(5,FechaCreacion );
				pst.setString(6,Web );
				
				
				
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro con éxito");
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
			}
	}
	
	
}
