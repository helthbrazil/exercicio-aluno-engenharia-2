package main;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		// INTANCIA PARA LER DO TECLADO EM JAVA
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor de N");

		// INSTANCIAR A VARIÁVEL N COM O VALOR 0
		int n = 0;

		// TRATAMENTO PARA VALORES ACIMA DE 100 PARA A VARIÁVEL N
		do {
			n = leitor.nextInt();
			if (n > 100)
				System.out.println("O valor de N deve ser menor ou igual à 100\r\n");
		} while (n > 100);

		// SALTAR LINHA
		System.out.println();

		// INSTANCIAR UM VETOR
		int[] vetor = new int[n];

		// INSTANCIAR VARIÁVEIS DE VALOR
		// DEVE-SE INICIAR OS VALORES DAS VARIÁVEIS COM UM TAMANHO BEM GRANDE
		// PARA QUE QUALQUER VALOR INFORMADO SEJA MENOR QUE AS MESMAS
		int menor1 = Integer.MAX_VALUE;
		int menor2 = Integer.MAX_VALUE;

		// INSTANCIAR VARIÁVEIS DE POSIÇÃO
		int posicaoMenor1 = 0;
		int posicaoMenor2 = 0;

		// ITERAR O VETOR POR POSIÇÃO ATUALIZANDO O VALOR DOS ELEMENTOS
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o valor do elemento na posição[" + i + "]");
			int elemento = leitor.nextInt();
			vetor[i] = elemento;

			// TESTA SE O ELEMENTO É UM NÚMERO PAR
			// PARA VERIFICAR SE É UM NÚMERO ÍMPAR DEVE-SE TROCAR POR if(elemento % 2 != 0)
			if (elemento % 2 == 0) {

				// SE O ELEMENTO DIGITADO FOR MENOR QUE A VARIÁVEL ELEMENTO DEVE-SE SUBSTIUIR
				// A VARIÁVEL MAIOR2 PELA MAIOR1, DEPOIS ATUALIZAR O VALOR DA VARIÁVEL MAIOR1
				// PELO VALOR DO ELEMENTO ATUAL
				if (elemento < menor1) {
					menor2 = menor1;
					posicaoMenor2 = posicaoMenor1;

					menor1 = elemento;
					posicaoMenor1 = i;
				} else if (elemento < menor2) { // SE O ELEMENTO FOR MENOR QUE A VARIÁVEL MAIOR2 BASTA SUBSTITUÍ-LA PELO
												// ELEMENTO ATUAL
					menor2 = elemento;
					posicaoMenor2 = i;
				}
			}
		}

		// IMPRIMIR O VETOR CRIADO
		System.out.println();
		for (int j = 0; j < n; j++) {
			System.out.print("[" + vetor[j] + "]");
		}

		// SALTAR LINHA
		System.out.println();

		// IMPRESSÃO DE RESULTADOS
		System.out.println("\r\nOs dois menores valores do vetor são: " + menor1 + " na posição " + posicaoMenor1);
		System.out.println("E " + menor2 + " na posição " + posicaoMenor2);

	}
}
