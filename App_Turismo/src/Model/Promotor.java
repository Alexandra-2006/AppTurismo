package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Promotor {
	
	 public int idPromotores = 0;
	 public String TipoIdentificacion = "";
	 public int NumeroIdentificacion = 0;
	 public String Nombres = "";
	 public String Apellidos = "";
	 public String Correos = "";
	 public String Telefono = "";
	 public String fechanacimiento = "";
	 public String Alergias = "";
	 
	 
	 
	 Conexion conector = new Conexion();
		
	 
	
	public int getIdPromotores() {
		return idPromotores;
	}
	public void setIdPromotores(int idPromotores) {
		this.idPromotores = idPromotores;
	}
	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}
	public int getNumeroIdentificacion() {
		return NumeroIdentificacion;
	}
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		NumeroIdentificacion = numeroIdentificacion;
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
	public String getCorreos() {
		return Correos;
	}
	public void setCorreos(String correos) {
		Correos = correos;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getAlergias() {
		return Alergias;
	}
	public void setAlergias(String alergias) {
		Alergias = alergias;
	}
	
	

	public void create ( String   TipoIdentificacion , int  NumeroIdentificacion , String   Nombres, String  Apellidos,String Correo, String Telefono,String fechanacimiento, String Alergias) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblpromotor ( TipoIdentificacion, NumeroIdentificacion, Nombres, Apellidos, Correo, Telefono, fechanacimiento,Alergias) values (?,?,?,?,?,?,?,?)";

    try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
		
			pst.setString(1, TipoIdentificacion);
			pst.setInt(2,NumeroIdentificacion );
			pst.setString(3,Nombres );
			pst.setString(4,Apellidos );
			pst.setString(5,Correo );
			pst.setString(6,Telefono );
			pst.setString(7,fechanacimiento );
			pst.setString(8,Alergias );
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	
	
}
	
	
	

public void delete(int idPromotores ) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "DELETE FROM tblpromotor WHERE idPromotores = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1,idPromotores  );

		// Confirmar la operacion
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idPromotores + "?");

		if (resp == JOptionPane.OK_OPTION) {
			// Ejecutar la Trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No. " + idPromotores + "Eliminado");
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}

}}