package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Paquetes {

	  public int codigo = 0;
	  public int Id_destino = 0;
	  public int Id_Origen = 0;
	  public String Fechaventa = "";
	  public String Horaventa = "";
	  public String HoraSalida = "";
	  public String FechaEjecucion = "";
	  public String Observaciones = "";
	  public int Medios= 0;
	  public int Id_Agencias = 0;
	  public int Id_Medios = 0;
	  public int IdClientes = 0;
	  public int IdPromotores = 0;
	  public int Id_Vehiculo = 0;
	  public String Precio = "";
	  
	  

		Conexion conector = new Conexion();
		
		
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getId_destino() {
		return Id_destino;
	}
	public void setId_destino(int id_destino) {
		Id_destino = id_destino;
	}
	public int getId_Origen() {
		return Id_Origen;
	}
	public void setId_Origen(int id_Origen) {
		Id_Origen = id_Origen;
	}
	public String getFechaventa() {
		return Fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		Fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return Horaventa;
	}
	public void setHoraventa(String horaventa) {
		Horaventa = horaventa;
	}
	public String getHoraSalida() {
		return HoraSalida;
	}
	public void setHoraSalida(String horaSalida) {
		HoraSalida = horaSalida;
	}
	public String getFechaEjecucion() {
		return FechaEjecucion;
	}
	public void setFechaEjecucion(String fechaEjecucion) {
		FechaEjecucion = fechaEjecucion;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public int getMedios() {
		return Medios;
	}
	public void setMedios(int medios) {
		Medios = medios;
	}
	public int getId_Agencias() {
		return Id_Agencias;
	}
	public void setId_Agencias(int id_Agencias) {
		Id_Agencias = id_Agencias;
	}
	public int getId_Medios() {
		return Id_Medios;
	}
	public void setId_Medios(int id_Medios) {
		Id_Medios = id_Medios;
	}
	public int getIdClientes() {
		return IdClientes;
	}
	public void setIdClientes(int idClientes) {
		IdClientes = idClientes;
	}
	public int getIdPromotores() {
		return IdPromotores;
	}
	public void setIdPromotores(int idPromotores) {
		IdPromotores = idPromotores;
	}
	public int getId_Vehiculo() {
		return Id_Vehiculo;
	}
	public void setId_Vehiculo(int id_Vehiculo) {
		Id_Vehiculo = id_Vehiculo;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	

	public void create (int Id_destino, int  Id_Origen , String Fechaventa , String   HoraVenta, String  HoraSalida, String FechaEjecucion,String Observaciones, int Id_Medios, int Id_Agencia, int IdClientes, int idPromotores,
			int Id_Vehiculo, String Precio) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String scrip = "INSERT INTO tblpaquetes (Id_destino, Id_Origen, Fechaventa, HoraVenta, HoraSalida, FechaEjecucion, Observaciones, Id_Medios, Id_Agencia,IdClientes,idPromotores,Id_Vehiculo,Precio) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

    try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			
			pst.setInt(1,Id_destino );
			pst.setInt(2, Id_Origen);
			pst.setString(3,Fechaventa );
			pst.setString(4,HoraVenta );
			pst.setString(5,HoraSalida );
			pst.setString(6,FechaEjecucion );
			pst.setString(7,Observaciones );
			pst.setInt(8,Id_Medios );
			pst.setInt(9,Id_Agencia );
			pst.setInt(10,IdClientes);
			pst.setInt(11,idPromotores);
			pst.setInt(12,Id_Vehiculo);
			pst.setString(13,Precio );
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con éxito");
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	
	
	
}}
