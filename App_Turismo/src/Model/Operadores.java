package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operadores {
   
	public String TipoDocumento = "";
	public int NumeroDocumento = 0; 
	public String Nombres = "";
	public String Apellidos  = ""; 
	public String Direccion = "";
	public String Correo = "";
	public String Telefono = "";
	public int Id_Vehiculo = 0;
	
	
	
	 public Operadores() {
		super();
	}



	Conexion conector = new Conexion();
	
	public String getTipoDocumento() {
		return TipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	public int getNumeroDocumento() {
		return NumeroDocumento;
	}
	public void setNumeroDocumento(int numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getId_Vehiculo() {
		return Id_Vehiculo;
	}
	public void setId_Vehiculo(int id_Vehiculo) {
		Id_Vehiculo = id_Vehiculo;
	}
	
	

	public void create (String TipoDocumento, int NumeroDocumento, String Nombres, String Apellidos,String Direccion, String Correo, String Telefono) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		

		String scrip = "INSERT INTO tbloperadores (TipoDocumento, NumeroDocumento , Nombres, Apellidos, Direccion, Correo, Telefono) values (?,?,?,?,?,?,? )";
		
		
		  try {
				
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(scrip);
				
				pst.setString(1,TipoDocumento );
				pst.setInt(2, NumeroDocumento);
				pst.setString(3,Nombres );
				pst.setString(4,Apellidos );
				pst.setString(5,Direccion );
				pst.setString(6,Correo );
				pst.setString(7,Telefono );
				
				
				
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro con éxito");
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
			}
}}
