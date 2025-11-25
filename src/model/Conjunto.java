package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Conjunto {
	List<Double> conjunto;
	List<Double> amostragem;
	List<Integer> indices;

	public Conjunto() {
		conjunto = new ArrayList<>();
		amostragem = new ArrayList<>();
		indices = new ArrayList<>();
	}

	public void inserirDados(double valor) {
		conjunto.add(valor);
	}

	public void exibirConjunto() {
		for (double num : conjunto) {
			System.out.println(num);
		}
	}

	public int tamanhoConjunto() {
		return conjunto.size();
	}

	public double selecionarValorConjunto(int indice) {
		return conjunto.get(indice);
	}

	public void inserirAmostragem(double valorAmostra) {
		amostragem.add(valorAmostra);
	}

	public void exibirAmostragem() {
		System.out.println("Resultado da amostragem simples: " + amostragem);
	}

	public void limparConjuntos() {
		conjunto.clear();
		amostragem.clear();
	}

	public void InserirIndice(int indice) {
		indices.add(indice);
	}

	public void sortearIndices() {
		Collections.shuffle(indices);
	}

	public int getIndice(int numero) {
		return indices.get(numero);
	}

}
