/**
 * Representa un desarrollador en el sistema.
 * <p>
 * Un desarrollador tiene un nombre, un puesto (Senior o Junior) y una contraseña.
 * </p>
 * 
 * @author Luis Ángel Girón Arevalo
 * @version 1.0
 * @since 24/08/2024
 * @see Proyecto
 * @see Tarea
 */
public class Desarrollador {
    private String nombre;
    private int puesto;
    private String contrasenia;

    /**
     * Crea un nuevo desarrollador con el nombre, puesto y contraseña especificados.
     * 
     * @param nombre el nombre del desarrollador.
     * @param puesto el puesto del desarrollador (1 para Senior, 2 para Junior).
     * @param contrasenia la contraseña del desarrollador.
     */
    public Desarrollador(String nombre, int puesto, String contrasenia) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.contrasenia = contrasenia;
    }

    // Métodos getter y setter

    /**
     * Obtiene el nombre del desarrollador.
     * 
     * @return el nombre del desarrollador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del desarrollador.
     * 
     * @param nombre el nuevo nombre del desarrollador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el puesto del desarrollador.
     * 
     * @return el puesto del desarrollador.
     */
    public int getPuesto() {
        return puesto;
    }

    /**
     * Establece el puesto del desarrollador.
     * 
     * @param puesto el nuevo puesto del desarrollador.
     */
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    /**
     * Obtiene la contraseña del desarrollador.
     * 
     * @return la contraseña del desarrollador.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del desarrollador.
     * 
     * @param contrasenia la nueva contraseña del desarrollador.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Devuelve una representación en cadena del desarrollador.
     * 
     * @return una cadena que representa al desarrollador.
     */
    @Override
    public String toString() {
        return nombre + " - " + (puesto == 1 ? "Senior" : "Junior");
    }
}