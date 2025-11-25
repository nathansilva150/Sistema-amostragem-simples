package service;

import model.Conjunto;
import view.Visualizar;

public class Servico {
	Visualizar visualizar = new Visualizar();
	Conjunto conjunto = new Conjunto();

	public void gerenciarSistema(int opcao) {

		switch (opcao) {
		case 1:
			int repeticao = visualizar.repeticaoRegistradorDeNumeros();

			for (int i = 0; i < repeticao; i++) {
				double numero = visualizar.registrarNumero(i);
				conjunto.inserirDados(numero);
			}

			// amostragem
			int repeticaoAmostra = visualizar.quantidadeDeAmostragem();
			int tamanhoConjunto = conjunto.tamanhoConjunto();

			while (repeticaoAmostra > tamanhoConjunto) {
				repeticaoAmostra = visualizar.mensagemForaDoLimiteConjunto();
			}

			// Insere os índices do 0 até a quantidade de repetições proposta
			for (int i = 0; i < repeticaoAmostra; i++) {
				int indice = i;
				conjunto.InserirIndice(indice);
				conjunto.sortearIndices();
			}

			for (int i = 0; i < repeticaoAmostra; i++) {
				int indice = conjunto.getIndice(i);
				double numeroEscolhido = conjunto.selecionarValorConjunto(indice);
				conjunto.inserirAmostragem(numeroEscolhido);
			}

			// Limpeza de conjunto e amostragem para liberar o Array para a próxima operação
			conjunto.exibirAmostragem();
			conjunto.limparConjuntos();
			break;

		case 2:
			conjunto.exibirConjunto();
			break;
		}

	}

}
