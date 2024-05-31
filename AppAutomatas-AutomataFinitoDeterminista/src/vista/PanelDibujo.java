package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import modelo.Circulo;
import modelo.Resultado;

public class PanelDibujo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Resultado> resultados = new ArrayList<>();
	private Circulo circulo = new Circulo();

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int radio = 30;
		int yCentro = getHeight() / 2;
		int xCentro = getWidth() / 2;
		int distanciaX = 120;
		int distanciaY = 200;
		int distanciaStringX = 50;

		Font font = new Font("Product Sans", Font.BOLD, 24);
		g.setFont(font);
		g.setColor(Color.WHITE);

		String a = "a";
		String b = "b";
		String c = "c";

		// Lineas nodo 0
		drawLine(g, xCentro - (distanciaX * 6) + radio, yCentro, xCentro - (distanciaX * 4) - radio,
				yCentro - distanciaY);
		drawLine(g, xCentro - (distanciaX * 6) + radio, yCentro, xCentro - (distanciaX * 4) - radio,
				yCentro + distanciaY);

		// Lineas nodo 1
		drawLine(g, xCentro - (distanciaX * 4) + radio, yCentro - distanciaY, xCentro - radio, yCentro - distanciaY);
		drawLine(g, xCentro - (distanciaX * 4) + radio, yCentro - distanciaY, xCentro - (distanciaX * 2) - radio,
				yCentro);

		// Lineas nodo 2
		drawLine(g, xCentro - (distanciaX * 4) + radio, yCentro + distanciaY, xCentro - (distanciaX * 2) - radio,
				yCentro);
		drawLine(g, xCentro - (distanciaX * 4) + radio, yCentro + distanciaY, xCentro - radio, yCentro + distanciaY);

		// Lineas nodo 3
		drawLine(g, xCentro - (distanciaX * 2) + radio, yCentro, xCentro + (distanciaX * 4) - radio + 15,
				yCentro - distanciaY + 25);
		drawLine(g, xCentro - (distanciaX * 2) + radio, yCentro, xCentro + (distanciaX * 4) - radio + 15,
				yCentro + distanciaY - 25);

		// Lineas nodo 4
		drawLine(g, xCentro + radio, yCentro - distanciaY, xCentro + (distanciaX * 4) - radio, yCentro - distanciaY);
		drawLine(g, xCentro + radio - 30, yCentro - distanciaY - 30, xCentro - (distanciaX * 4) + radio - 30,
				yCentro - distanciaY - 30);

		// Lineas nodo 5
		drawLine(g, xCentro + radio, yCentro + distanciaY, xCentro + (distanciaX * 4) - radio, yCentro + distanciaY);
		drawLine(g, xCentro + radio - 30, yCentro + distanciaY + 30, xCentro - (distanciaX * 4) + radio - 30,
				yCentro + distanciaY + 30);

		// Lineas nodo 6
		drawLine(g, xCentro + (distanciaX * 4) - radio, yCentro - distanciaY, xCentro - (distanciaX * 2) + radio - 30,
				yCentro - 30);
		drawLine(g, xCentro + (distanciaX * 4) + radio, yCentro - distanciaY, xCentro + (distanciaX * 6),
				yCentro - radio);

		// Lineas nodo 7
		drawLine(g, xCentro + (distanciaX * 4) - radio, yCentro + distanciaY, xCentro - (distanciaX * 2) + radio - 30,
				yCentro + 30);
		drawLine(g, xCentro + (distanciaX * 4) + radio, yCentro + distanciaY, xCentro + (distanciaX * 6),
				yCentro + radio);

		// Lineas nodo 7
		drawLine(g, xCentro + (distanciaX * 6) - radio, yCentro, xCentro + (distanciaX * 4),
				yCentro - distanciaY + radio);
		drawLine(g, xCentro + (distanciaX * 6) - radio, yCentro, xCentro + (distanciaX * 4),
				yCentro + distanciaY - radio);

		// Nodos
		drawNode(g, xCentro - (distanciaX * 6), yCentro, radio);
		drawNode(g, xCentro - (distanciaX * 4), yCentro - distanciaY, radio);
		drawNode(g, xCentro - (distanciaX * 4), yCentro + distanciaY, radio);
		drawNode(g, xCentro - (distanciaX * 2), yCentro, radio);
		drawNode(g, xCentro, yCentro - distanciaY, radio);
		drawNode(g, xCentro, yCentro + distanciaY, radio);
		drawNode(g, xCentro + (distanciaX * 4), yCentro - distanciaY, radio);
		drawNode(g, xCentro + (distanciaX * 4), yCentro + distanciaY, radio);
		drawNode(g, xCentro + (distanciaX * 6), yCentro, radio);

		// Letras nodo 0
		g.drawString(a, xCentro - (distanciaX * 6) + distanciaStringX, yCentro - 20);
		g.drawString(b, xCentro - (distanciaX * 6) + distanciaStringX, yCentro + 40);
		g.drawString(c, xCentro - (distanciaX * 6) - 5, yCentro - radio);

		// Letras nodo 1
		g.drawString(a, xCentro - (distanciaX * 4) + distanciaStringX, yCentro - distanciaY + 5);
		g.drawString(b, xCentro - (distanciaX * 4) + distanciaStringX, yCentro - distanciaY + 40);
		g.drawString(c, xCentro - (distanciaX * 4) - 5, yCentro - distanciaY - radio);

		// Letras nodo 2
		g.drawString(a, xCentro - (distanciaX * 4) + distanciaStringX, yCentro + distanciaY - 25);
		g.drawString(b, xCentro - (distanciaX * 4) + distanciaStringX, yCentro + distanciaY + 5);
		g.drawString(c, xCentro - (distanciaX * 4) - 5, yCentro + distanciaY - radio);

		// Letras nodo 3
		g.drawString(a, xCentro - (distanciaX * 2) + distanciaStringX + 20, yCentro - 5);
		g.drawString(b, xCentro - (distanciaX * 2) + distanciaStringX + 20, yCentro + 20);
		g.drawString(c, xCentro - (distanciaX * 2) - 5, yCentro - radio);

		// Letras nodo 4
		g.drawString(a, xCentro - distanciaStringX, yCentro - distanciaY - radio + 5);
		g.drawString(b, xCentro + distanciaStringX, yCentro - distanciaY + 5);
		g.drawString(c, xCentro - 5, yCentro - distanciaY - radio);

		// Letras nodo 5
		g.drawString(a, xCentro + distanciaStringX, yCentro + distanciaY + 5);
		g.drawString(b, xCentro - distanciaStringX, yCentro + distanciaY + radio + 5);
		g.drawString(c, xCentro - 5, yCentro + distanciaY - radio);

		// Letras nodo 6
		g.drawString(a, xCentro + (distanciaX * 4) - distanciaStringX - 40, yCentro - distanciaY + 20);
		g.drawString(b, xCentro + (distanciaX * 4) + distanciaStringX, yCentro - distanciaY + 30);
		g.drawString(c, xCentro + (distanciaX * 4) - 5, yCentro - distanciaY - radio);

		// Letras nodo 7
		g.drawString(a, xCentro + (distanciaX * 4) + distanciaStringX, yCentro + distanciaY - 15);
		g.drawString(b, xCentro + (distanciaX * 4) - distanciaStringX - 40, yCentro + distanciaY - 10);
		g.drawString(c, xCentro + (distanciaX * 4) - 5, yCentro + distanciaY - radio);

		// Letras nodo 8
		g.drawString(a, xCentro + (distanciaX * 6) - distanciaStringX - 20, yCentro + 30);
		g.drawString(b, xCentro + (distanciaX * 6) - distanciaStringX - 20, yCentro - 20);
		g.drawString(c, xCentro + (distanciaX * 6) - 5, yCentro - radio);

		if (resultados.size() > 0) {
			int i = resultados.size() - 1;
			//			for (int i = 0; i < resultados.size(); i++) {
			g.setColor(new Color(246, 107, 14));
			if (resultados.get(i).getArista().getDestino().getPosicion() == 0) {
				circulo.setX(xCentro - (distanciaX * 6));
				circulo.setY(yCentro);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 1) {
				circulo.setX(xCentro - (distanciaX * 4));
				circulo.setY(yCentro - distanciaY);
				circulo.setRadius(radio);

			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 2) {
				circulo.setX(xCentro - (distanciaX * 4));
				circulo.setY(yCentro + distanciaY);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 3) {
				circulo.setX(xCentro - (distanciaX * 2));
				circulo.setY(yCentro);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 4) {
				circulo.setX(xCentro);
				circulo.setY(yCentro - distanciaY);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 5) {
				circulo.setX(xCentro);
				circulo.setY(yCentro + distanciaY);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 6) {
				circulo.setX(xCentro + (distanciaX * 4));
				circulo.setY(yCentro - distanciaY);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 7) {
				circulo.setX(xCentro + (distanciaX * 4));
				circulo.setY(yCentro + distanciaY);
				circulo.setRadius(radio);
			}
			if (resultados.get(i).getArista().getDestino().getPosicion() == 8) {
				circulo.setX(xCentro + (distanciaX * 6));
				circulo.setY(yCentro);
				circulo.setRadius(radio);
			}
			//			}
			drawFillNode(g);
		}
	}

	@SuppressWarnings("unused")
	private void drawNode(Graphics g, int x, int y, int radius) {
		g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
	}

	@SuppressWarnings("unused")
	private void drawFillNode(Graphics g) {
		g.fillOval(circulo.getX() - circulo.getRadius(), circulo.getY() - circulo.getRadius(), 2 * circulo.getRadius(), 2 * circulo.getRadius());
	}

	@SuppressWarnings("unused")
	private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
		g.drawLine(x1, y1, x2, y2);
	}

	public List<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}

}
