package br.com.entra21.orientacao.a.objetos.principal.aula04.conceitos.poo;

public class Ponto {
	private float coordenadaX;
	private float coordenadaY;
	
	public Ponto() {
		super();
	}

	public Ponto(float coordenadaX, float coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public float getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(float coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public float getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(float coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	
}
