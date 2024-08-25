public class Tarea {
	private String nombre;
	private int tipo;
	private double testimado;
	private double treal;
	private int estado;
	private Desarrolador desarrollador;
	
	public Tarea() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getTEstimado() {
		return testimado;
	}
	public void setTEstimado(double testimado) {
		this.testimado = testimado;
	}
	public double getTReal() {
		return treal;
	}
	public void setTReal(double treal) {
		this.treal = treal;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Desarrollador getDesarrollador() {
		return desarrollador;
	}
	public void setDesarrollador(Desarrollador desarrollador) {
		this.desarrollador = desarrollador;
	}
}