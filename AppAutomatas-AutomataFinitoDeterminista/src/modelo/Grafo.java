package modelo;

public class Grafo {
	private Arista matriz[][];
	private Arista aristaA;
	private Arista aristaB;
	private Arista aristaC;

	public Grafo() {
		Nodo nodo0 = new Nodo(0);
		Nodo nodo1 = new Nodo(1);
		Nodo nodo2 = new Nodo(2);
		Nodo nodo3 = new Nodo(3);
		Nodo nodo4 = new Nodo(4);
		Nodo nodo5 = new Nodo(5);
		Nodo nodo6 = new Nodo(6);
		Nodo nodo7 = new Nodo(7);
		Nodo nodo8 = new Nodo(8);
		nodo8.setAceptacion(true);

		matriz = new Arista[9][9];

		aristaC = new Arista('c');
		aristaC.setDestino(nodo0);
		matriz[0][0] = aristaC;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo1);
		matriz[0][1] = aristaA;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo2);
		matriz[0][2] = aristaB;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo1);
		matriz[1][1] = aristaC;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo3);
		matriz[1][3] = aristaB;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo4);
		matriz[1][4] = aristaA;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo2);
		matriz[2][2] = aristaC;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo3);
		matriz[2][3] = aristaA;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo5);
		matriz[2][5] = aristaB;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo3);
		matriz[3][3] = aristaC;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo6);
		matriz[3][6] = aristaA;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo7);
		matriz[3][7] = aristaB;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo1);
		matriz[4][1] = aristaA;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo4);
		matriz[4][4] = aristaC;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo6);
		matriz[4][6] = aristaB;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo2);
		matriz[5][2] = aristaB;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo5);
		matriz[5][5] = aristaC;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo7);
		matriz[5][7] = aristaA;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo3);
		matriz[6][3] = aristaA;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo6);
		matriz[6][6] = aristaC;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo8);
		matriz[6][8] = aristaB;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo3);
		matriz[7][3] = aristaB;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo7);
		matriz[7][7] = aristaC;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo8);
		matriz[7][8] = aristaA;

		aristaB = new Arista('b');
		aristaB.setDestino(nodo6);
		matriz[8][6] = aristaB;

		aristaA = new Arista('a');
		aristaA.setDestino(nodo7);
		matriz[8][7] = aristaA;

		aristaC = new Arista('c');
		aristaC.setDestino(nodo8);
		matriz[8][8] = aristaC;

	}

	public Arista siguiente(char letra, int x, int y) {
		var arista = matriz[x][y];
		if (arista != null) {
			if (arista.getLetra() == letra) {
				return arista;
			} else if (y < 8) {
				return siguiente(letra, x, (y + 1));
			} else {
				return null;
			}
		}
		if (y < 8) {
			return siguiente(letra, x, (y + 1));
		} else {
			return null;
		}
	}

	public Arista[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Arista[][] matriz) {
		this.matriz = matriz;
	}


}
