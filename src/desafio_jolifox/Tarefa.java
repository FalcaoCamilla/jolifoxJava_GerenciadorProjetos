package desafio_jolifox;

public class Tarefa {
	private String tituloTarefa;
	private String tagTarefa;

	public Tarefa(String tituloTarefa, String tagTarefa) {
		this.tituloTarefa = tituloTarefa;
		this.tagTarefa = tagTarefa;
	}
	
	public String getTagTarefa() {
		return this.tagTarefa;
	}
	public void setTagTarefa(String tagTarefa) {
		this.tagTarefa = tagTarefa;
	}

	public String getTitulo() {
		return this.tituloTarefa;
	}
	public void setTituloTarefa(String tituloTarefa) {
		this.tituloTarefa = tituloTarefa;
	}
	
}
