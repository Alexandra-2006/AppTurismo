package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Agencias {
	
	public int Id_Agencia = 0;
	public String Nombre = "";
	public String Direccion = "";
	public String Telefono = "";
	public String Correo = "";
	public String Web = "";
    public int Id_Compañia = 0;
    
    
    Conexion conector = new Conexion();
	 
	
	
		

	public int getId_Agencia() {
		return Id_Agencia;
	}
	public void setId_Agencia(int id_Agencia) {
		Id_Agencia = id_Agencia;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getWeb() {
		return Web;
	}
	public void setWeb(String web) {
		Web = web;
	}
	public int getId_Compañia() {
		return Id_Compañia;
	}
	public void setId_Compañia(int id_Compañia) {
		Id_Compañia = id_Compañia;
	}
	

	public void create (String Nombres,String Direccion, String Telefono, String Correo, String Web, int Id_Compañia  ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblagencias (Nombre, Direccion, Telefono, Correo, Web,Id_Compañia) values (?,?,?,?,?,?)";
		
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setString(1, Nombres);
			pst.setString(2, Direccion);
			pst.setString(3, Telefono);
			pst.setString(4, Correo);
			pst.setString(5, Web);
			pst.setInt(6, Id_Compañia);
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	
}}
