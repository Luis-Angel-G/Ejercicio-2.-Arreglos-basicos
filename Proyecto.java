import java.util.Date;

public class Proyecto {
	private String nombre;
	private int categoria;
	private Date fecha;
	private int tareaCount;
	private String maxtareas = "";
	Tarea[] tareas;
	private Desarrollador desarrolladorj;
	private Desarrollador desarrolladors;
	
	public Proyecto(String nombre, int categoria, Date fecha, int i, Desarrollador desarrolladorj, Desarrollador desarrolladors) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.fecha = fecha;
    tareas = new Tarea[i];
    tareaCount = 0;
	this.desarrolladorj = desarrolladorj;
	this.desarrolladors = desarrolladors;
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
	public void agregarTarea(Tarea tarea) {
		if (tareaCount < tareas.length) {
            tareas[tareaCount] = tarea;
            tareaCount++;
        } else {
            maxtareas = "No se pueden agregar más tareas al proyecto.";
        }
	}
	public Tarea[] getTareas() {
        return tareas;
    }
}