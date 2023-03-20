package desafio_jolifox;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Tarefa estruturarHTML = new Tarefa("Estruturar HTML", "Frontend");
		Tarefa estilizarCSS = new Tarefa("Estruturar CSS", "Frontend");
		Tarefa implementarJS = new Tarefa("Implementar JS", "Frontend");
		Tarefa estruturarBD = new Tarefa("Estruturar Banco", "Backend");
		Tarefa desenvolverAPI = new Tarefa("Desenvolver API", "Backend");
		
		Integrante milla = new Integrante("Camilla");
		Integrante hugo = new Integrante("Hugo");
		Integrante raze = new Integrante("Raze");
		Integrante neon = new Integrante("Neon");
		
		ArrayList<Integrante> integrantesEquipe1 = new ArrayList<Integrante>();
		integrantesEquipe1.add(milla);
		integrantesEquipe1.add(hugo);
		ArrayList<Integrante> integrantesEquipe2 = new ArrayList<Integrante>();
		integrantesEquipe2.add(neon);
		integrantesEquipe2.add(raze);
		
		ArrayList<Tarefa> sprint1 = new ArrayList<Tarefa>();
		sprint1.add(estruturarBD);
		sprint1.add(desenvolverAPI);
		ArrayList<Tarefa> sprint2 = new ArrayList<Tarefa>();
		sprint2.add(estruturarHTML);
		sprint2.add(estilizarCSS);
		sprint2.add(implementarJS);
		
 		Equipe equipe1 = new Equipe("Equipe Falcao", integrantesEquipe1, sprint1);
 		Equipe equipe2 = new Equipe("Equipe Valorant", integrantesEquipe2, sprint2);
 		
 		ArrayList<Equipe> equipesProjeto1 = new ArrayList<Equipe>();
 		equipesProjeto1.add(equipe1);
 		equipesProjeto1.add(equipe2);
 		
 		ArrayList<ArrayList<Tarefa>> sprintTotal = new ArrayList<ArrayList<Tarefa>>();
 		sprintTotal.add(sprint1);
 		sprintTotal.add(sprint2);
 		
 		Projeto projeto1 = new Projeto("Projeto Jolifox", equipesProjeto1, sprintTotal);
 		
 		projeto1.getTarefa().forEach(element -> element.forEach(tarefas1 -> System.out.println(tarefas1.getTitulo())));
// 		projeto1.getEquipe().forEach(element -> System.out.println(element.getNomeEquipe()));
// 		projeto1.getEquipe().forEach(element -> element.getIntegrantes().forEach(nome -> System.out.println(nome.getNomeIntegrante())));
	}
}
