package br.com.joaomos.cm;

import br.com.joaomos.cm.modelo.Tabuleiro;
import br.com.joaomos.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
