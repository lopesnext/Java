package aplicacao;

import DadosPessoaisJpa.Pessoas;

public class ProgramaApp {

	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas(1, "Manuel","manuel@gmail.com");
		Pessoas p2 = new Pessoas(2, "Jose","josel@gmail.com");
		Pessoas p3 = new Pessoas(3, "Maria","marial@gmail.com");
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
	}

}
