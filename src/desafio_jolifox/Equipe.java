package desafio_jolifox;

import java.util.ArrayList;

public class Equipe {
	private String nomeEquipe;
	private ArrayList<Integrante> integrantes ;
	private ArrayList<Tarefa> tarefas;
	
	public Equipe(String nomeEquipe, ArrayList<Integrante> integrante, ArrayList<Tarefa> tarefa) {
		this.nomeEquipe = nomeEquipe;
		this.integrantes = integrante;
		this.tarefas = tarefa;
	}
	
	public String getNomeEquipe() {
		return this.nomeEquipe;
	}
	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	
	public ArrayList<Integrante> getIntegrantes(){
		return this.integrantes;
	}
	public void setIntegrante(Integrante integrante) {
		this.integrantes.add(integrante);
	}
	
	public ArrayList<Tarefa> getTarefas() {
		return this.tarefas;
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	
}
