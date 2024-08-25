import java.util.Date;

public class Proyecto {
	private String nombre;
	private int categoria;
	private Date fecha;
	private int i = 0;
	Tarea[] tareas;
	private Desarrollador desarrolladorj;
	private Desarrollador desarrolladors;
	
	public Proyecto(int i) {
		Tarea[] tareas = new Tarea[i];
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
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void agregarTarea(Tarea tarea) {
		for (int ii = 0; ii < tareas.length; ii++) {
            tareas[ii] = tarea;
		}
	}
}