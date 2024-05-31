package modelo;

import java.util.ArrayList;
import java.util.List;

public class Automata {
	private Grafo grafo;
	private List<Resultado> resultados;
	
	public Automata() {
		grafo = new Grafo();
	}
	
	public List<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}
	
	public Arista calcular(String cadena) {
		resultados = new ArrayList<>();
		cadena = cadena.toLowerCase();
		int x = 0;
		int y = 0;
		Arista arista = new Arista('x');
		for (char letra : cadena.toCharArray()) {
			arista = grafo.siguiente(letra,x,y);
			
			Resultado resultado = new Resultado();
			resultado.setArista(arista);
			resultado.setX(x);
			resultados.add(resultado);
			
			x = arista.getDestino().getPosicion();
		}
		return arista;
	}	
}
