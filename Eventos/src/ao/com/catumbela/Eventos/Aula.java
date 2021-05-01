package ao.com.catumbela.Eventos;

import java.util.Scanner;

public class Aula extends Evento implements Ferramentas {
	private String nomeDisciplina;
	private int qtdeHoras;
	private double valor;
	
	Scanner scan = new Scanner(System.in);

	public Aula() {

	}

	public Aula(String nomeDisciplina, int qtdeHoras, double valor) {
		this.nomeDisciplina = nomeDisciplina;
		this.qtdeHoras = qtdeHoras;
		this.valor = valor;
	}

	@Override
	public void cadastro() {
		System.out.println("\n----------+++++++ CADASTRO DE EVENTO ++++++++----------- ");
		System.out.println("Informe o local: ");
		this.local = scan.nextLine();
		System.out.println("Informe o dia da Semana: ");
		this.diaSemana = scan.nextLine();
		System.out.println("Informe o contratante: ");
		this.contratante = scan.nextLine();
		System.out.println("\n----------+++++++ CADASTRO DE AULA ++++++++------------ ");
		System.out.println("Informe o nome da Disciplina");
		this.nomeDisciplina = scan.nextLine();
		System.out.println("Digite a quantidade de horas");
		this.qtdeHoras = scan.nextInt();
		System.out.println("Digite o valor");
		this.valor = scan.nextDouble();
		scan.nextLine();
	}

	@Override
	public String obterTexto() {
		System.out.println("\n----------+++++++ CADASTRO EFECTUADO COM SUCESSO ++++++++----------- ");
		System.out.println("Local: "+local);
		System.out.println("Dia da semana: "+diaSemana);
		System.out.println("Contratante: "+contratante);
		System.out.println("\n-----------------+++++++ AULA ++++++++------------------------");
		System.out.println("Disciplina: "+nomeDisciplina);
		System.out.println("Horas: "+qtdeHoras);
		System.out.println("Valor: "+valor);
		return null;
	}

	@Override
	public double calcular() {
		valor = (qtdeHoras * valor)+ 0.15 * (qtdeHoras * valor);
		return valor;
	}

}
