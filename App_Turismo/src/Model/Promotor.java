package Model;

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
	 
	public Promotor(int idPromotores, String tipoIdentificacion, int numeroIdentificacion, String nombres,
			String apellidos, String correos, String telefono, String fechanacimiento, String alergias) {
		super();
		this.idPromotores = idPromotores;
		this.TipoIdentificacion = tipoIdentificacion;
		this.NumeroIdentificacion = numeroIdentificacion;
		this.Nombres = nombres;
		this.Apellidos = apellidos;
		this.Correos = correos;
		this.Telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.Alergias = alergias;
	}
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
	
	
}
