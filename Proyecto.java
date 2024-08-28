/**
 * Representa un proyecto en el sistema.
 * <p>
 * Un proyecto tiene un nombre, categoría, fecha límite, tareas asignadas, desarrolladores junior y senior, y prioridad.
 * </p>
 * 
 * @author Luis Ángel Girón Arevalo
 * @version 1.0
 * @since [Fecha de Creación]
 * @see Tarea
 * @see Desarrollador
 */
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
    private int prioridad;

    /**
     * Crea un nuevo proyecto con el nombre, categoría, fecha límite, número de tareas, desarrollador junior, desarrollador senior y prioridad especificados.
     * 
     * @param nombre el nombre del proyecto.
     * @param categoria la categoría del proyecto (1 para Desarrollo de Software, 2 para Mantenimiento de Sistemas).
     * @param fecha la fecha límite para la entrega del proyecto.
     * @param i la cantidad de tareas que tendrá el proyecto.
     * @param desarrolladorj el desarrollador junior asignado al proyecto.
     * @param desarrolladors el desarrollador senior asignado al proyecto.
     * @param prioridad la prioridad del proyecto (1 para Alta, 2 para Media, 3 para Baja).
     */
    public Proyecto(String nombre, int categoria, Date fecha, int i, Desarrollador desarrolladorj, Desarrollador desarrolladors, int prioridad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.fecha = fecha;
        tareas = new Tarea[i];
        tareaCount = 0;
        this.desarrolladorj = desarrolladorj;
        this.desarrolladors = desarrolladors;
        this.prioridad = prioridad;
    }

    // Métodos getter y setter

    /**
     * Obtiene el nombre del proyecto.
     * 
     * @return el nombre del proyecto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proyecto.
     * 
     * @param nombre el nuevo nombre del proyecto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la categoría del proyecto.
     * 
     * @return la categoría del proyecto.
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del proyecto.
     * 
     * @param categoria la nueva categoría del proyecto.
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la fecha límite para el proyecto.
     * 
     * @return la fecha límite.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha límite para el proyecto.
     * 
     * @param fecha la nueva fecha límite.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el número de tareas en el proyecto.
     * 
     * @return el número de tareas.
     */
    public int getTareaCount() {
        return tareaCount;
    }

    /**
     * Establece el número de tareas en el proyecto.
     * 
     * @param tareaCount el nuevo número de tareas.
     */
    public void setTareaCount(int tareaCount) {
        this.tareaCount = tareaCount;
    }

    /**
     * Obtiene el array de tareas del proyecto.
     * 
     * @return el array de tareas.
     */
    public Tarea[] getTareas() {
        return tareas;
    }

    /**
     * Establece el array de tareas del proyecto.
     * 
     * @param tareas el nuevo array de tareas.
     */
    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    /**
     * Obtiene el desarrollador junior asignado al proyecto.
     * 
     * @return el desarrollador junior.
     */
    public Desarrollador getDesarrolladorj() {
        return desarrolladorj;
    }

    /**
     * Establece el desarrollador junior asignado al proyecto.
     * 
     * @param desarrolladorj el nuevo desarrollador junior.
     */
    public void setDesarrolladorj(Desarrollador desarrolladorj) {
        this.desarrolladorj = desarrolladorj;
    }

    /**
     * Obtiene el desarrollador senior asignado al proyecto.
     * 
     * @return el desarrollador senior.
     */
    public Desarrollador getDesarrolladors() {
        return desarrolladors;
    }

    /**
     * Establece el desarrollador senior asignado al proyecto.
     * 
     * @param desarrolladors el nuevo desarrollador senior.
     */
    public void setDesarrolladors(Desarrollador desarrolladors) {
        this.desarrolladors = desarrolladors;
    }

    /**
     * Obtiene la prioridad del proyecto.
     * 
     * @return la prioridad del proyecto.
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Establece la prioridad del proyecto.
     * 
     * @param prioridad la nueva prioridad del proyecto.
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Devuelve una representación en cadena del proyecto.
     * 
     * @return una cadena que representa al proyecto.
     */
    @Override
    public String toString() {
        String[] categorias = {"Desarrollo de Software", "Mantenimiento de Sistemas"};
        String[] prioridades = {"Alta", "Media", "Baja"};
        return nombre + ": Categoría: " + categorias[categoria - 1] + ", Fecha límite: " + fecha + ", Prioridad: " + prioridades[prioridad - 1];
    }
}