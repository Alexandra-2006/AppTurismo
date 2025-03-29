package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	
	
	public void create (String Placa,String Marca, int Año, String NumeroMotor, int Capacidad,String Modelo, String Estado, int Id_Transporte,String Categoria) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblvehiculos (Placa, Marca, Año,NumeroMotor,Capacidad,Modelo,Estado,Id_Transporte,Categoria) values (?,?,?,?,?,?,?,?,?)";
		
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setString(1, Placa);
			pst.setString(2, Marca);
			pst.setInt(3, Año);
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
	
	}}
