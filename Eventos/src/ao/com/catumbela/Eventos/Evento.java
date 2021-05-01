package ao.com.catumbela.Eventos;

public abstract class Evento {
	 String local;
	 String diaSemana;
	 String contratante;


	public Evento() {

	}

	public Evento(String local, String diaSemana, String contratante) {
		this.local = local;
		this.diaSemana = diaSemana;
		this.contratante = contratante;
	}

	public abstract void cadastro();

	public abstract String obterTexto();

}
