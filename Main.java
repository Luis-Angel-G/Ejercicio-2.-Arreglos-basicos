import java.util.Date;

public class Main {
	private int proyectoCount;
	private String maxproyectos = "";
	Proyecto[] proyectos;
	private int desarrolladorCount;
	private String maxdesarrolladores = "";
	Desarrollador[] desarrolladores;
	
	public Main(int j, int k) {
		Proyecto[] proyectos = new Proyecto[j];
		proyectoCount = 0;
		Desarrollador[] desarrolladores = new Desarrollador[k];
		desarrolladorCount = 0;
	}
	public void agregarProyecto(Proyecto proyecto) {
		if (proyectoCount < proyectos.length) {
            proyectos[proyectoCount] = proyecto;
            proyectoCount++;
        } else {
            maxproyectos = "No se pueden agregar mas proyectos.";
        }
	}
	public Proyecto[] getProyectos() {
        return proyectos;
    }
	public void agregarDesarrollador(Desarrollador desarrollador) {
		if (desarrolladorCount < desarrolladores.length) {
            desarrolladores[desarrolladorCount] = desarrollador;
            desarrolladorCount++;
        } else {
            maxdesarrolladores = "No se pueden agregar mas desarrolladores.";
        }
	}
	public Desarrollador[] getDesarrolladores() {
        return desarrolladores;
    }
}