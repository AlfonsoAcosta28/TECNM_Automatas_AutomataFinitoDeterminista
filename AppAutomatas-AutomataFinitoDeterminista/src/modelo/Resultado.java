package modelo;

public class Resultado {
	private int x;
	private Arista arista;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Arista getArista() {
		return arista;
	}
	public void setArista(Arista arista) {
		this.arista = arista;
	}
	@Override
	public String toString() {
		return "Resultado [x=" + x + ", arista=" + arista + "]";
	}
}
