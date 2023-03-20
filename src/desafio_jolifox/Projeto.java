package desafio_jolifox;

import java.util.ArrayList;

public class Projeto {
	private String nomeProjeto;
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	private ArrayList<ArrayList<Tarefa>> tarefas = new ArrayList<ArrayList<Tarefa>>();
	
	public Projeto(String nomeProjeto, ArrayList<Equipe> equipe, ArrayList<ArrayList<Tarefa>> tarefa) {
		this.nomeProjeto = nomeProjeto;
		this.equipes = equipe;
		this.tarefas = tarefa;
	}
	
	public String getNomeProjeto() {
		return this.nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	public ArrayList<Equipe> getEquipe() {
		return this.equipes;
	}
	public void setEquipe(Equipe equipe) {
		this.equipes.add(equipe);
	}
	
	public ArrayList<ArrayList<Tarefa>> getTarefa(){
		return this.tarefas;
	}
	public void setTarefa(ArrayList<Tarefa> tarefa) {
		this.tarefas.add(tarefa);
	}
	
	
}
