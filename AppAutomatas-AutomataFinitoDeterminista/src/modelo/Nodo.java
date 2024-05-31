package modelo;

public class Nodo {
	private int posicion;
	private boolean aceptacion;
	
	public Nodo(int posicion) {
		this.posicion = posicion;
		this.aceptacion = false;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isAceptacion() {
		return aceptacion;
	}

	public void setAceptacion(boolean aceptacion) {
		this.aceptacion = aceptacion;
	}

	@Override
	public String toString() {
		return "Nodo [posicion=" + posicion + ", aceptacion=" + aceptacion + "]";
	}

	
	
}
