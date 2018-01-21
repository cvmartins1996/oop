package com.travel;
public class App {
	public static void main(String[] a) {
		
		Desempenho desempenho = new Desempenho();
		Viagem viagem = new Viagem();
		new Carro("corolla", 8.2f);
		new Posto(4.2f);
		viagem.adicionarDestino("Pasadena");
		viagem.verificarDistancia(new Distancia(500f));
		desempenho.exibir(viagem);
	}
}
