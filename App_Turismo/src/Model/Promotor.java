package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;
import Vista.JInterfaz;

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
		JInterfaz principal = new JInterfaz();
	 
	
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
	
	

}

public void readOne(int idPromotores, JTextField TipoIdentificacion, JTextField NumeroIdentificacion, JTextField Nombres, JTextField Apellidos, JTextField Correo, JTextField Telefono,
		
		JTextField fechanacimiento, JTextField Alergias) {
	
	
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "SELECT *  FROM tblpromotor WHERE idPromotores = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1, idPromotores);
		ResultSet rs = pst.executeQuery();// Almacenamiento temporal

		while (rs.next()) {

			TipoIdentificacion.setText(rs.getString(2));
			NumeroIdentificacion.setText(rs.getString(3));
			Nombres.setText(rs.getString(4));
			Apellidos.setText(rs.getString(5));
			Correo.setText(rs.getString(6));
			Telefono.setText(rs.getString(7));
			fechanacimiento.setText(rs.getString(8));
			Alergias.setText(rs.getString(9));
			
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}

}

public void Update (int idPromotores, String  TipoIdentificacion, int NumeroIdentificacion, String Nombres,	String Apellidos, String  Correo, String Telefono, String   fechanacimiento, String Alergias) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "UPDATE tblpromotor SET TipoIdentificacion = ?, NumeroIdentificacion = ?, Nombres = ?, Apellidos = ?, Correo = ?, Telefono = ?,"
			+ " fechanacimiento = ?, Alergias = ? WHERE idPromotores = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
        
		
		pst.setString(1, TipoIdentificacion);
		pst.setInt(2, NumeroIdentificacion);
		pst.setString(3, Nombres);
		pst.setString(4, Apellidos);
		pst.setString(5, Correo);
		pst.setString(6,Telefono);
		pst.setString(7, fechanacimiento);
		pst.setString(8, Alergias);
		pst.setInt(9, idPromotores);
		
		
		
		//Confirmar la operación
		
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idPromotores + "?");

		if (resp == JOptionPane.YES_OPTION) {
			// Ejecutar la Trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro No. " + +idPromotores + "ACTUALIZADO");
			
		}else {
			
			JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}



}


public void Acceso(int documento, String Contraseña) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "SELECT * FROM tblpromotor WHERE NumeroIdentificacion = ?  AND contrasena = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1,documento  );
		pst.setString(2,Contraseña  );
		
		ResultSet rs = pst.executeQuery();
		
		
		while(rs.next()) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea iniciar sesión?");
			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
			
				JOptionPane.showConfirmDialog(null, "Acceso permitido");
			}
			principal.show();
			
		}
		
		// Confirmar la operacion
		
		

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}
	
	

}










}