package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// SÓ PARA LER DO TECLADO EM JAVA
		Scanner leitor = new Scanner(System.in);

		// INSTANCIAR OS TAMANHOS DAS LINHAS E COLUNAS
		int n = 0, m = 0;

		// LER DO TECLADO E TRATAR SE O NÚMERO DE LINHAS É MAIOR QUE 20
		do {
			System.out.println("Informe a quantidade de linhas");
			n = leitor.nextInt();

			if (n > 20)
				System.err.println("O número de linhas deve ser menor ou igual à 20\r\n");
		} while (n > 20);

		// LER DO TECLADO E TRATAR SE O NÚMERO DE COLUNAS É MAIOR QUE 25
		do {
			System.out.println("Informe a quantidade de colunas");
			m = leitor.nextInt();

			if (m > 25)
				System.err.println("O número de colunas deve ser menor que 25\r\n");

		} while (m > 25);

		// INSTANCIAR A MATRIZ DE TAMANHO N x M
		int[][] matriz = new int[n][m];

		// INSTANCIAR UMA VÁRIAVEL PARA SOMAR OS ELEMENTOS DA PRIMEIRA LINHA E ÚLTIMA
		// COLUNA
		int somaLinhaColuna = 0;

		// INSTANCIAR UMA VARIÁVEL PARA SOMAR A QUANTIDADE DE ELEMENTOS ÍMPARES DA
		// PENÚLTIMA COLUNA
		int quantidadeImparesPenultimaColuna = 0;

		// LOOP PARA LER O VALOR DOS ELEMENTOS POR CADA POSIÇÃO DA MATRIZ
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("Informe o valor valor inteiro para a posição [" + i + "][" + j + "]");
				// LER O VALOR PARA A POSIÇÃO [I][J] DA MATRIZ
				matriz[i][j] = leitor.nextInt();

				// SE O ELEMENTO ESTIVER NA PRIMEIRA COLUNA OU ÚLTIMA COLUNA (M - 1)
				// SOMAR A VÁRIAVEL DE SOMA COM O VALOR DO ELEMENTO
				if (i == 0 || j == (m - 1)) {
					somaLinhaColuna += matriz[i][j];
				}

				// SE O ELEMENTO ESTIVER NA PENÚLTIMA COLUNA FOR ÍMPÁR (RESTO DA DIVISÃO POR 2 É
				// DIFERENTE DE 0) DEVE-SE INCREMENTAR O VALOR DA QUANTIDADE DE ÍMPARES EM 1
				
				if (j == (m - 2)) {
					if (matriz[i][j] % 2 != 0) {
						quantidadeImparesPenultimaColuna += 1;
					}
				}
			}
		}

		System.out.println();

		// IMPRIMIR A MATRIZ
		System.out.println("MATRIZ\r\n");
		
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				System.out.print(matriz[x][y] + "  ");
			}
			System.out.println();
		}

		// SALTAR UMA LINHA NA IMPRESSÃO
		System.out.println();

		// CALCULAR O VALOR DA PORCENTAGEM
		double porcentagem = (quantidadeImparesPenultimaColuna / (double) n) * 100;
		
		DecimalFormat formatadorDecimal = new DecimalFormat("#.##");

		// IMPRIMIR RESULTADOS
		System.out.println("A porcentagem dos números ímpares na penúltima coluna é:" + formatadorDecimal.format(porcentagem)+"%");
		System.out.println("A soma dos elementos da primeira linha e da ultima coluna é:" + somaLinhaColuna);

	}
}
