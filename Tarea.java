public class Tarea {
	private String nombre;
	private int tipo;
	private double testimado;
	private double treal;
	private int estado;
	private Desarrollador desarrollador;
	
	public Tarea(String nombre, int tipo, double testimado, Desarrollador desarrollador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.testimado = testimado;
        this.treal = 0;
        this.estado = 1;
        this.desarrollador = desarrollador;
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