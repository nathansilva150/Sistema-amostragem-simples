package view;

import java.util.Scanner;

public class Visualizar {
	Scanner leia;

	public Visualizar() {
		leia = new Scanner(System.in);
	}

	public int MenuPrincipal() {
		System.out.println("\n======< Amostragem simples >======");
		System.out.println("| 1 - Calcular amostragem        |");
		System.out.println("| 0 - Encerrar programa          |");
		System.out.println("==================================");
		System.out.print("Escolha uma opção: ");
		return leia.nextInt();
	}

	public int repeticaoRegistradorDeNumeros() {
		System.out.print("\nDigite quantos números deseja registrar no conjunto: ");
		return leia.nextInt();
	}

	public double registrarNumero(int indice) {
		System.out.print("Digite o " + (indice + 1) + "º número que deseja registrar: ");
		return leia.nextDouble();
	}

	public int quantidadeDeAmostragem() {
		System.out.print("\nDigite quantos números deseja pegar do conjunto para amostragem: ");
		return leia.nextInt();
	}

	public int mensagemForaDoLimiteConjunto() {
		System.out.println("\nO valor informado é maior que o tamanho do conjunto!");
		System.out.print("Tente novamente. Quantos números deseja pegar do conjunto para amostragem: ");
		return leia.nextInt();
	}

	public void mensagmProgramaEncerrado() {
		System.out.println("\nPrograma encerrado.");
	}

}
