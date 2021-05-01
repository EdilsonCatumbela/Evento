package ao.com.catumbela.Eventos;

import java.util.Scanner;

public class MiniCurso extends Evento implements Ferramentas {
	private String titulo;
	private String descricao;
	private int qtdeParticipantes;
	private double valorInscricao;

	Scanner scan = new Scanner(System.in);

	public MiniCurso() {

	}

	public MiniCurso(String titulo, String descricao, int qtdeParticipantes,
			double valorInscricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.qtdeParticipantes = qtdeParticipantes;
		this.valorInscricao = valorInscricao;
	}

	@Override
	public double calcular() {
		double percentagem;

		percentagem = (qtdeParticipantes * 0.4) * valorInscricao;
		
		return percentagem;
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
		
		System.out.println("\n--------+++++++ CADASTRO DE MINI-CURSO ++++++++-------- ");
		System.out.println("Informe o titulo: ");
		this.titulo = scan.nextLine();
		System.out.println("Informe o descrição: ");
		this.descricao = scan.nextLine();
		System.out.println("Informe a quantidade de Participantes: ");
		this.qtdeParticipantes = scan.nextInt();
		System.out.println("Informe o valor da inscrição: ");
		this.valorInscricao = scan.nextInt();
		scan.nextLine();

	}

	@Override
	public String obterTexto() {
		System.out.println("\n----------+++++++ CADASTRO EFECTUADO COM SUCESSO ++++++++----------- ");
		System.out.println("Local: "+local);
		System.out.println("Dia da semana: "+diaSemana);
		System.out.println("Contratante: "+contratante);
		System.out.println("\n-----------------+++++++ MINI-CURSO ++++++++------------------------ ");
        System.out.println("Titulo: "+titulo);
        System.out.println("Descricao: "+descricao);
        System.out.println("Quantidade de participante: "+qtdeParticipantes);
        System.out.println("Valor da inscrição: "+valorInscricao);
        System.out.println("Pecentagem: " + calcular());
		return null;
	}

}
