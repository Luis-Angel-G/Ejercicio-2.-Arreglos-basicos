import java.util.Date;

public class Proyecto {
	private String nombre;
	private int categoria;
	private Date fecha;
	private int i = 0;
	Tarea[] tareas = new Tarea[i];
	private Desarrollador desarrolladorj;
	private Desarrollador desarrolladors;
	
	public Proyecto() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Desarrollador getDesarrolladorJ() {
		return desarrolladorj;
	}
	public void setDesarrolladorJ(Desarrollador desarrolladorj) {
		this.desarrolladorj = desarrolladorj;
	}
	public Desarrollador getDesarrolladorS() {
		return desarrolladors;
	}
	public void setDesarrolladorS(Desarrollador desarrolladors) {
		this.desarrolladors = desarrolladors;
	}
}