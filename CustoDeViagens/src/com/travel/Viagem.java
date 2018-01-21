package com.travel;

public class Viagem {

	private String nome;
	private Distancia distancia;
	private Carro carro;
	private Posto posto;

	public String getNome() {
		return nome;
	}

	public float getCusto() {
		return totalDoCusto();
	}

	private float totalDoCusto() {
		float totalDoCusto = 0;
		totalDoCusto = (distancia.getValor()/carro.getValor() * posto.getValor());
		return totalDoCusto;
	}

	public void verificarDistancia(Distancia distancia) {
		this.distancia = distancia;
	}

	public void adicionarDestino(String nome) {
		this.nome =  nome;
	}

}
