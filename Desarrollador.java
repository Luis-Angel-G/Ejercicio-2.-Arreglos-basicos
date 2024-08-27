public class Desarrollador {
	private String nombre;
	private int puesto;
	private String contrasenia;
	
	public Desarrollador(String nombre, int puesto, String contrasenia) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.contrasenia = contrasenia;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuesto() {
		return puesto;
	}
	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}