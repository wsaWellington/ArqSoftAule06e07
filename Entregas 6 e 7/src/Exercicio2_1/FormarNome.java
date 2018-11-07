package Exercicio2_1;

import Exercicio2_1.Aplicacao;
import Exercicio2_1.Nome;

public class FormarNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Aplicacao(nome, sobrenome);
	}
}
