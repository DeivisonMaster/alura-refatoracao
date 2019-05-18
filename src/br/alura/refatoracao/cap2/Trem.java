package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade = 100;
	
	public boolean podeReservar(int qtdReservas) {
		int lugaresLivres = 0;
		
		lugaresLivres = capacidade - lugaresJaReservados();
		return lugaresLivres > qtdReservas; 
	}

	private int lugaresJaReservados() {
		int lugaresJaReservados = 0;
		
		for(Vagao vagao : vagoes) {
			lugaresJaReservados += vagao.lugaresReservados();
		}
		return lugaresJaReservados;
	}
	
}