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