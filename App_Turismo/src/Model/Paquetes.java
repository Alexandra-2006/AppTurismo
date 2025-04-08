package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	}
    public void delete(int codigo ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "DELETE FROM tblpaquetes WHERE codigo = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1,codigo  );

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + codigo + "Eliminado");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
}
	

	public void readOne(int codigo, JTextField Id_destino, JTextField Id_Origen,JTextField Fechaventa, JTextField Horaventa, JTextField HoraSalida, JTextField FechaEjecucion,
		JTextField Observaciones, JTextField Id_Medios, JTextField Id_Agencia, JTextField IdClientes, JTextField idPromotores, JTextField Id_Vehiculo, JTextField Precio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "SELECT *  FROM tblpaquetes WHERE codigo = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer

			// Parametrizar el campo
			pst.setInt(1, codigo);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			while (rs.next()) {

				Id_destino.setText(rs.getString(2));
				Id_Origen.setText(rs.getString(3));
				Fechaventa.setText(rs.getString(4));
				Horaventa.setText(rs.getString(5));
				HoraSalida.setText(rs.getString(6));
				FechaEjecucion.setText(rs.getString(7));
				Observaciones.setText(rs.getString(8));
				Id_Medios.setText(rs.getString(9));
				Id_Agencia.setText(rs.getString(10));
				IdClientes.setText(rs.getString(11));
				idPromotores.setText(rs.getString(12));
				Id_Vehiculo.setText(rs.getString(13));
				Precio.setText(rs.getString(14));
				
			
			
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
	}

	public void Update (int codigo, int Id_destino, int  Id_Origen, String Fechaventa,
			String Horaventa, String   HoraSalida, String FechaEjecucion, String   Observaciones, int Id_Medios, int Id_Agencia, int IdClientes, int idPromotores, int Id_Vehiculo, String Precio ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String scrip = "UPDATE tblpaquetes SET Id_destino = ?, Id_Origen = ?, Fechaventa = ?, Horaventa = ?, HoraSalida = ?, FechaEjecucion = ?, Observaciones = ?,"
				+ " Id_Medios = ?, Id_Agencia = ?, IdClientes = ?, idPromotores = ?, Id_Vehiculo = ?, Precio = ?  WHERE codigo = ?";
		try {

			dbConnection = conector.conectarBD(); // Abrir La Conexion
			pst = dbConnection.prepareStatement(scrip);// Abrir el Buffer
            
			
			
			pst.setInt(1, Id_destino);
			pst.setInt(2, Id_Origen);
			pst.setString(3, Fechaventa);
			pst.setString(4, Horaventa);
			pst.setString(5,HoraSalida);
			pst.setString(6, FechaEjecucion);
			pst.setString(7, Observaciones);
			pst.setInt(8, Id_Medios);
			pst.setInt(9, Id_Agencia);
			pst.setInt(10, IdClientes);
			pst.setInt(11, idPromotores);
			pst.setInt(12, Id_Vehiculo);
			pst.setString(13, Precio);
			pst.setInt(14, codigo);
			
			//Confirmar la operación
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + codigo + "?");

			if (resp == JOptionPane.YES_OPTION) {
				// Ejecutar la Trx
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro No. " + +codigo + "ACTUALIZADO");
				
			}else {
				
				JOptionPane.showConfirmDialog(null, "Operación CANCELADA");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	
	
}
    }
