package Exercicio8_2;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Diego", noticiario);
	noticiario.notificaNoticia("Palmeiras N�O tem mundial", 1, 2, "Topico:Futebol");
	new Consumidor("Matheus", noticiario);
	noticiario.notificaNoticia("Ford lan�a um novo carro", 2, 2, "Topico:Automobilismo");
	
	
	}
}
