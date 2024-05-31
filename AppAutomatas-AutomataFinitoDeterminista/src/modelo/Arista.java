package modelo;

public class Arista {
	private char letra;
	private Nodo destino;
	
	public Arista(char letra) {
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Arista [letra=" + letra + ", destino=" + destino + "]";
	}

}
