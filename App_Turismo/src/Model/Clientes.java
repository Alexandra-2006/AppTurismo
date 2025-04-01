package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Clientes {
	
	public int IdClientes = 0; 
	public String TipoDocumento;
    public int NumeroDocumento  = 0 ;
	public String Nombres;
	public String Apellidos;
	public String Telefono;
	public String Correo;
	public String Direccion;
	public String eps;
	public String Alergias;
	public String estadocivil;
	
	Conexion conector = new Conexion();
	 
	




	public int getIdClientes() {
		return IdClientes;
	}
	public void setIdClientes(int idClientes) {
		IdClientes = idClientes;
	}
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
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return Alergias;
	}
	public void setAlergias(String alergias) {
		Alergias = alergias;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	
	public void create (String tipoDocumento, int  numeroDocumento, String Nombres, String Apellidos, String Telefono, String Correo,String Direccion, String eps, String Alergias, String estadocivil ) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblclientes (TipoDocumento, NumeroDocumento, Nombres, Apellidos, Telefono, Correo, Direccion, eps, Alergias, estadocivil) values (?,?,?,?,?,?,?,?,?,?)";
		System.out.println(tipoDocumento);
    try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setString(1,tipoDocumento );
			pst.setInt(2, numeroDocumento);
			pst.setString(3,Nombres );
			pst.setString(4,Apellidos );
			pst.setString(5,Telefono );
			pst.setString(6,Correo );
			pst.setString(7,Direccion );
			pst.setString(8,eps );
			pst.setString(9,Alergias );
			pst.setString(10,estadocivil );
			
			
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
    
	}
	
	public void delete(int IdClientes ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "DELETE FROM tblclientes WHERE IdClientes = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1,IdClientes  );

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + IdClientes + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + IdClientes + "Eliminado");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

}
	
