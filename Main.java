import java.util.Date;

public class Main {
	private int proyectoCount;
	private String maxproyectos = "";
	Proyecto[] proyectos;
	private int desarrolladorCount;
	private String maxdesarrolladores = "";
	Desarrollador[] desarrolladores;
	
	public Main(int j, int k) {
		proyectos = new Proyecto[j];
		proyectoCount = 0;
		desarrolladores = new Desarrollador[k];
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
	public String desarrolladoresJ() {
		for (z = 0; z < desarrolladores.length; z++)
			if (desarrolladores[z].getPuesto() == 2){
				return desarrolladores[z];
			}
	}
	public String desarrolladoresS() {
		for (z = 0; z < desarrolladores.length; z++)
			if (desarrolladores[z].getPuesto() == 1){
				return desarrolladores[z];
			}
	}
}