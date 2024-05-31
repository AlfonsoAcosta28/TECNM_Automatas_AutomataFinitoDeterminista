package pruebas;

import modelo.Grafo;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		
		var matriz = grafo.getMatriz();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
	}

}
