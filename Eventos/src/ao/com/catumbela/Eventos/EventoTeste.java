package ao.com.catumbela.Eventos;

import java.util.Scanner;

public class EventoTeste {

	private static Scanner scan;

	public static void main(String[] args) {
		final int max = 10;
		int cont = 0;
		int opcao = 0;

		scan = new Scanner(System.in);

		System.out
				.println("=========== SISTEMA DE CADASTRAMENTO DE EVENTOS ============");
		System.out
				.println("SELECIONE A OPÇÃO APROPRIADA [1] AULA [2] MINI-CURSO: ");
		opcao = scan.nextInt();

		while (opcao >= 0 && cont <= 2 && cont < max) {
			switch (opcao) {
			case 1: {
				Aula aula = new Aula();
				aula.cadastro();
				aula.calcular();
				aula.obterTexto();

				cont++;
				break;
			}
			case 2: {
				MiniCurso mini = new MiniCurso();
				mini.cadastro();
				mini.calcular();
				cont++;
				mini.obterTexto();
				break;
			}
			}
			System.out
					.print("\nEXECUTAR OUTRA OPERAÇÃO > SELECIONE A OPÇÃO APROPRIADA [1] AULA [2] MINI-CURSO: \n");
			opcao = scan.nextInt();
			if (cont == max) {
				System.out.println("\n==================================");
				System.out.println("ERRO: LIMITE DE CADASTROS ATINGIDO");
			}

		}

	}
}
