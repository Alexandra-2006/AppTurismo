package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Vehiculos {
   
	public int Id_Vehiculo = 0;
	 public String Placa = "";
	 public String Marca = "";
	 public String Año = "";
	 public String NumeroMotor = "";
	 public int Capacidad = 0;
	 public String Modelo = "";
	 public String Estado = "";
	public int Id_Transporte = 0;
	
	
	  Conexion conector = new Conexion();
		 
	


	public int getId_Vehiculo() {
		return Id_Vehiculo;
	}

	public void setId_Vehiculo(int id_Vehiculo) {
		Id_Vehiculo = id_Vehiculo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getAño() {
		return Año;
	}

	public void setAño(String año) {
		Año = año;
	}

	public String getNumeroMotor() {
		return NumeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		NumeroMotor = numeroMotor;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getId_Transporte() {
		return Id_Transporte;
	}

	public void setId_Transporte(int id_Transporte) {
		Id_Transporte = id_Transporte;
	}
	
	
	public void create (String Placa,String Marca, String Año, String NumeroMotor, int Capacidad,String Modelo, String Estado, int Id_Transporte,String Categoria) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblvehiculos (Placa, Marca, Año,NumeroMotor,Capacidad,Modelo,Estado,Id_Transporte,Categoria) values (?,?,?,?,?,?,?,?,?)";
		
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setString(1, Placa);
			pst.setString(2, Marca);
			pst.setString(3, Año);
			pst.setString(4, NumeroMotor);
			pst.setInt(5, Capacidad);
			pst.setString(6, Modelo);
			pst.setString(7, Estado);
			pst.setInt(8, Id_Transporte);
			pst.setString(9, Categoria);
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	
	}


public void delete(int Id_Vehiculo) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "DELETE FROM tblvehiculos WHERE Id_Vehiculo = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1, Id_Vehiculo);

		// Confirmar la operacion
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_Vehiculo + "?");

		if (resp == JOptionPane.OK_OPTION) {
			// Ejecutar la Trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No. " + Id_Vehiculo + "Eliminado");
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}
	
	

}

public void readOne(int Id_Vehiculo, JTextField Placa, JTextField Marca, JTextField Año, JTextField NumeroMotor, JTextField Capacidad, JTextField Modelo, JTextField Estado, JTextField Id_Transporte,
		JTextField Categoria) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "SELECT *  FROM tblvehiculos WHERE Id_Vehiculo = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

		// Parametrizar el campo
		pst.setInt(1, Id_Vehiculo);
		ResultSet rs = pst.executeQuery();// Almacenamiento temporal

		while (rs.next()) {

			Placa.setText(rs.getString(2));
			Marca.setText(rs.getString(3));
			Año.setText(rs.getString(4));
			NumeroMotor.setText(rs.getString(5));
			Capacidad.setText(rs.getString(6));
			Modelo.setText(rs.getString(7));
			Estado.setText(rs.getString(8));
			Id_Transporte.setText(rs.getString(9));
			Categoria.setText(rs.getString(10));
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}
	
}

public void Update (int Id_Vehiculo, String  Placa, String Marca, String Año,	String NumeroMotor, int  Capacidad, String Modelo, String   Estado, int Id_Transporte, String Categoria) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // Preparar la trx

	String scrip = "UPDATE tblvehiculos SET Placa = ?, Marca = ?, Año = ?, NumeroMotor = ?, Capacidad = ?, Modelo = ?, Estado = ?,"
			+ " Id_Transporte = ?, Categoria = ? WHERE Id_Vehiculo = ?";
	try {

		dbConnection = conector.conectarBD(); // Abrir La Conexion
		pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
        
		
		pst.setString(1, Placa);
		pst.setString(2, Marca);
		pst.setString(3, Año);
		pst.setString(4, NumeroMotor);
		pst.setInt(5, Capacidad);
		pst.setString(6,Modelo);
		pst.setString(7, Estado);
		pst.setInt(8, Id_Transporte);
		pst.setString(9, Categoria);
		pst.setInt(10, Id_Vehiculo);
		
		
		//Confirmar la operación
		
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + Id_Vehiculo + "?");

		if (resp == JOptionPane.YES_OPTION) {
			// Ejecutar la Trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro No. " + +Id_Vehiculo + "ACTUALIZADO");
			
		}else {
			
			JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
		}

	} catch (SQLException e) {

		System.out.println(e.getMessage());
	}

}	

}
