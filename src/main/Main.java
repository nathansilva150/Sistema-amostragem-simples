package main;

import service.Servico;
import view.Visualizar;

public class Main {

	public static void main(String[] args) {

		Visualizar visualizar = new Visualizar();
		Servico servico = new Servico();
		int opcaoMenu = 1;

		do {
			opcaoMenu = visualizar.MenuPrincipal();
			servico.gerenciarSistema(opcaoMenu);
		} while (opcaoMenu != 0);

		visualizar.mensagmProgramaEncerrado();
	}

}
