package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Operadores {

	public String TipoDocumento = "";
	public int NumeroDocumento = 0;
	public String Nombres = "";
	public String Apellidos = "";
	public String Correo = "";
	public String Direccion = "";
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

	public String getCorreo() {
		return Correo;
	}

	public void set(String direccion) {
		Direccion = direccion;
	}

	public String getDireccion() {
		return Direccion;
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

	public void create(String TipoDocumento, int NumeroDocumento, String Nombres, String Apellidos, String Direccion,
			String Correo, String Telefono) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String scrip = "INSERT INTO tbloperadores (TipoDocumento, NumeroDocumento , Nombres, Apellidos, Direccion, Correo, Telefono) values (?,?,?,?,?,?,? )";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);

			pst.setString(1, TipoDocumento);
			pst.setInt(2, NumeroDocumento);
			pst.setString(3, Nombres);
			pst.setString(4, Apellidos);
			pst.setString(5, Direccion);
			pst.setString(6, Correo);
			pst.setString(7, Telefono);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con éxito");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

	public void delete(int idOperador) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "DELETE FROM tbloperadores WHERE idOperador = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, idOperador);

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idOperador + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idOperador + "Eliminado");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
        
	}
	

	public void readOne(int idOperador, JTextField Nombres, JTextField Apellidos,JTextField Correo, JTextField TipoDocumento, JTextField NumeroDocumento, JTextField Direccion,
		JTextField Telefono, JTextField Id_Vehiculo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "SELECT *  FROM tbloperadores WHERE idOperador = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, idOperador);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			while (rs.next()) {

				Nombres.setText(rs.getString(2));
				Apellidos.setText(rs.getString(3));
				TipoDocumento.setText(rs.getString(4));
				NumeroDocumento.setText(rs.getString(5));
				Direccion.setText(rs.getString(6));
				Correo.setText(rs.getString(7));
				Telefono.setText(rs.getString(8));
				Id_Vehiculo.setText(rs.getString(9));
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
	}

	public void Update (int idOperador, String  Nombres, String Apellidos, String Correo,
			String TipoDocumento, int  NumeroDocumento, String Direccion, String   Telefono, int Id_Vehiculo) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "UPDATE tbloperadores SET Nombres = ?, Apellidos = ?, Correo = ?, TipoDocumento = ?, NumeroDocumento = ?, Direccion = ?, Telefono = ?,"
				+ " Id_Vehiculo = ? WHERE idOperador = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
            
			
			pst.setString(1, Nombres);
			pst.setString(2, Apellidos);
			pst.setString(3, Correo);
			pst.setString(4, TipoDocumento);
			pst.setInt(5, NumeroDocumento);
			pst.setString(6,Direccion);
			pst.setString(7, Telefono);
			pst.setInt(8, Id_Vehiculo);
			pst.setInt(9, idOperador);
			
			
			//Confirmar la operación
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idOperador + "?");

			if (resp == JOptionPane.YES_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro No. " + +idOperador + "ACTUALIZADO");
				
			}else {
				
				JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

}