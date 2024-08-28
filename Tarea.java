/**
 * Representa una tarea en un proyecto.
 * <p>
 * Una tarea tiene un nombre, tipo, tiempo estimado, tiempo real, estado y desarrollador asignado.
 * </p>
 * 
 * @author Luis Ángel Girón Arevalo
 * @version 1.0
 * @since 24/08/2024
 * @see Proyecto
 * @see Desarrollador
 */
public class Tarea {
    private String nombre;
    private int tipo;
    private double testimado;
    private double treal;
    private int estado;
    private Desarrollador desarrollador;

    /**
     * Crea una nueva tarea con el nombre, tipo, tiempo estimado y desarrollador asignado.
     * 
     * @param nombre el nombre de la tarea.
     * @param tipo el tipo de la tarea (1 para Desarrollo, 2 para Pruebas, 3 para Documentación).
     * @param testimado el tiempo estimado para completar la tarea.
     * @param desarrollador el desarrollador asignado a la tarea.
     */
    public Tarea(String nombre, int tipo, double testimado, Desarrollador desarrollador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.testimado = testimado;
        this.treal = 0;
        this.estado = 1;
        this.desarrollador = desarrollador;
    }

    // Métodos getter y setter

    /**
     * Obtiene el nombre de la tarea.
     * 
     * @return el nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la tarea.
     * 
     * @param nombre el nuevo nombre de la tarea.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de la tarea.
     * 
     * @return el tipo de la tarea.
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la tarea.
     * 
     * @param tipo el nuevo tipo de la tarea.
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el tiempo estimado para la tarea.
     * 
     * @return el tiempo estimado.
     */
    public double getTEstimado() {
        return testimado;
    }

    /**
     * Establece el tiempo estimado para la tarea.
     * 
     * @param testimado el nuevo tiempo estimado.
     */
    public void setTEstimado(double testimado) {
        this.testimado = testimado;
    }

    /**
     * Obtiene el tiempo real trabajado en la tarea.
     * 
     * @return el tiempo real trabajado.
     */
    public double getTReal() {
        return treal;
    }

    /**
     * Establece el tiempo real trabajado en la tarea.
     * 
     * @param treal el nuevo tiempo real trabajado.
     */
    public void setTReal(double treal) {
        this.treal = treal;
    }

    /**
     * Obtiene el estado de la tarea.
     * 
     * @return el estado de la tarea.
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la tarea.
     * 
     * @param estado el nuevo estado de la tarea.
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el desarrollador asignado a la tarea.
     * 
     * @return el desarrollador asignado.
     */
    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    /**
     * Establece el desarrollador asignado a la tarea.
     * 
     * @param desarrollador el nuevo desarrollador asignado.
     */
    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    /**
     * Devuelve una representación en cadena de la tarea.
     * 
     * @return una cadena que representa la tarea.
     */
    @Override
    public String toString() {
        String[] tipos = {"Desarrollo", "Pruebas", "Documentación"};
        String[] estados = {"No iniciada", "En proceso", "Finalizada"};
        return nombre + ": Tipo: " + tipos[tipo - 1] + ", Estado: " + estados[estado - 1] + ", Asignado a: " + desarrollador;
    }
}