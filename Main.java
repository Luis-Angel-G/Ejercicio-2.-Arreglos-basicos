import java.util.Date;

/**
 * Clase principal que gestiona proyectos y desarrolladores.
 * <p>
 * Esta clase permite agregar proyectos y desarrolladores a la lista, y proporciona métodos para obtener los proyectos y desarrolladores,
 * así como para filtrar desarrolladores según su puesto.
 * </p>
 * 
 * @author Luis Ángel Girón Arevalo
 * @version 1.0
 * @since 24/08/2024
 */
public class Main {
    private int proyectoCount;
    private String maxproyectos = "";
    Proyecto[] proyectos;
    private int desarrolladorCount;
    private String maxdesarrolladores = "";
    Desarrollador[] desarrolladores;

    /**
     * Constructor de la clase Main.
     * <p>
     * Inicializa los arreglos de proyectos y desarrolladores con el tamaño especificado.
     * </p>
     * 
     * @param j el tamaño inicial del arreglo de proyectos.
     * @param k el tamaño inicial del arreglo de desarrolladores.
     */
    public Main(int j, int k) {
        proyectos = new Proyecto[j];
        proyectoCount = 0;
        desarrolladores = new Desarrollador[k];
        desarrolladorCount = 0;
    }

    /**
     * Agrega un proyecto al sistema.
     * <p>
     * Si se ha alcanzado el límite máximo de proyectos, se establece un mensaje indicando que no se pueden agregar más proyectos.
     * </p>
     * 
     * @param proyecto el proyecto a agregar.
     */
    public void agregarProyecto(Proyecto proyecto) {
        if (proyectoCount < proyectos.length) {
            proyectos[proyectoCount] = proyecto;
            proyectoCount++;
        } else {
            maxproyectos = "No se pueden agregar mas proyectos.";
        }
    }

    /**
     * Obtiene el arreglo de proyectos.
     * 
     * @return el arreglo de proyectos.
     */
    public Proyecto[] getProyectos() {
        return proyectos;
    }

    /**
     * Agrega un desarrollador al sistema.
     * <p>
     * Si se ha alcanzado el límite máximo de desarrolladores, se establece un mensaje indicando que no se pueden agregar más desarrolladores.
     * </p>
     * 
     * @param desarrollador el desarrollador a agregar.
     */
    public void agregarDesarrollador(Desarrollador desarrollador) {
        if (desarrolladorCount < desarrolladores.length) {
            desarrolladores[desarrolladorCount] = desarrollador;
            desarrolladorCount++;
        } else {
            maxdesarrolladores = "No se pueden agregar mas desarrolladores.";
        }
    }

    /**
     * Obtiene el arreglo de desarrolladores.
     * 
     * @return el arreglo de desarrolladores.
     */
    public Desarrollador[] getDesarrolladores() {
        return desarrolladores;
    }

    /**
     * Obtiene un arreglo de desarrolladores junior.
     * <p>
     * Filtra los desarrolladores del sistema que tienen el puesto de junior (representado por el valor 2).
     * </p>
     * 
     * @return el arreglo de desarrolladores junior.
     */
    public Desarrollador[] desarrolladoresJ() {
        Desarrollador[] desj = new Desarrollador[desarrolladorCount];
        int index = 0;
        for (Desarrollador d : desarrolladores) {
            if (d != null && d.getPuesto() == 2) {
                desj[index] = d;
                index++;
            }
        }
        return java.util.Arrays.copyOf(desj, index);
    }

    /**
     * Obtiene un arreglo de desarrolladores senior.
     * <p>
     * Filtra los desarrolladores del sistema que tienen el puesto de senior (representado por el valor 1).
     * </p>
     * 
     * @return el arreglo de desarrolladores senior.
     */
    public Desarrollador[] desarrolladoresS() {
        Desarrollador[] dess = new Desarrollador[desarrolladorCount];
        int index1 = 0;
        for (Desarrollador d : desarrolladores) {
            if (d != null && d.getPuesto() == 1) {
                dess[index1] = d;
                index1++;
            }
        }
        return java.util.Arrays.copyOf(dess, index1);
    }
}